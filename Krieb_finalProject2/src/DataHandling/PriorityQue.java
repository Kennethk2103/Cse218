package DataHandling;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;


public class PriorityQue{
	PriorityQueue<Applicant> que;

	public PriorityQue() {
		super();
		que =new PriorityQueue<Applicant>();
	}
	public void add(Applicant app) {
		que.add(app);
	}
	public Applicant pop() {
		return que.remove();
	}
	public void insertQue(PriorityQueue<Applicant> que) {
		this.que=que;
	}
	public PriorityQueue<Applicant> getQue(){
		return que;
	}
	
	
	
	
	
}