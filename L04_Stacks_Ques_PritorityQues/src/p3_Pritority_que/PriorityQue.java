package p3_Pritority_que;

public class PriorityQue {
	private long[] List;
	private int nElms;
	private int maxSize;
	
	public PriorityQue(int maxSize) {
		this.maxSize=maxSize;
		List = new long[maxSize];
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
	
	public long peekMin() {
		return List[nElms-1];
	}
	public long peekMax() {
		return List[0];
	}
	public long remove() {
		return List[--nElms];
	}
	////--nElms not equal nElms-1;
	////

	public void insert(long val) {
		int j;
		if(nElms==0) {
			List[0]=val;
		}
		else {
			for(j=nElms-1;j>=0; j--) {
				if(val>List[j]) {
					List[j+1]=List[j];
					
				}else {
					break;
					
				}
			}
			List[j+1]=val;
		}
		nElms++;///nElms=nElms+1
	}
	
}
