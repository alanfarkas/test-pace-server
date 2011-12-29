/**
 * 
 */
package com.pace.settings.ui;

import com.pace.base.mdb.PafConnectionProps;
import com.pace.settings.PaceSettingsApplication;
import com.pace.settings.PaceSettingsConstants;
import com.vaadin.data.Item;
import com.vaadin.data.Property;
import com.vaadin.data.util.BeanItem;

/**
 * MDB Datasource form
 * 
 * @author JMilliron
 * 
 */
public class MDBDatasourceForm extends PaceSettingsForm implements
		Property.ValueChangeListener {

	private static final long serialVersionUID = -679608093955614805L;

	private boolean newMdbDatasource = false;

	private PafConnectionProps pafConnectionProps = null;

	public MDBDatasourceForm(PaceSettingsApplication serverSettingsApplication) {
		super(serverSettingsApplication);
		getFooter().setVisible(false);
	}

	@Override
	protected void setupForm() {

		setWriteThrough(false);

		setPaceSettingsDefaultFactory(serverSettingsApplication
				.getMdbDatasourceFieldFactory());

		setFormFieldFactory(getPaceSettingsDefaultFactory());

		setImmediate(true);

	}

	@Override
	protected void saveForm() {

		if (newMdbDatasource) {

			serverSettingsApplication.getMdbDatasourceContainer().addItem(
					pafConnectionProps);

			setItemDataSource(null);

			serverSettingsApplication.getMdbDatasourceTable().select(
					pafConnectionProps);
			newMdbDatasource = false;
			pafConnectionProps = null;

		} else {

			setItemDataSource(null);
			newMdbDatasource = false;
			pafConnectionProps = null;
		}

		((PaceSettingsApplication) getApplication())
				.getMdbDatasourceContainer().saveData();

	}

	@Override
	protected void cancelForm() {

		if (newMdbDatasource) {

			newMdbDatasource = false;

		}
		pafConnectionProps = null;
		setItemDataSource(null);

	}

	@Override
	protected void loadSettings() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.pace.settings.ui.PaceSettingsForm#setItemDataSource(com.vaadin.data
	 * .Item)
	 */
	@Override
	public void setItemDataSource(Item newDataSource) {
		newMdbDatasource = false;
		if (newDataSource != null) {
			super.setItemDataSource(newDataSource, serverSettingsApplication
					.getMdbDatasourceFieldFactory().getFormOrderList());
			getFooter().setVisible(true);

			if (newDataSource instanceof BeanItem) {
				pafConnectionProps = (PafConnectionProps) ((BeanItem) newDataSource)
						.getBean();
			}

			serverSettingsApplication.getMdbDatasourceTable().getValue();

			save.setCaption(PaceSettingsConstants.UPDATE_BUTTON_LABEL);

		} else {
			super.setItemDataSource(newDataSource);
			getFooter().setVisible(false);
			pafConnectionProps = null;
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.vaadin.ui.Form#isValid()
	 */
	@Override
	public boolean isValid() {

		boolean isValid = super.isValid();

		if (isValid) {

			String newName = (String) getField(MDBDatasourceFieldFactory.NAME)
					.getValue();

			boolean nameExists = false;

			for (PafConnectionProps pafConnectionProps : serverSettingsApplication
					.getMdbDatasourceContainer().getItemIds()) {

				if (pafConnectionProps.getName() != null
						&& pafConnectionProps.getName().trim().equals(newName)) {

					nameExists = true;

					break;

				}

			}

			if (nameExists && newMdbDatasource) {

				isValidNotificationOverrideError = "Name " + newName
						+ " already exists.  Please choose a different name.";
				isValid = false;

			} else if (nameExists && !newMdbDatasource) {

				if (!pafConnectionProps.getName().equals(newName)) {

					isValidNotificationOverrideError = "Name "
							+ newName
							+ " already exists.  Please choose a different name.";
					isValid = false;

				}

			}

			String connectionString = (String) getField(
					MDBDatasourceFieldFactory.CONNECTION_STRING).getValue();

			try {

				PafConnectionProps.parseConnString(connectionString);

			} catch (IllegalArgumentException iae) {

				isValidNotificationOverrideError = getField(
						MDBDatasourceFieldFactory.CONNECTION_STRING)
						.getCaption()
						+ " content is invalid.  Content needs to be in key=value form seperated by ';'.";
				isValid = false;

			}

		}

		return isValid;
	}

	public void addMDBDatasource() {

		pafConnectionProps = new PafConnectionProps();
		setItemDataSource(new BeanItem<PafConnectionProps>(pafConnectionProps));
		newMdbDatasource = true;
		save.setCaption(PaceSettingsConstants.ADD_BUTTON_LABEL);
	}

	public void copyMDBDatasource() {

		if (serverSettingsApplication.getMdbDatasourceTable().getValue() != null) {

			PafConnectionProps selectedConnectionProps = serverSettingsApplication
					.getMdbDatasourceContainer()
					.getItem(
							serverSettingsApplication.getMdbDatasourceTable()
									.getValue()).getBean();

			try {
				pafConnectionProps = selectedConnectionProps.clone();
				pafConnectionProps.setName("Copy of "
						+ selectedConnectionProps.getName());

				setItemDataSource(new BeanItem<PafConnectionProps>(
						pafConnectionProps));
				save.setCaption(PaceSettingsConstants.ADD_BUTTON_LABEL);
				newMdbDatasource = true;
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}

		}

	}

}
