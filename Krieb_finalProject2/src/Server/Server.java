package Server;

import DataHandling.ApplicantHandleing;
import DataHandling.DataManager;
import DataHandling.EssayHandleing;
import DataHandling.PriorityQue;
import DataHandling.Utilities;
import Views.RootView;
import Views.SignInUp;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Server extends Application{
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		DataManager dataManager = new DataManager( new ApplicantHandleing(), new EssayHandleing(), new PriorityQue());
		dataManager.setApp(Utilities.restoreApplicantData());
		dataManager.getEssayHandle().setTable(Utilities.restoreDictionaryData());
		dataManager.getPriorityQue().insertQue(Utilities.restoreQue());
		BorderPane root = (BorderPane) RootView.getRootPane();
		RootView.setStage(primaryStage);
		
		root.setCenter(SignInUp.getSignInUpPane(dataManager));
		Scene scene = new Scene(root, 800, 500);
		primaryStage.setScene(scene);
		primaryStage.setOnCloseRequest(e -> {
			Utilities.backUpApplicantData(dataManager.getApp());
			Utilities.backUpDictionary(dataManager.getEssayHandle().getTable());
			Utilities.backUpQueData(dataManager.getPriorityQue().getQue());
			System.out.println("Data backed up");
		});
		primaryStage.show();	
		
	}
	
}
 