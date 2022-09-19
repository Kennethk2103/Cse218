package Views;

import java.io.File;

import DataHandling.Applicant;
import DataHandling.EssayHandleing;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;

public class SchoolInfoView {
	private static Pane schoolInfoPane;
	private File fi;

	public SchoolInfoView(Applicant applicant) {
		schoolInfoPane = new VBox(30);
		((VBox)schoolInfoPane).setAlignment(Pos.CENTER);
		
		TextField gpaTxt = new TextField();
		if(applicant.getGpa()!=-1) {
			gpaTxt.setText(String.valueOf(applicant.getGpa()));
		}
		Label gpaLbl = new Label("Enter GPA");
		HBox gpaBox = new HBox(20);
		gpaBox.setAlignment(Pos.CENTER);
		gpaBox.getChildren().addAll(gpaLbl,gpaTxt);
		
		TextField satTxt = new TextField();
		if(applicant.getSat()>400) {
			satTxt.setText(String.valueOf(applicant.getSat()));
		}
		Label satLbl = new Label("Enter Sat score");
		HBox satBox = new HBox(20);
		satBox.setAlignment(Pos.CENTER);
		satBox.getChildren().addAll(satLbl,satTxt);
		
		Label essayLbl = new Label("Enter essay");
		Button essayBtn = new Button("Click to enter essay");
		essayBtn.setPrefSize(200, 50);
		essayBtn.setMaxSize(300, 50);
		FileChooser fileChooser= new FileChooser();
		essayBtn.setOnAction(e->{
			fi = fileChooser.showOpenDialog(RootView.getStage());
		});
		
		HBox essayBox = new HBox(20);
		essayBox.setAlignment(Pos.CENTER);
		essayBox.getChildren().addAll(essayLbl,essayBtn);
		
	
		
		Button saveBtn = new Button("Save");
		saveBtn.setPrefSize(100, 20);
		saveBtn.setMaxSize(100, 50);
		saveBtn.setOnAction(e->{
			if(gpaTxt.getText().equals("")) {
				applicant.setGpa(-1);
			}
			else if(Double.valueOf(gpaTxt.getText())>4 ||Double.valueOf(gpaTxt.getText())<0) {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("Gpa Invalid");
				alert.setHeaderText("Gpa invalid");
				alert.setContentText("Gpa has to be within 0.0 and 4.0 ");
				alert.showAndWait();
				gpaTxt.clear();
			}
			
			else {
				applicant.setGpa(Double.valueOf(gpaTxt.getText()));
			}
			if(satTxt.getText().equals("")) {
				applicant.setSat(-1);
			}
			else if(Integer.valueOf(satTxt.getText())>1600 || Integer.valueOf(satTxt.getText())<400) {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("Sat Invalid");
				alert.setHeaderText("Sat invalid");
				alert.setContentText("Sat has to be within 400 and 1600");
				alert.showAndWait();
				satTxt.clear();
			}
		
			else {
				applicant.setSat(Integer.valueOf(satTxt.getText()));
			}
			if(fi==null) {
			}
			else if(fi.exists() && fi.toString().substring(fi.toString().length()-4, fi.toString().length()).equals(".txt")) {
				if((EssayHandleing.getWords(EssayHandleing.readEssay(fi))).size()<250) {
					Alert alert = new Alert(AlertType.ERROR);
					alert.setTitle("Essay");
					alert.setHeaderText("Essay invalid");
					alert.setContentText("Essay needs to be more than 250 words");
					alert.showAndWait();
					applicant.setEssay(null);
				}
				else {
					applicant.setEssay(EssayHandleing.readEssay(fi));
				}
				
			}
			else if(fi.exists()){
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("Essay");
				alert.setHeaderText("Essay invalid");
				alert.setContentText("Essay needs to be a .txt file");
				alert.showAndWait();
				applicant.setEssay(null);
			}
		});	
		
		
		schoolInfoPane.getChildren().addAll(gpaBox,satBox,essayBox,saveBtn);
	}

	public static Pane getSchoolInfoPane(Applicant applicant) {
		if(schoolInfoPane==null) {
			new SchoolInfoView(applicant);
		}
		return schoolInfoPane;
		
	}

}
