package p2;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words = "dsjifd sruijs jdfj. dsuihfdsiuhfdush? djfsjfijttt. First second third! e?";
		StacksList stack = new StacksList();
		stack.reverseParagraph(words);
		while(!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
		stack = new StacksList();
		stack.reverseString(words);
		while(!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
		
		
		}

}
