package p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Server {
	LinkList list1 = new LinkList();
	String words;
	private static Pane pane;
	private static MenuBar menuBar;
	
	public Server(Stage stage) {
		///default
		File file = new File("Data.txt");
		importTextFiles(file);
		createLinkedList(words);
		
		
		VBox wordBox = new VBox(20);
		TextField wordTxt = new TextField();
		Label wordLbl = new Label("Word");
		wordBox.setAlignment(Pos.CENTER);
		wordBox.getChildren().addAll(wordTxt,wordLbl);
		
		HBox paraBox = new HBox(50);
		TextArea para = new TextArea();
		paraBox.setAlignment(Pos.CENTER);
		paraBox.getChildren().add(para);
		
		HBox numBox = new HBox(20);
		TextField numText = new TextField();
		Label numLbl = new Label("Number of words");
		numBox.setAlignment(Pos.CENTER);
		
		Button b1 = new Button("Generate text");
		b1.setMaxSize(100, 50);
		b1.setPrefSize(100, 20);
		b1.setOnAction(e ->{
			String word = wordTxt.getText();
			int nums = Integer.valueOf(numText.getText());
			if(list1.find(word)!=null) {
				String output = randomSent(word,nums);
				para.setText(output);
				OutputText(output);
			}
			else {
				System.out.println("nope");
			}
		});
		numBox.getChildren().addAll(numText,numLbl,b1);
		
		menuBar = new MenuBar();
		FileChooser fileChooser = new FileChooser();

		Menu fileMenu = new Menu("File");
		MenuItem importItem = new MenuItem("Import");
		importItem.setOnAction(e -> {
			File fi = fileChooser.showOpenDialog(stage);
			importTextFiles(fi);
			createLinkedList(words);
		});
		fileMenu.getItems().add(importItem);
		menuBar.getMenus().add(fileMenu);
		
		pane = new VBox(50);
		((VBox)pane).setAlignment(Pos.CENTER);
		pane.getChildren().addAll(wordBox,numBox,paraBox);
		BorderPane root = new BorderPane();
		root.setTop(menuBar);
		root.setCenter(pane);

		Scene scene = new Scene(root, 800, 500);
		stage.setScene(scene);
		
		stage.show();		
	}
	
	public void createLinkedList(String paragrah) {
		String [] text = paragrah.split(" ");
		for(int i =0;i<text.length;i++) {
			if(list1.find(text[i])==null) {
				list1.insert(text[i], babyList(text[i], text));

			}
		}
	}
	
	public String randomWord(String word) {
		Link temp =list1.find(word);
		LinkedList<String> temp2 = temp.getBaby();
		int count =temp2.size();
		return temp2.get((int)(count*Math.random()));
	}
	
	public String randomSent(String word, int num) {
		String sent = word;
		for(int i =0;i<num-1;i++) {
			String temp = randomWord(word);
			sent += " " + temp; 
			word = temp;
		}
		return sent;
	}
	
	public LinkedList<String> babyList(String keyword, String [] text){
		LinkedList<String> baby= new LinkedList<>();
		for(int i =0;i<text.length-1;i++) {
			if(text[i].equals(keyword)) {
				int j =i+1;
				baby.add(text[j]);
			}
		}
		return baby;
	}
	
	public void importTextFiles(File file) {
				Scanner scan;
				try {
					scan = new Scanner(file);
					while(scan.hasNextLine()) {
						words += " " + scan.nextLine();
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
	}
	public void OutputText(String text) {
		FileWriter file = null;
		try {
			file = new FileWriter("output/output.txt",true);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PrintWriter pw = new PrintWriter(file);

		pw.println(text);
		pw.close();
	}
	
}
