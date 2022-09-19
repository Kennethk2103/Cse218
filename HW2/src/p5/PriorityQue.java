package p5;

import java.util.ArrayList;

public class PriorityQue {
	private ArrayList<Student> List;
	private int nElms;
	public PriorityQue() {
		List = new ArrayList<>();
		nElms=0;
	}
	public Student[] returnArray(){
		return (Student[]) List.toArray();
	}
	
	public Student remove() {
		return List.get(--nElms);
	}
	
	public void add(Student a) {
		if(nElms==0) {
			List.add(a);
		}
		else {
			int j;
			for(j= nElms-1;j>=0;j--) {
				if(a.getName().compareTo(List.get(j).getName())>0) {
					List.set(j+1, List.get(j));
				}
				else {
					break;
				}
			}
			List.set(j+1, a);
		}
		nElms++;
	}
	public boolean isEmpty() {
		return nElms==0;
	}
	
	public int size() {
		return nElms;
	}
	public Student peekMin() {
		return List.get(nElms-1);
	}
	public Student peekMax() {
		return List.get(0);
	}
	
	
}
