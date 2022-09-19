package p1;

import java.util.ArrayList;

public class GStack <T extends Number>{
	private ArrayList<T> List;
	private int top;
	
	public GStack() {
		top=-1;
		List = new ArrayList<>();
	}
	public void push(T val) {
		List.add(val);
		
	}
	public T pop() {
		return List.remove(List.size()-1);
	}
	public T peek() {
		return List.get(List.size());
	}
	public boolean isEmpty() {
		return List.size()==0;
	}
	public void pushAll(ArrayList<T> tempList) {
		List.addAll(tempList);
	}
	public ArrayList<T> popAll(){
		ArrayList<T> temp = new ArrayList<>();
		while(!isEmpty()) {
			temp.add(pop());
		}
		return temp;
	}
	
	

}
