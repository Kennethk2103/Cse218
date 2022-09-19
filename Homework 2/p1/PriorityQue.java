package p1;

import java.util.ArrayList;

public class PriorityQue {
	private ArrayList<Integer> List;
	private int nElms;
	public PriorityQue() {
		List = new ArrayList<>();
		nElms=0;
	}
	
	
	public int remove() {
		return List.get(--nElms);
	}
	
	public void add(int a) {
		if(nElms==0) {
			List.add(a);
		}
		else {
			int j;
			for(j= nElms-1;j>=0;j--) {
				if(a>List.get(j)) {
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
	public int peekMin() {
		return List.get(nElms-1);
	}
	public int peekMax() {
		return List.get(0);
	}
	
	
}
