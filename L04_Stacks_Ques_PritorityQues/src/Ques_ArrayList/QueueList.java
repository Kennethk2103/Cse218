package Ques_ArrayList;
import java.util.ArrayList;
//first in first out
///abstract data type
public class QueueList {
	private ArrayList<Long> List;
	private int top;///retive from this one
	private int bottom;///add data to this one
	private int maxSize;
	private int nElms;
	//the sensity of the alg to the increase of data items
	public QueueList(int maxSize) {
		bottom = -1;
		top =0;
		this.maxSize=maxSize;
		List = new ArrayList<Long>();
		nElms=0;
	}
	
	public void add(long val) {
		List.add(val);
		nElms++;
//		QueueA[++bottom]=val;
	}  
	public long remove() {
		long temp = List.remove(top);
		nElms--;
		return temp;
	}
	
	public boolean isEmpty() {
		return nElms==0;
	}
	
	
	
	
	
}
