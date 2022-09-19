package p3;

import java.util.LinkedList;



public class LinkList {///has to be objects/// infinite/// stack
	private Link first;
	public LinkList() {
		first=null;
	}
	public boolean isEmpty() {
		return first==null;
	}
	public void insert(String parent, LinkedList<String> baby) {///Big O of 1
		Link newLink = new Link(parent,baby,first);
		first=newLink;
	}
	public Link getFirst() {
		return first;
	}
	public void setFirst(Link link) {
		this.first=link;
	}
	public Link find(String word) {
		Link current = first;
		if(current==null) {
			return null;
		}
		while(!current.getParent().equals(word) ) {
			if(current.getNext()==null) {
				return null;
			}
			else {
				current = current.getNext();
			}
		}
		return current;
		
	}
	
	public void display() {
		Link current = first;
		while(current!=null) {
			current.Display();
			current=current.getNext();
		}
		System.out.println("");
	}


}
