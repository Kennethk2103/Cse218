package Views;

import java.util.ArrayList;
import java.util.LinkedList;

import DataHandling.Applicant;
import DataHandling.Utilities;
import javafx.collections.FXCollections;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class PersonInfoView {
	private static Pane personInfoPane;

	private PersonInfoView(Applicant applicant) {
		personInfoPane= new VBox(30);
		((VBox)personInfoPane).setAlignment(Pos.CENTER);
		Label firstLbl = new Label("Enter first name");
		TextField firstTxt = new TextField();
		if(applicant.getFirst_Name()!=null) {
			firstTxt.setText(applicant.getFirst_Name());
		}
		HBox firstBox = new HBox(50);
		firstBox.setPrefSize(200, 20);
		firstBox.setMaxSize(300, 20);
		firstBox.getChildren().addAll(firstLbl, firstTxt);
		
		Label lastLbl = new Label("Enter last name");
		TextField lastTxt = new TextField();
		if(applicant.getLast_Name()!=null) {
			lastTxt.setText(applicant.getLast_Name());
		}
		HBox lastBox = new HBox(50);
		lastBox.setPrefSize(200, 20);
		lastBox.setMaxSize(300, 20);
		lastBox.getChildren().addAll(lastLbl, lastTxt);
		
		
		Label addressLbl = new Label("Enter address");
		TextField addressTxt = new TextField();
		HBox addressBox = new HBox(50);
		if(applicant.getAddress()!=null) {
			addressTxt.setText(applicant.getAddress());
		}
		addressBox.setPrefSize(200, 20);
		addressBox.setMaxSize(300, 20);
		addressBox.getChildren().addAll(addressLbl, addressTxt);
		
		Label stateLbl = new Label("Enter state");
		HBox stateBox = new HBox(50);
		LinkedList<String> states = Utilities.statesList();
		ComboBox comboBox = new ComboBox();
		comboBox.setItems(FXCollections.observableArrayList(states));
		if(applicant.getState()!=null) {
			comboBox.getSelectionModel().select(applicant.getState());
		}
		
		
		
		stateBox.setPrefSize(200, 20);
		stateBox.setMaxSize(300, 20);
		stateBox.getChildren().addAll(stateLbl, comboBox);
		
		
		Label incomeLbl = new Label("Enter income");
		TextField incomeTxt = new TextField();
		if(applicant.getIncome()!=-1) {
			incomeTxt.setText(String.valueOf(applicant.getIncome()));
		}
		HBox incomeBox = new HBox(50);
		incomeBox.setPrefSize(200, 20);
		incomeBox.setMaxSize(300, 20);
		incomeBox.getChildren().addAll(incomeLbl, incomeTxt);
		
		Label phoneLbl = new Label("Enter phone");
		TextField phoneTxt = new TextField();
		if(applicant.getPhoneNum()!=null) {
			phoneTxt.setText(String.valueOf(applicant.getPhoneNum()));
		}
		HBox phoneBox = new HBox(50);
		phoneBox.setPrefSize(200, 20);
		phoneBox.setMaxSize(300, 20);
		phoneBox.getChildren().addAll(phoneLbl, phoneTxt);
		
		Button saveBtn = new Button("Save");
		saveBtn.setPrefSize(100, 20);
		saveBtn.setMaxSize(100, 50);
		saveBtn.setOnAction(e->{
			applicant.setFirst_Name(firstTxt.getText());
			applicant.setLast_Name(lastTxt.getText());
			applicant.setAddress(addressTxt.getText());
			applicant.setPhoneNum(phoneTxt.getText());
			applicant.setState((String) comboBox.getValue());
			if(incomeTxt.getText().equals("")) {
				applicant.setIncome(-1);
			}
			else {
				applicant.setIncome(Double.valueOf(incomeTxt.getText()));
			}
		});
		
		personInfoPane.getChildren().addAll(firstBox,lastBox,addressBox,stateBox,incomeBox,phoneBox,saveBtn);
	}
	public static Pane getPersonInfoPane(Applicant applicant) {
		if(personInfoPane==null) {
			new PersonInfoView(applicant);
		}
		return personInfoPane;
	}
	
}
