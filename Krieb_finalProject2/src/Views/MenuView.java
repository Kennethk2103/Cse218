package Views;

import java.io.File;
import java.io.IOException;

import DataHandling.Applicant;
import DataHandling.ApplicantHandleing;
import DataHandling.DataManager;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class MenuView {
	private static Pane menuPane;
	private MenuView(Applicant applicant, DataManager dataManager) {
		menuPane = new VBox(30);
		((VBox)menuPane).setAlignment(Pos.CENTER);
		
		BorderPane boderPane = (BorderPane)(RootView.getRootPane());
		boderPane.setTop(TopMenu.getTopMenu(applicant,dataManager));
		
		Button personBtn = new Button("Insert personal information");
		personBtn.setPrefSize(200, 200);
		personBtn.setMaxSize(200, 200);
		personBtn.setOnAction(e ->{
			BorderPane borderPane = (BorderPane)(RootView.getRootPane());
			boderPane.setTop(TopMenu.getTopMenu(applicant,dataManager));
			borderPane.setCenter(PersonInfoView.getPersonInfoPane(applicant));
		});
		Label personLbl;
		if(!ApplicantHandleing.personInfoCompleted(applicant)) {
			personLbl = new Label("Not complete");
		}
		else {
			personLbl = new Label("Complete");
		}
		
		HBox personBox = new HBox(50);
		personBox.setPrefSize(300, 60);
		personBox.setMaxSize(400, 80);
		personBox.getChildren().addAll(personBtn,personLbl);
		
		Button schoolInfoBtn = new Button("Insert School information");
		schoolInfoBtn.setPrefSize(200, 200);
		schoolInfoBtn.setMaxSize(200, 200);
		schoolInfoBtn.setOnAction(e ->{
			BorderPane borderPane = (BorderPane)(RootView.getRootPane());
			boderPane.setTop(TopMenu.getTopMenu(applicant,dataManager));
			borderPane.setCenter(SchoolInfoView.getSchoolInfoPane(applicant));
		});
		Label schoolInfoLbl;
		if(ApplicantHandleing.schoolInfoCompleted(applicant)) {
			schoolInfoLbl = new Label("Complete");
		}
		else {
			schoolInfoLbl = new Label("Not complete");
		}
		
		HBox schoolInfoBox = new HBox(50);
		schoolInfoBox.setPrefSize(300, 60);
		schoolInfoBox.setMaxSize(400, 80);
		schoolInfoBox.getChildren().addAll(schoolInfoBtn,schoolInfoLbl);
				
		Button enterInfoBtn = new Button("Finish Application");
		enterInfoBtn.setPrefSize(150, 20);
		enterInfoBtn.setMaxSize(150, 50);
		enterInfoBtn.setOnAction(e-> {
			if(!ApplicantHandleing.schoolInfoCompleted(applicant)||!ApplicantHandleing.personInfoCompleted(applicant)){
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("Cannot procces info");
				alert.setHeaderText("Cannot procces info");
				alert.setContentText("More information is needed to be inputted ");
				alert.showAndWait();
				
			}
			else {
				BorderPane borderPane = (BorderPane)(RootView.getRootPane());
				borderPane.setCenter(SummaryView.getSummaryPane(applicant,dataManager));
			}
		});
	
		menuPane.getChildren().addAll(personBox,schoolInfoBox,enterInfoBtn);
		
		
		
	}
	
	public static Pane getMenuPane(Applicant applicant,DataManager dataManager) {
		new MenuView(applicant,dataManager);
		return menuPane;
		//need to do this so completed and not complete labels reset
	}
}
