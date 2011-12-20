package com.pace.settings.ui;

import com.pace.settings.PaceSettingsApplication;
import com.vaadin.data.Item;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Form;
import com.vaadin.ui.HorizontalLayout;

/**
 * 
 * @author JMilliron
 * 
 */
public abstract class PaceSettingsForm extends Form implements ClickListener {

	private static final long serialVersionUID = 6004832755149813646L;

	private PaceSettingsDefaultFieldFactory paceSettingsDefaultFactory;

	protected Button save = new Button("Save", (ClickListener) this);

	protected Button cancel = new Button("Cancel", (ClickListener) this);

	protected PaceSettingsApplication serverSettingsApplication;

	protected Object inputObject;

	public PaceSettingsForm(PaceSettingsApplication serverSettingsApplication) {

		this.serverSettingsApplication = serverSettingsApplication;

		createButtonBar();
		setupForm();

	}

	protected abstract void setupForm();

	protected abstract void saveForm();

	protected abstract void cancelForm();

	protected abstract void loadSettings();

	private void createButtonBar() {

		HorizontalLayout footer = new HorizontalLayout();

		footer.setSpacing(true);
		footer.addComponent(save);
		footer.addComponent(cancel);

		setFooter(footer);

	}

	@Override
	public void setItemDataSource(Item newDataSource) {

		if (newDataSource != null) {

			if (paceSettingsDefaultFactory == null) {

				super.setItemDataSource(newDataSource);

			} else {

				super.setItemDataSource(newDataSource,
						paceSettingsDefaultFactory.getFormOrderList());

			}

		} else {
			super.setItemDataSource(null);
		}

	}

	@Override
	public void buttonClick(ClickEvent event) {

		Button source = event.getButton();

		// on save
		if (source == save) {

			if (!isValid()) {

				serverSettingsApplication.getMainWindow().showNotification(
						"Errors on the form.  Check required fields.");

				return;
			}

			// commit changes to data source
			commit();

			saveForm();

			serverSettingsApplication.getMainWindow().showNotification("Saved");

			// on cancel
		} else if (source == cancel) {

			// discard changes
			discard();

			cancelForm();

			serverSettingsApplication.getMainWindow().showNotification(
					"Canceled");
			
			

		}

	}

	/**
	 * @return the paceSettingsDefaultFactory
	 */
	public PaceSettingsDefaultFieldFactory getPaceSettingsDefaultFactory() {
		return paceSettingsDefaultFactory;
	}

	/**
	 * @param paceSettingsDefaultFactory
	 *            the paceSettingsDefaultFactory to set
	 */
	public void setPaceSettingsDefaultFactory(
			PaceSettingsDefaultFieldFactory paceSettingsDefaultFactory) {
		this.paceSettingsDefaultFactory = paceSettingsDefaultFactory;
	}

}
