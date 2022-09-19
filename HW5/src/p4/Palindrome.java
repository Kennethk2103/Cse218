package p4;


public class Palindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp ="racecar";
		palli(temp);
		

	}
	
	
	public static void palli(String word) {
		
		if(word.length()<=1) {
			System.out.println("it is a palidrome");
			return;

		}
	
		char first = word.charAt(0);
		char last = word.charAt(word.length()-1);
		System.out.println(word.length()-1);
		System.out.println(first + " " + last);
		if(first==last) {
			palli(word.substring(1, word.length()-1));
		}
		else {
			System.out.println("It isnt");
		}
		
	}
}
