package p1;

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

	public void insert(Student val) {
		int j;
		if(nElms==0) {
			List[0]=val;
		}
		else {
			for(j=nElms-1;j>=0; j--) {
				if(val.getGpa()>List[j].getGpa()) {
					List[j+1]=List[j];
					
				}else {
					break;
					
				}
			}
			List[j+1]=val;
		}
		nElms++;///nElms=nElms+1
	}
	public void display() {
		for(int i =0;i<nElms;i++) {
			System.out.println(List[i]);
		}
	}
	public Student pop() {
		Student temp = List[0];
		for(int i =0;i<nElms-1;i++) {
			List[i]=List[i+1];
		}
		return temp;
	}
}
