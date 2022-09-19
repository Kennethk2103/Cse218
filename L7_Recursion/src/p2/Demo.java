package p2;

public class Demo {
	private static int count=0;
	
	public static void main(String[] args) {
		show(count);
		System.out.println("Finish");


	}
	public static void show(int c) {
		if(c==3) { ///basecase 
			return;
		}
		System.out.println("Hi");
		System.out.println("bye");
		c++;
		show(c);
		
		
	}

}
