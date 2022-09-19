package simple_link_list;

public class LinkList {///has to be objects/// infinite/// stack
	private Link first;
	public LinkList() {
		first=null;
	}
	public boolean isEmpty() {
		return first==null;
	}
	public void insertFirst(int iData, double dData) {///Big O of 1
		Link newLink = new Link(iData,dData);
		newLink.setNext(first);
		first=newLink;
		
	}
	public Link deleteFirst() {/// Big o of 1
		Link temp = first;
		first = first.getNext();
		return temp;
	}
	public void displayList() {
		Link current = first;
		while(current!=null) {
			current.displayLink();
			current=current.getNext();
		}
	}
	public Link delete(int a) {
		Link current = first;
		Link prev=first;
		while(current.getiData()!=a ) {
			if(current.getNext()==null) {
				return null;
			}
			else {
				prev = current;
				current = current.getNext();
			}
		}
		if(current == first) {
			first=first.getNext();
		}
		else {
			prev.setNext(current.getNext());
		}
		return current;
	}
	public Link find(int a) {
		Link current = first;
		while(current.getiData()!=a ) {
			if(current.getNext()==null) {
				return null;
			}
			else {
				current = current.getNext();
			}
		}
		return current;
		
	}
	public void insertLast(int iData, double dData) {////Big O of N
		Link newLink = new Link(iData,dData);
		Link temp1 = first;
		while(temp1.getNext()!=null) {
			temp1=temp1.getNext();
		}
		temp1.setNext(newLink);
		
	}
	public Link removeLast() {/// Big o of N
		Link temp1 = first;
		while(temp1.getNext()!=null) {
			temp1=temp1.getNext();
		}
		Link temp2 = temp1.getNext();
		temp1.setNext(null);
		return temp2;
	}

}
