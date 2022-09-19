package p2_generic_method;

public class Name implements Comparable<Name>{
	private String first;
	private String last;
	public Name(String first, String last) {
		super();
		this.first = first;
		this.last = last;
	}
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	@Override
	public String toString() {
		return "Name [first=" + first + ", last=" + last + "]";
	}
	@Override
	public int compareTo(Name o) {
		// TODO Auto-generated method stub
		return this.last.compareTo(o.getLast());
	}
	

}
