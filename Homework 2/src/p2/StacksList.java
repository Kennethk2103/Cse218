package p2;
import java.util.ArrayList;

public class StacksList {
	private ArrayList<String> List;
	private int top;
		
	public StacksList() {
		top=-1;
		List = new <String>ArrayList();
	}
	public void push(String val) {
		List.add(val);
			
	}
	public String pop() {
		return List.remove(List.size()-1);
	}
	public String peek() {
		return List.get(List.size());
	}
	public boolean isEmpty() {
		return List.size()==0;
	}
	public void reverseParagraph(String para) {
		String[] temp = para.split("");
		String sentance = "";
		for(int i =0; i<temp.length;i++) {
			sentance = sentance + temp[i];
			if(temp[i].contains("?") || temp[i].contains(".") || temp[i].contains("!") || temp[i].contains(" ")) {
				push(sentance);
				sentance = "";
			}
			
		}
		

		
		
	}
	
	
	
	public void reverseString(String words) {
		String temp [] = words.split("");
		for(int i =0;i<temp.length;i++) {
			push(temp[i]);
		}
		for(int i =0; i<temp.length;i++) {
			System.out.print(pop());
		}
	
		
	}
		
}
