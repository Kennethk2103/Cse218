package StacksA;

public class StackA {
	private long [] stackArray;
	private int top;
	private int maxSize;
	
	public StackA(int maxSize) {
		this.maxSize=maxSize;
		top=-1;
		stackArray = new long [maxSize];
	}
	public void push(long val) {
		
		stackArray[++top]=val;
		
	}
	public long pop() {
		return stackArray[--top];
	}
	public long peek() {
		return stackArray[top];
	}
	public boolean isEmpty() {
		return top==0;
	}
	public boolean isFull() {
		return top==maxSize-1;
	}
}
