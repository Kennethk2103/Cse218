package p3;

import java.util.ArrayList;

import javafx.scene.control.Button;

public class Queue {
	private ArrayList<Student> List;
	private int nElms;
	private int top;
	public Queue() {
		List = new ArrayList<>();
		nElms=0;
		top =0;
	}
	public void add(Student a) {
		List.add(a);
		nElms++;
//		top++;
	}
	public Student remove() {
//		nElms--;
		return List.remove(--nElms);
	}
	public boolean isEmpty() {
		return nElms==0;
	}
	

}
