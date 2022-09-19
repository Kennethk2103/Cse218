package p2;

public class Bag{
	private Object [] arr;
	private int nElms;

	public Bag(int size) {
		arr = new Integer[size];
		nElms=0;
	}
	public void insert(Object val) {
		arr[nElms++]=val;
	}
	public void insertArr(Object[] importArr) {
		for(int i=0;i<arr.length;i++) {
			arr[nElms++]=importArr[i];
		}
	}
	public void display() {
		int index = 0;///going to print nuber at that position
		displayRecursive(index);
	}
	private void displayRecursive(int index) {
		// TODO Auto-generated method stub
		if(index==nElms) {
			return;
		}
		else {
			System.out.println(arr[index++]);
			displayRecursive(index);
		}
		
	}
	public int length() {
		return arr.length;
	}
	
}
