package Views;

import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import DataHandling.Applicant;
import DataHandling.ApplicantHandleing;
import DataHandling.DataManager;
public class SignInUp {
	private static Pane SignInUpPane;
	private SignInUp(DataManager dataManager) {
		SignInUpPane = new VBox(30);
		((VBox)SignInUpPane).setAlignment(Pos.CENTER);
		
		Label title = new Label("Enter in email and password to create or sign in to a account");
		
		TextField emailTxt = new TextField();
		Label emailLbl = new Label("Enter email address");
		HBox emailBox = new HBox(20);
		emailBox.setAlignment(Pos.CENTER);
		emailBox.getChildren().addAll(emailLbl,emailTxt);
		
		PasswordField passwordTxt = new PasswordField();
		Label passwordLbl = new Label("Enter password");
		HBox passwordBox = new HBox(20);
		passwordBox.setAlignment(Pos.CENTER);
		passwordBox.getChildren().addAll(passwordLbl,passwordTxt);
		
		Button signUpbtn= new Button("Sign Up");
		signUpbtn.setPrefSize(100, 20);
		signUpbtn.setMaxSize(100,50);
		signUpbtn.setOnAction(e->{
			String email = emailTxt.getText();
			String password = passwordTxt.getText();
			
			Applicant temp = dataManager.getApp().findApplicant(email);
			if(temp==null) {///making new account
				
				if(ApplicantHandleing.passwordSatisfactory(password)) {
					temp = new Applicant();
					temp.setEmail(email);
					temp.setPassword(password);
					dataManager.getApp().addApplicant(temp);
					
					Alert alert = new Alert(AlertType.INFORMATION);
					alert.setTitle("Account created");
					alert.setHeaderText("Account has been created");
					alert.setContentText("Email is " + email + " password is " + password + ". Please do no forget these as without them you will not be able to log in");
					alert.showAndWait();
					
					BorderPane borderPane = (BorderPane)(RootView.getRootPane());
					borderPane.setCenter(MenuView.getMenuPane(temp,dataManager));
				}
				else {
					Alert alert = new Alert(AlertType.ERROR);
					alert.setTitle("Password invalid");
					alert.setHeaderText("Password invalid");
					alert.setContentText("Password must include one lower case, one upper case and one number");
					alert.showAndWait();	
					passwordTxt.clear();
					
				}	
			}
			else {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("Email invalid");
				alert.setHeaderText("Email invalid");
				alert.setContentText("Account with email already exists");
				alert.showAndWait();
			}
		});
		
		Button signInBtn = new Button("Sign in");
		signInBtn.setPrefSize(100, 20);
		signInBtn.setMaxSize(100, 50);
		signInBtn.setOnAction(e->{
			String email = emailTxt.getText();
			String password = passwordTxt.getText();
			
			Applicant temp = dataManager.getApp().findApplicant(email);
		
			
			if(temp==null) {
				
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("Account not found");
				alert.setHeaderText("Account has not been found");
				alert.setContentText("Please make sure you inputted the correct email");
				alert.showAndWait();
			
			}
			else {
				///if found a email with account
				if(temp.getPassword().equals(password)) {
					BorderPane borderPane = (BorderPane)(RootView.getRootPane());
					borderPane.setCenter(MenuView.getMenuPane(temp,dataManager));
				}
				else {
					Alert alert = new Alert(AlertType.ERROR);
					alert.setTitle("Password invalid");
					alert.setHeaderText("Password invalid");
					alert.setContentText("Password inputted is invalid for that email, please try again ");
					alert.showAndWait();
					passwordTxt.clear();
					
				}
			}
			
		});
		HBox signInUpBox = new HBox(20);
		signInUpBox.setAlignment(Pos.CENTER);
		signInUpBox.getChildren().addAll(signInBtn,signUpbtn);
		
		SignInUpPane.getChildren().addAll(title,emailBox,passwordBox,signInUpBox);
		
		
		
	}
	public static Pane getSignInUpPane(DataManager dataManager) {
		if(SignInUpPane==null) {
			new SignInUp(dataManager);
		}
		return SignInUpPane;
	}

}
