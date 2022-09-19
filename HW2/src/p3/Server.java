package p3;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Server {

		
	private static Pane pane;

		
		private Server() {
			
			
			///Instructor info boxes
			
			TextField firstNameField = new TextField();
			Label firstNameLbl = new Label("Name");
			HBox firstNameBox = new HBox(20);
			firstNameBox.setAlignment(Pos.CENTER);
			firstNameBox.getChildren().addAll(firstNameLbl,firstNameField);
			
			HBox idBox = new HBox(20);
			TextField idField = new TextField();
			Label idLbl = new Label("Id");
			idBox.setAlignment(Pos.CENTER);
			idBox.getChildren().addAll(idLbl,idField);
			
			TextField lastNameField = new TextField();
			Label lastNameLbl = new Label("Phone num");
			HBox LastNameBox = new HBox(20);
			LastNameBox.setAlignment(Pos.CENTER);
			LastNameBox.getChildren().addAll(lastNameLbl,lastNameField);
			
		
			
			TextField MajorField = new TextField();
			Label MajorFieldLbl = new Label("Major");
			HBox MajorBox = new HBox(20);
			MajorBox.setAlignment(Pos.CENTER);
			MajorBox.getChildren().addAll(MajorFieldLbl,MajorField);
		
			TextField rankField = new TextField();
			Label rankFieldLbl = new Label("Rank");
			HBox rankBox = new HBox(20);
			rankBox.setAlignment(Pos.CENTER);
			rankBox.getChildren().addAll(rankFieldLbl,rankField);
			
			
			HBox instructorBox = new HBox(50);///50 pixels seperating parts of hbo	
			instructorBox.setAlignment(Pos.CENTER);
			instructorBox.getChildren().addAll(firstNameBox,LastNameBox,idBox,MajorBox,rankBox);
				
			///buttons
			Button insertBtn = new Button("Insert");
			insertBtn.setMaxSize(100, 50);
			insertBtn.setPrefSize(100,20);
			insertBtn.setOnAction(e -> {
				String firstName = firstNameField.getText();
				String lastName = lastNameField.getText();
				String rank = rankField.getText();
				Double Major = Double.valueOf(MajorField.getText());
				
				firstNameField.clear();
				lastNameField.clear();
				MajorField.clear();
				rankField.clear();
				idField.clear();
				College.getPersonBag().insert(instructor);
				
			});
			
			
			HBox btn = new HBox(50);
			btn.setAlignment(Pos.CENTER);
			btn.getChildren().addAll(insertBtn,searchBtn,cancelBtn,updateBtn,deleteBtn);
			
			
			
			
			instructorPane = new VBox(50);
			((VBox)instructorPane).setAlignment(Pos.CENTER);
		 
			instructorPane.getChildren().add(instructorBox);

			instructorPane.getChildren().add(btn);
			
		}
		
		public static Pane getInstructorPane() {
			if(instructorPane==null) {
				new InstructorView();
			}
			return instructorPane;
		}
	}


}
