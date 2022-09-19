package List_eaterators;

public class LinkedList {
	private Link first;
	public LinkedList() {
		first=null;
	}
	public ListIterator getIterator() {
		return new ListIterator(this);
	}
	public Link getFirst() {
		return first;
	}
	public void setFirst(Link link) {
		this.first=link;
	}
	public boolean isEmpty() {
		return first==null;
	}
	public void display() {
		Link current = first;
		while(current!=null) {
			current.display();
			current=current.next;
		}
		System.out.println("");
	}


}
