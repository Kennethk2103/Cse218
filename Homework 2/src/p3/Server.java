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

		
	private VBox root;

		
		public Server(Stage primaryStag) {
			StudentBag bag = new StudentBag();
			
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
			
			TextField PhoneField = new TextField();
			Label PhoneLbl = new Label("Phone num");
			HBox PhoneBox = new HBox(20);
			PhoneBox.setAlignment(Pos.CENTER);
			PhoneBox.getChildren().addAll(PhoneLbl,PhoneField);
			
		
			
			TextField MajorField = new TextField();
			Label MajorFieldLbl = new Label("Major");
			HBox MajorBox = new HBox(20);
			MajorBox.setAlignment(Pos.CENTER);
			MajorBox.getChildren().addAll(MajorFieldLbl,MajorField);
		
			TextField DateField = new TextField();
			Label DateLbl = new Label("Registration date");
			HBox DateBox = new HBox(20);
			DateBox.setAlignment(Pos.CENTER);
			DateBox.getChildren().addAll(DateLbl,DateField);
			
			
			HBox StudentBox = new HBox(50);///50 pixels seperating parts of hbo	
			StudentBox.setAlignment(Pos.CENTER);
			StudentBox.getChildren().addAll(firstNameBox,idBox,PhoneBox,MajorBox,DateBox);
				
			///buttons
			Button insertBtn = new Button("Insert");
			insertBtn.setMaxSize(100, 50);
			insertBtn.setPrefSize(100,20);
			insertBtn.setOnAction(e -> {
				String firstName = firstNameField.getText();
				int id = Integer.valueOf(idField.getText());
				String phone = PhoneField.getText();
				String Major = MajorField.getText();
				String Date = DateField.getText();
				Student temp = new Student(firstName,id,phone,Major,Date);
				bag.insert(temp);
				firstNameField.clear();
				idField.clear();
				MajorField.clear();
				PhoneField.clear();
				MajorField.clear();
				DateField.clear();
				
			});
			TextArea showArea1 = new TextArea();
			TextArea showArea2 = new TextArea();

			HBox showBox1 = new HBox(50);
			showBox1.setAlignment(Pos.CENTER);
			showBox1.getChildren().addAll(showArea1,showArea2);
			
			Button outBtn = new Button("Display");
			outBtn.setMaxSize(100, 50);
			outBtn.setPrefSize(100, 20);
			outBtn.setOnAction(e ->{
				showArea1.appendText("Bag");
				showArea1.appendText(bag.displayList());
				showArea2.appendText("Queue");
				showArea2.appendText(bag.displayQue());
				
				
					
			});
			
			
			HBox btn = new HBox(50);
			btn.setAlignment(Pos.CENTER);
			btn.getChildren().addAll(insertBtn, outBtn);
			
			
			
			
			root = new VBox(50);
			root.setAlignment(Pos.CENTER);
		 
			root.getChildren().addAll(StudentBox,btn, showBox1);

			
		}
		
		public VBox getRoot() {
			return root;
	}


}
