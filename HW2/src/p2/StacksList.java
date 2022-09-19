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
		para.split(".");
		para.split("!");
		String[] temp = para.split("?");
		for(int i=0;i<temp.length;i++) {
			push(temp[i]);
		}
	}
	
	
	public void reverseString(String words) {
		String[] temp = words.split("");
		
		
	
		
	}
		
}
