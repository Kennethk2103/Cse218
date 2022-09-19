package p4;

public class PriorityQue {
	private Student[] List;
	private int nElms;
	private int maxSize;
	
	public PriorityQue(int maxSize) {
		this.maxSize=maxSize;
		List = new Student[maxSize];
		nElms=0;
	}

	public boolean isEmpty() {
		return nElms==0;
	}
	
	public boolean isFull() {
		return nElms==maxSize;
	}
	
	public int size() {
		return nElms;
	}
	
	public Student peekMin() {
		return List[nElms-1];
	}
	public Student peekMax() {
		return List[0];
	}
	public Student remove() {
		return List[--nElms];
	}
	////--nElms not equal nElms-1;
	////

	public void insert(Student s) {
		int j;
		if(nElms==0) {
			List[0]=s;
		}
		else {
			for(j=nElms-1;j>=0; j--) {
				if(s.getName().compareTo(List[j].getName())>0) {
					List[j+1]=List[j];
					
				}else {
					break;
					
				}
			}
			List[j+1]=s;
		}
		nElms++;///nElms=nElms+1
	}
	
}
