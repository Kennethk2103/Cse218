package p5;

import java.util.Objects;

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
	@Override
	public int hashCode() {
		return Objects.hash(first, last);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Name other = (Name) obj;
		return Objects.equals(first, other.first) && Objects.equals(last, other.last);
	}
	
	
	

}
