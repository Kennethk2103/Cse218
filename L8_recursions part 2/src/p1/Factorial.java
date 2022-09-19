package p1;

import java.math.BigDecimal;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Factorial(50));

	}
	
	
	private static BigDecimal Factorial(int num) {
		if(num ==1) {
			return BigDecimal.valueOf(1);
		}
		return BigDecimal.valueOf(num * Factorial(num-1));
	}

}
