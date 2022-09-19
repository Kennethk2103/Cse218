package StacksA;
///first in last out
///abstract data type
public class DemoStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		StackA myStack = new StackA(5);
		while(!myStack.isFull()) {
			myStack.push((long)(Math.random()*10));
		}
		
		System.out.println("Peek " + myStack.peek());
		while(!myStack.isEmpty()) {
			System.out.println(myStack.pop());
		}
	
		
		
	}

}
