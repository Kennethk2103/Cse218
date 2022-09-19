package p4_lowerConstraint;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point<String,Double> p1 = new Point<>("10",5.5);
		Point<Integer,Double> p2 = new Point<>(10,5.5);
		Point<Object,Object> p3 = new Point<>(new Object(),new Object());
		display(p3);

	}
	///super means loweerbound constraint
	///super number would allow objects but not int or double since int and double are bellow number on the hierchy
	///only display it and super classes
	
	///extends == uperbound constraint
	/// anything below such as number would allow int and doubles
	public static void display(Point <? super Number, ?super Number>point) {///makes it so only numbers can be displayed
		System.out.println(point);
	}

}
