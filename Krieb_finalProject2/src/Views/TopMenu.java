package Views;

import DataHandling.Applicant;
import DataHandling.ApplicantHandleing;
import DataHandling.DataManager;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

public class TopMenu {
	private static MenuBar menuBar;
	private TopMenu(Applicant app, DataManager data) {
		 menuBar = new MenuBar();
		 
		 Menu menu = new Menu("Menu");
		 MenuItem returnToMenu = new MenuItem("Return to Menu");
		 returnToMenu.setOnAction(e->{
			 BorderPane borderPane = (BorderPane)(RootView.getRootPane());
			 borderPane.setTop(TopMenu.getTopMenu(app,data));
			 borderPane.setCenter(MenuView.getMenuPane(app,data));
		 });
		 menu.getItems().add(returnToMenu);
		 menuBar.getMenus().add(menu);		 
	}
	
	
	public static MenuBar getTopMenu(Applicant app,DataManager data) {
		if(menuBar==null) {
			return new TopMenu(app,data).getMenuBar();
		}
		return menuBar;
	}
	private MenuBar getMenuBar() {
		return menuBar;
	}
}
