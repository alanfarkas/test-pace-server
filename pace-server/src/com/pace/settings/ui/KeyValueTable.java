/**
 * 
 */
package com.pace.settings.ui;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.vaadin.addon.customfield.CustomField;

import com.pace.base.misc.KeyValue;
import com.pace.settings.PaceSettingsConstants;
import com.vaadin.data.Container;
import com.vaadin.data.Property;
import com.vaadin.data.util.BeanItemContainer;
import com.vaadin.terminal.ThemeResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Component;
import com.vaadin.ui.Field;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Table;
import com.vaadin.ui.TableFieldFactory;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

/**
 * Custom Key Value UI Component
 * 
 * @author JMilliron
 *
 */
public class KeyValueTable extends CustomField implements Button.ClickListener {
	
	private static final long serialVersionUID = -3018010772417558367L;

	private Table table = new Table();
	
	private Button addButton = new Button("Add", (ClickListener) this);
	
	private TextField keyInput = new TextField();
	private TextField valueInput = new TextField();
	private Label keyInputLabel;
	private Label valueInputLabel;
	
	private Set<Button> deleteButtonSet = java.util.Collections.synchronizedSet(new java.util.HashSet<Button>());
	
	private BeanItemContainer<KeyValue> keyValueContainer = new BeanItemContainer<KeyValue>(KeyValue.class);

	public KeyValueTable(final String keyCaption, final String valueCaption) {
		
		VerticalLayout vl = new VerticalLayout();
				
		//keyValueContainer.addContainerProperty("Delete", Button.class, null);
		
		table.setContainerDataSource(keyValueContainer);
		table.setTableFieldFactory(new TableFieldFactory() {
			
			@Override
			public Field createField(Container container, Object itemId,
					Object propertyId, Component uiContext) {

				TextField field = new TextField();
				
                if ("key".equals(propertyId) || "value".equals(propertyId) ) {
                	                	
                	field.setNullRepresentation("");
                	field.setWidth(PaceSettingsConstants.COMMON_FIELD_WIDTH);	
                } else if ( "Delete".equals(propertyId)) {
                	
                	field.setWidth(PaceSettingsConstants.COMMON_BUTTON_WIDTH);
                	
                }
                
                
                field.setImmediate(true);
                
                return field;
								
			}
		});
		
		final KeyValueTable keyValueTable = this;
		
		table.addGeneratedColumn(((Object) "Delete"), new Table.ColumnGenerator() {
			
			@Override
			public Object generateCell(Table source, Object itemId, Object columnId) {
												
				if ( columnId.equals("Delete") ) {
			
					Button deleteButton = new Button();
					
					deleteButton.setData(itemId);
					
					deleteButton.setIcon(new ThemeResource("icons/32/remove.png"));
					
					deleteButton.addListener((ClickListener) keyValueTable);
					
					deleteButtonSet.add(deleteButton);
					
					return deleteButton;					
					
				}
				
				
				return null;
			}
		});
		
		
		table.setVisibleColumns(new Object[] { "key", "value", "Delete" });
		table.setColumnHeaders(new String[] { keyCaption, valueCaption, "Delete" });
		table.setWidth(PaceSettingsConstants.COMMON_TABLE_WIDTH);
		table.setSelectable(true);
		table.setWriteThrough(true);
		
		
		//table.setEditable(true);
		
		vl.addComponent(table);
		
		HorizontalLayout hy = new HorizontalLayout();
		keyInputLabel = new Label(keyCaption);
		hy.addComponent(keyInputLabel);		
		hy.addComponent(keyInput);
		
		valueInputLabel = new Label(valueCaption);
		hy.addComponent(valueInputLabel);
		hy.addComponent(valueInput);
		
		addButton.setIcon(new ThemeResource("icons/32/add.png"));
	
		hy.addComponent(addButton);
		hy.setSpacing(true);
		
		vl.addComponent(hy);
		
		vl.setStyleName("keyValueTable");
		
		setCompositionRoot(vl);
		
	}
	
	@Override
    public Class<?> getType() {
        return ArrayList.class;
    }
	
	@Override
    public void setPropertyDataSource(Property newDataSource) {
        Object value = newDataSource.getValue();
        if (value instanceof List<?>) {
            @SuppressWarnings("unchecked")
            List<KeyValue> beans = (List<KeyValue>) value;
            keyValueContainer.removeAllItems();
            keyValueContainer.addAll(beans);
            //table.setContainerDataSource(keyValueContainer);
            table.setPageLength(beans.size());
        } else {
            throw new ConversionException("Invalid type");
        }

        super.setPropertyDataSource(newDataSource);
    }
    
    @Override
    public Object getValue() {
        ArrayList<KeyValue> beans = new ArrayList<KeyValue>(); 
        for (Object itemId: keyValueContainer.getItemIds()) {
            beans.add(keyValueContainer.getItem(itemId).getBean());
        }
        return beans;
    }

	@Override
	public void buttonClick(ClickEvent event) {

		if ( event.getButton() == addButton ) {
									
			if ( keyInput.getValue().toString().trim().equals("") || valueInput.getValue().toString().trim().equals("")) {
				
				addButton.getApplication().getMainWindow().showNotification(keyInputLabel.getValue() + " and " + valueInputLabel.getValue() + " are required.");
				
			} else {
				
				KeyValue kv = new KeyValue(keyInput.getValue().toString().trim(), valueInput.getValue().toString().trim());
				
				if ( table.containsId(kv) ) {
					
					addButton.getApplication().getMainWindow().showNotification("Key already present in table.");
					
				} else {
				
					Object itemId = table.addItem(kv);
					
					int pageLength = table.getPageLength();
					
					table.setPageLength(pageLength + 1);
					
					table.select(itemId);
									
					keyInput.setValue("");
					valueInput.setValue("");
				}
				 				
			}
									
						
		} else if ( deleteButtonSet.contains(event.getButton())) {
			
			Button deleteButton = event.getButton();
			
			Object data = deleteButton.getData();
			
			int pageLength = table.getPageLength();
			
			table.removeItem(data);
			
			if ( pageLength > 0 ) {
				
				table.setPageLength(pageLength - 1);
				
			}
			
			deleteButtonSet.remove(deleteButton);
			
		}
		
	}
}
