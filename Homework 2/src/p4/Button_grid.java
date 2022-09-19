package p4;

import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Button_grid {
	private VBox root;
	
			
	public Button_grid(Stage PrimaryStage) {
		Queue que = new Queue();
		
	
		
		HBox h1 = new HBox(20);
		h1.setAlignment(Pos.CENTER);
		Button b1 = new Button();
		b1.setStyle("-fx-background-color: #ff0000; ");
		b1.setMaxSize(100, 50);
		b1.setPrefSize(100, 20);
		b1.setOnAction(e ->{
			b1.setStyle("-fx-background-color: #000000; ");
			que.add(b1);
		});
		Button b2 = new Button();
		b2.setStyle("-fx-background-color: #ff0000; ");
		b2.setMaxSize(100, 50);
		b2.setPrefSize(100, 20);
		b2.setOnAction(e ->{
			b2.setStyle("-fx-background-color: #000000; ");
			que.add(b2);
		});
		Button b3 = new Button();
		b3.setStyle("-fx-background-color: #ff0000; ");
		b3.setMaxSize(100, 50);
		b3.setPrefSize(100, 20);
		b3.setOnAction(e ->{
			b3.setStyle("-fx-background-color: #000000; ");
			que.add(b3);
		});
		h1.getChildren().addAll(b1,b2,b3);
		
		HBox h2 = new HBox(20);
		h2.setAlignment(Pos.CENTER);
		Button b4 = new Button();
		b4.setStyle("-fx-background-color: #ff0000; ");
		b4.setMaxSize(100, 50);
		b4.setPrefSize(100, 20);
		b4.setOnAction(e ->{
			b4.setStyle("-fx-background-color: #000000; ");
			que.add(b4);
		});
		Button b5 = new Button();
		b5.setStyle("-fx-background-color: #ff0000; ");
		b5.setMaxSize(100, 50);
		b5.setPrefSize(100, 20);
		b5.setOnAction(e ->{
			b5.setStyle("-fx-background-color: #000000; ");
			que.add(b5);
		});
		Button b6 = new Button();
		b6.setStyle("-fx-background-color: #ff0000; ");
		b6.setMaxSize(100, 50);
		b6.setPrefSize(100, 20);
		b6.setOnAction(e ->{
			b6.setStyle("-fx-background-color: #000000; ");
			que.add(b6);
		});
		h2.getChildren().addAll(b4,b5,b6);
		
		HBox h3 = new HBox(20);
		h3.setAlignment(Pos.CENTER);
		Button b7 = new Button();
		b7.setStyle("-fx-background-color: #ff0000; ");
		b7.setMaxSize(100, 50);
		b7.setPrefSize(100, 20);
		b7.setOnAction(e ->{
			b7.setStyle("-fx-background-color: #000000; ");
			que.add(b7);
		});
		Button b8 = new Button();
		b8.setStyle("-fx-background-color: #ff0000; ");
		b8.setMaxSize(100, 50);
		b8.setPrefSize(100, 20);
		b8.setOnAction(e ->{
			b8.setStyle("-fx-background-color: #000000; ");
			que.add(b8);
		});
		Button b9 = new Button();
		b9.setStyle("-fx-background-color: #ff0000; ");
		b9.setMaxSize(100, 50);
		b9.setPrefSize(100, 20);
		b9.setOnAction(e ->{
			b9.setStyle("-fx-background-color: #000000; ");
			que.add(b9);
		});
		h3.getChildren().addAll(b7,b8,b9);
		
		
		
		
		
		
		
		
		
		
		
		Button reset = new Button("Reset");
		reset.setMaxSize(100, 50);
		reset.setPrefSize(10, 20);
		reset.setAlignment(Pos.CENTER);
		reset.setOnAction(e-> {
			if(!que.isEmpty()) {
			que.remove().setStyle("-fx-background-color: #ff0000; ");
			}
			else {
				Alert alert2 = new Alert(AlertType.INFORMATION);
				alert2.setTitle("No more Buttons to revert");
				alert2.setHeaderText("No more Buttons to revert");
				alert2.setContentText(": )");
				alert2.showAndWait();
			}
		});
		
		root = new VBox(20);
		root.setAlignment(Pos.CENTER);
		root.getChildren().addAll(reset);
		root.getChildren().addAll(h1);
		root.getChildren().addAll(h2);
		root.getChildren().addAll(h3);
		
		
	}
	public VBox getRoot() {
		return root;
	}

}
