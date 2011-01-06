package com.palladium.paf.migration;
import java.io.File;

import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.StatusLineManager;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.window.ApplicationWindow;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;

import com.palladium.paf.PafBaseConstants;
import com.palladium.paf.migration.MigrationAction;
import com.palladium.paf.migration.MigrationActionStatus;
import com.palladium.paf.migration.providers.ContentProvider;
import com.palladium.paf.migration.providers.TableLabelProvider;
import com.swtdesigner.SWTResourceManager;


public class Application extends ApplicationWindow {

	private Button browseButton;
	private Label selectServerHomeLabel;
	private TableViewer tableViewer;

	private Table table;
	private Text confDirectoryTxt;
	private Button convertButton;
	
	/**
	 * Create the application window
	 */
	public Application() {
		super(null);
		createActions();
		//addToolBar(SWT.FLAT | SWT.WRAP);
		addMenuBar();
		addStatusLine();
	}

	/**
	 * Create contents of the application window
	 * @param parent
	 */
	@Override
	protected Control createContents(Composite parent) {
		final Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new FormLayout());

		selectServerHomeLabel = new Label(composite, SWT.NONE);
		final FormData formData = new FormData();
		formData.left = new FormAttachment(0, 24);
		formData.top = new FormAttachment(0, 31);
		formData.right = new FormAttachment(0, 179);
		selectServerHomeLabel.setLayoutData(formData);
		selectServerHomeLabel.setText("Existing Conf Directory:");

		confDirectoryTxt = new Text(composite, SWT.BORDER);
		confDirectoryTxt.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				
				String confDirStr = confDirectoryTxt.getText().trim();
				
				File confDir = new File( confDirStr );
				
				if ( confDir != null && confDir.exists() && confDir.isDirectory() && 
						(confDirStr.endsWith(File.separator + PafBaseConstants.DN_ConfFldr) ||confDirStr.endsWith(File.separator + PafBaseConstants.DN_ConfFldr + File.separator))) {
										
					updateTableViewer(confDirStr);
					tableViewer.refresh();
					convertButton.setEnabled(true);
					
				} else {

					updateTableViewer(confDirStr);
					convertButton.setEnabled(false);
					
				}
				
			}
		});
		final FormData formData_1 = new FormData();
		formData_1.left = new FormAttachment(0, 24);
		formData_1.bottom = new FormAttachment(0, 71);
		formData_1.top = new FormAttachment(0, 52);
		formData_1.right = new FormAttachment(0, 404);
		confDirectoryTxt.setLayoutData(formData_1);

		browseButton = new Button(composite, SWT.NONE);
		browseButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				
				DirectoryDialog dlg = new DirectoryDialog(composite.getShell());

				File fl = new File(confDirectoryTxt.getText().trim());
				
				if ( fl != null && fl.exists() && fl.isDirectory() ) {
				
					dlg.setFilterPath(fl.toString());	
					
				}
								
				dlg.setText("Browse to Server Home");
				
				String dir = dlg.open();
				
				if ( dir != null ) {
					
					confDirectoryTxt.setText(dir);
					
				}
				
			}
		});
		final FormData formData_2 = new FormData();
		formData_2.right = new FormAttachment(0, 474);
		formData_2.bottom = new FormAttachment(0, 72);
		formData_2.top = new FormAttachment(0, 50);
		formData_2.left = new FormAttachment(0, 409);
		browseButton.setLayoutData(formData_2);
		browseButton.setText("Browse...");

		tableViewer = new TableViewer(composite, SWT.BORDER);
		tableViewer.setContentProvider(new ContentProvider());
		tableViewer.setLabelProvider(new TableLabelProvider());
		table = tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		final FormData formData_3 = new FormData();
		formData_3.bottom = new FormAttachment(0, 295);
		formData_3.top = new FormAttachment(0, 140);
		formData_3.right = new FormAttachment(0, 474);
		formData_3.left = new FormAttachment(0, 24);
		table.setLayoutData(formData_3);

		final TableColumn newColumnTableColumn = new TableColumn(table, SWT.NONE);
		newColumnTableColumn.setWidth(100);
		newColumnTableColumn.setText("Status");

		final TableColumn newColumnTableColumn_1 = new TableColumn(table, SWT.NONE);
		newColumnTableColumn_1.setWidth(343);
		newColumnTableColumn_1.setText("Action");
		
		updateTableViewer(null);

		convertButton = new Button(composite, SWT.NONE);
		convertButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				
			
				convertButton.setEnabled(false);
				
				String confDirStr = confDirectoryTxt.getText().trim();
				
				Object tableModel = tableViewer.getInput();
				
				if ( tableModel instanceof MigrationAction[]) {
					
					MigrationAction[] actions = (MigrationAction[]) tableModel;
					
					for (MigrationAction action : actions) {
						
						MigrationActionStatus status = action.getStatus();
						
						if ( status != null && (status.equals(MigrationActionStatus.NotStarted) || status.equals(MigrationActionStatus.Failed))) {
							
							action.setConfDirectory(confDirStr);
							action.run();
							tableViewer.refresh();
							
						}
						
					}
					
				}
				
				convertButton.setEnabled(true);
							
			}
		});
		final FormData formData_4 = new FormData();
		formData_4.left = new FormAttachment(0, 24);
		formData_4.top = new FormAttachment(0, 110);
		formData_4.right = new FormAttachment(0, 94);
		convertButton.setLayoutData(formData_4);
		convertButton.setText("Convert");
		convertButton.setEnabled(false);
		
		composite.setTabList(new Control[] {confDirectoryTxt, browseButton, convertButton, table});
		
		return composite;
	}

	/**
	 * Create the actions
	 */
	private void createActions() {
		// Create the actions
	}

	/**
	 * Create the menu manager
	 * @return the menu manager
	 */
	@Override
	protected MenuManager createMenuManager() {
		MenuManager menuManager = new MenuManager("menu");
		return menuManager;
	}

	/**
	 * Create the toolbar manager
	 * @return the toolbar manager
	 */
	@Override
	protected ToolBarManager createToolBarManager(int style) {
		return null;
	}

	/**
	 * Create the status line manager
	 * @return the status line manager
	 */
	@Override
	protected StatusLineManager createStatusLineManager() {
		StatusLineManager statusLineManager = new StatusLineManager();
		statusLineManager.setMessage(null, "");
		return statusLineManager;
	}

	/**
	 * Launch the application
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			
			for (String str : args) {
				System.out.println(str);
			}
			
			Application window = new Application();
			window.setBlockOnOpen(true);
			window.open();
			Display.getCurrent().dispose();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Configure the shell
	 * @param newShell
	 */
	@Override
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Paf Migration Utility");
		newShell.setImage(SWTResourceManager.getImage(Application.class, Constants.ICON));
	}

	/**
	 * Return the initial size of the window
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(507, 389);
	}

	private void updateTableViewer(String confDir) {

		MigrationAction[] migrationActions = new MigrationAction[] { 
				new PafViewsSeparationMigrationAction(confDir), 
				new PafViewSectionsSeparationMigrationAction(confDir),
				new PafRuleSetsSeparationMigrationAction(confDir),
				new PafViewGroupsMigrationAction(confDir), 
				new PafViewSectionBorderMigration(confDir), 
				new PafGenerationToHierarchyMigration(confDir), 
				new PafSecurityMigrationAction(confDir), 
				new PafPlannerConfigMigrationAction(confDir),
				new PafAppsMigrationAction(confDir)
		};
			
		tableViewer.setInput(migrationActions);
		
	}
}
