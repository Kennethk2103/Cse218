package Double_Ended_List;

public class Link {
	public double dData;
	public Link next;
	public Link( double dData) {
		super();
		this.dData = dData;
	}
	
	public double getdData() {
		return dData;
	}
	public void setdData(double dData) {
		this.dData = dData;
	}
	public Link getNext() {
		return next;
	}
	public void setNext(Link next) {
		this.next = next;
	}
	public void displayLink() {
		System.out.print( dData + " " );
	}
	@Override
	public String toString() {
		return "Link [ dData=" + dData + ", next=" + next + "]";
	}
	
	
	
}
