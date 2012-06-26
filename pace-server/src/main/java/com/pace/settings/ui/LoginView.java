/**
 * 
 */
package com.pace.settings.ui;

import com.pace.settings.PaceSettingsApplication;
import com.pace.settings.PaceSettingsConstants;
import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.Panel;
import com.vaadin.ui.PasswordField;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.themes.Reindeer;

/**
 * Login View
 * 
 * @author JMilliron
 * 
 */
public class LoginView extends Panel {

	private static final String _5EM = "5em";

	private static final long serialVersionUID = 5696629523350276705L;

	private TextField username = new TextField();

	private PasswordField password = new PasswordField();
	
	private Button loginButton = new Button("Login");

	/**
	 * Constructor 
	 * 
	 * @param app used to add click listener
	 */
	public LoginView(PaceSettingsApplication app) {

		VerticalLayout mainLayout = new VerticalLayout();

		Label loginLabel = new Label("Login");

		loginLabel.setStyleName(Reindeer.LABEL_H2);

		mainLayout.addComponent(loginLabel);

		HorizontalLayout userNameHL = new HorizontalLayout();

		Label userNameLabel = new Label(PaceSettingsConstants.USERNAME_BUTTON_LABEL);
		
		userNameLabel.setWidth(_5EM);
		
		userNameHL.addComponent(userNameLabel);

		userNameHL.addComponent(username);
			
		userNameHL.setSpacing(true);
		
		mainLayout.addComponent(userNameHL);
		
		HorizontalLayout passwordHL = new HorizontalLayout();
		
		Label passwordLabel = new Label(PaceSettingsConstants.PASSWORD_BUTTON_LABEL);
		
		passwordLabel.setWidth(_5EM);
		
		passwordHL.addComponent(passwordLabel);
		
		passwordHL.addComponent(password);
		
		passwordHL.setSpacing(true);
		
		mainLayout.addComponent(passwordHL);		
			
		mainLayout.addComponent(loginButton);
		
		loginButton.setClickShortcut(KeyCode.ENTER);
		loginButton.addListener((ClickListener) app);
		
		mainLayout.setSpacing(true);
		
		mainLayout.setSizeFull();

		addComponent(mainLayout);
		
		setSizeFull();

	}

	/**
	 * @return the loginButton
	 */
	public Button getLoginButton() {
		return loginButton;
	}

	/**
	 * @return the username
	 */
	public TextField getUsername() {
		return username;
	}

	/**
	 * @return the password
	 */
	public PasswordField getPassword() {
		return password;
	}
	
	
	
}
