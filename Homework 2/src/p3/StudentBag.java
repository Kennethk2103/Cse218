package p3;

import java.util.ArrayList;

public class StudentBag {
	private ArrayList<Student> List;
	private int nElms;
	private Queue que;
	public StudentBag() {
		List = new ArrayList<>();
		nElms=0;
		que = new Queue();
	}
	
	public void insert(Student a) {
		if(nElms<6) {
			List.add(a);
		}
		else {
			que.add(a);
		}
		nElms++;
	}
	public int size() {
		return nElms;
	}
	public Queue returnQue() {
		return que;
	}
	public Student remove() {
		if(nElms>6) {
			nElms--;
			return que.remove();
			
		}
		else {
			return List.remove(--nElms);
		}
	}
	public boolean isEmpty() {
		return nElms==0;
	}
	public String displayList() {
		String s = "";
		for(int i=0;i<nElms;i++) {
			s += List.get(i).toString() + "/n";
		}
		return s;
	}
	public String displayQue() {
		String s = "";
		while(!que.isEmpty()) {
			s+=que.remove();
		}
		return s;
	}

}
