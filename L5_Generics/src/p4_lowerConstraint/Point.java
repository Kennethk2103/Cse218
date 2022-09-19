package p4_lowerConstraint;
///uperbound constraint
public class Point <T,S>{///] t = type , extends number makes sure it is a number 
	private T x;
	private S y;
	
	public Point(T x, S y) {
		super();
		this.x = x;
		this.y = y;
	}
	public T getX() {
		return x;
	}
	public void setX(T x) {  
		this.x = x;
	}
	public S getY() {
		return y;
	}
	public void setY(S y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
//	public static void display(Point point) {
//		System.out.println(point);
//	}
	

}
