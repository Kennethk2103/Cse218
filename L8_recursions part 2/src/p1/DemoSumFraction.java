package p1;

public class DemoSumFraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(5));

	}
	
	private static double sum(int a) {
		if(a==1) {
			return 1.0;
		}
		return 1.0/a + sum(a-1);
		
		
	}

}
