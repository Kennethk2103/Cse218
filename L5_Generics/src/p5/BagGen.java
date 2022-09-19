package p5;

import java.util.Arrays;

public class BagGen <E> {
	private E[] arr;
	private int nElms;
//	public BagGen(int maxSize) {
//		arr =(E[])new Object[maxSize];
//	}
	public BagGen(Class<E> clazz, int maxSize) {
		arr = (E[]) Arrays.newInstance(clazz,maxSize);
	}
	public void insert(E val) {
		arr[nElms++]=val;
	}
	public void display() {
		for(int i =0; i<nElms;i++) {
			System.out.println(arr[i]);
		}
	}
	public E[] searchByLastName(Class<Name> class1, E lName) {
		E[] temp = (E[]) Arrays.newInstance(class1,nElms);
		int count=0;
		for(int i =0; i<nElms;i++) {
			if(arr[i].equals(lName)) {
				temp[count++]=arr[i];
			}
		}
		return Arrays.copyOf(temp, count);
	}
}
