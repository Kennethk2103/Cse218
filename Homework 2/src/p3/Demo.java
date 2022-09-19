package p3;


import javafx.application.Application;
import javafx.scene.Scene;

import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Demo extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		VBox root = new Server(primaryStage).getRoot();
		
		Scene scene = new Scene(root,500,500);
		

		primaryStage.setScene(scene);
		primaryStage.show();
	}
	

	

	

}
