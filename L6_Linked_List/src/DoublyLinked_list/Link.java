package DoublyLinked_list;

public class Link {
	public long val;
	public Link next;
	public Link before;
	public Link(long val) {
		super();
		this.val = val;
		this.next = null;
		this.before = null;
	}
	public void display() {
		System.out.println(val);
	}

	
	

}
