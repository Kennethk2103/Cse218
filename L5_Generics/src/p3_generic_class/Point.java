package p3_generic_class;
///uperbound constraint
//public class Point <T extends Comprable,S extends Comprable>{///allows things that can be compared

public class Point <T extends Number,S extends Number>{///] t = type , extends number makes sure it is a number ///extends part is not neccesary
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
	public static void display(Point <? super Integer, ? super Integer> point) {////limits point to only have integers
		System.out.println(point);
	}
	

}
