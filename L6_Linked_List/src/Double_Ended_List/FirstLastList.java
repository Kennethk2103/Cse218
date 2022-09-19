package Double_Ended_List;

public class FirstLastList {///has to be objects/// infinite/// stack
	public Link first;
	public Link last;
	public FirstLastList() {
		first=null;
		last=null;
	}
	public boolean isEmpty() {
		return first==null;
	}
	public void insertFirst(double dData) {///Big O of 1
		Link newLink = new Link(dData);
		if(isEmpty()) {
			last=newLink;
		}
		newLink.setNext(first);
		first=newLink;
		
	}
	public void insertLast(double dData) {////Big O of N
		Link newLink = new Link(dData);
		if(isEmpty()) {
			first=newLink;
		}
		else {
			last.setNext(newLink);
		}
		last = newLink;

		
	}
	
	public double deleteFirst() {/// Big o of 1
		double temp = first.getdData();
		if(first.getNext()==null) {
			last = null;
		}
		first = first.getNext();
		return temp;
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
	
	
	public void displayList() {
		Link current = first;
		while(current!=null) {
			current.displayLink();
			current=current.getNext();
		}
	}
	
	public Link delete(double a) {
		Link current = first;
		Link prev=first;
		while(current.getdData()!=a ) {
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
	public Link find(double a) {
		Link current = first;
		while(current.getdData()!=a ) {
			if(current.getNext()==null) {
				return null;
			}
			else {
				current = current.getNext();
			}
		}
		return current;
		
	}

	

}
