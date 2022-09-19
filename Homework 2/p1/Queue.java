package p1;

import java.util.ArrayList;

public class Queue {
	private ArrayList<Integer> List;
	private int nElms;
	private int top;
	public Queue() {
		List = new ArrayList<>();
		nElms=0;
		top =0;
	}
	public void add(int a) {
		List.add(a);
		nElms++;
		top++;
	}
	public int remove() {
		nElms--;
		return List.remove(top);
	}
	public boolean isEmpty() {
		return nElms==0;
	}
	

}
