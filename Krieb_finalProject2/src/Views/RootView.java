package Views;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class RootView {
	private static Stage stage;
	public static Stage getStage() {
		return stage;
	}

	public static void setStage(Stage stage) {
		RootView.stage = stage;
	}

	private static Pane root;

	private RootView() {
		root = new BorderPane();
		
	}

	public static Pane getRootPane() {
		if (root == null) {
			new RootView();
		}
		return root;
	}
	

}