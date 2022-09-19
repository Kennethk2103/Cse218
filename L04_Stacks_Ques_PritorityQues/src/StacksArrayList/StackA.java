package StacksArrayList;
import java.util.ArrayList;
public class StackA {
	private ArrayList<Long> List;
	private int top;
	
	public StackA() {
		top=-1;
		List = new <Long>ArrayList();
	}
	public void push(long val) {
		List.add(val);
		
	}
	public long pop() {
		return List.remove(List.size()-1);
	}
	public long peek() {
		return List.get(List.size());
	}
	public boolean isEmpty() {
		return List.size()==0;
	}
	
}
