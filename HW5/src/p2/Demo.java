package p2;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp = "testing";
		
		System.out.println(reverse("temp"));
	}
	
	public static String reverse(String word) {
		if(word.length()==1) {
			return word;
		}
		return word.charAt(word.length()-1) + reverse(word.substring(0, word.length()-1));
	
	}
	

}
