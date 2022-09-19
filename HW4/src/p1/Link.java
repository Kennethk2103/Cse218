package p1;

import java.util.LinkedList;

public class Link {
	private String parent;
	private LinkedList<String> baby;
	private Link next;
	public void Display() {
		System.out.println("Link [parent=" + parent + ", baby=" + baby + ", next=" + next + "]");
	}
	public Link(String parent, LinkedList<String> baby,Link next) {
		super();
		this.parent = parent;
		this.baby = baby;
		this.next=next;
		next=null;
	}
	public String getParent() {
		return parent;
	}
	public void setParent(String parent) {
		this.parent = parent;
	}
	public LinkedList<String> getBaby() {
		return baby;
	}
	public void setBaby(LinkedList<String> baby) {
		this.baby = baby;
	}
	public Link getNext() {
		return next;
	}
	public void setNext(Link next) {
		this.next=next;
	}
	

	
	
	
}
