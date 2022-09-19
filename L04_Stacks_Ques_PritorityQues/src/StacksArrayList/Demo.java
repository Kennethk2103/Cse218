package StacksArrayList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackA myStack = new StackA();
		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		while(!myStack.isEmpty()) {
			System.out.println(myStack.pop());
		}

	}

}
