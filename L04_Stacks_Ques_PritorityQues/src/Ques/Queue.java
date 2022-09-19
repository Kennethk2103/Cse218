package Ques;
//first in first out
///abstract data type
public class Queue {
	private long[] QueueA;
	private int top;///retive from this one
	private int bottom;///add data to this one
	private int maxSize;
	private int nElms;
	
	public Queue(int maxSize) {
		bottom = -1;
		top =0;
		this.maxSize=maxSize;
		QueueA = new long[maxSize];
		nElms=0;
	}
	
	public void add(long val) {
		if(bottom== maxSize-1) {
			bottom=-1;
		}
		nElms++;
		QueueA[++bottom]=val;
	}  
	public long remove() {
		long temp = QueueA[top++];
		if(top == maxSize) {
			top=0;
		}
		nElms--;
		return temp;
	}
	
	public boolean isEmpty() {
		return nElms==0;
	}
	public boolean isFull() {
		return nElms==maxSize;
	}
	
	
	
	
}
