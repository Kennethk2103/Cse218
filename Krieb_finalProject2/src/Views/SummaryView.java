package Views;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import DataHandling.Applicant;
import DataHandling.ApplicantHandleing;
import DataHandling.DataManager;
import DataHandling.EssayHandleing;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class SummaryView {
	private static Pane summaryPane;
	
	private SummaryView(Applicant applicant,DataManager dataManager) {
		summaryPane = new VBox(30);
		((VBox)summaryPane).setAlignment(Pos.CENTER);
		File file = ApplicantHandleing.applicantOutputHandleing(applicant, dataManager);
		String summary = EssayHandleing.getSummary(file);
		
		
		TextArea text = new TextArea();
		text.setEditable(false);
		text.setText(summary);
		
		
		HBox textBox = new HBox(50);
		textBox.setPrefSize(500, 500);
		textBox.setMaxSize(600, 600);
		textBox.getChildren().add(text);
		textBox.setAlignment(Pos.CENTER);
		summaryPane.getChildren().addAll(textBox);
	}
	
	public static Pane getSummaryPane(Applicant applicant,DataManager dataManager) {
		new SummaryView(applicant,dataManager);////need to do this so text field changes if you change a stat
		return summaryPane;
	}

}
