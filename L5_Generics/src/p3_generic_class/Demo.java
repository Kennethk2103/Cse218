package p3_generic_class;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Point p1 = new Point("One",2.2);
		Point<Integer, Double> p1 = new Point<>(1,2.0);
		Point<Double, Integer> p2 = new Point<>(1.2,1);
		System.out.println(p1);
		

	}

}
