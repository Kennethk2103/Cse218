package p4;
import java.lang.reflect.Array;  
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Bag <T>{
	private T[] arr;
	private int nElms;
	private Class clazz;
	
	public Bag(Class<T> clazz, int maxSize) {
		super();
		this.clazz=clazz;
		arr = (T[]) Array.newInstance(clazz, maxSize);
		nElms=0;
	}
	public void insert(T val) {
		arr[nElms++]=val;
	}

	public T[] remove(Predicate predicate) {
		T [] tempArr = (T[]) Array.newInstance(clazz, nElms);
		int nElms2=0;
		for(int i=0; i<nElms;i++) {
			if(predicate.test(arr[i])) {
				tempArr[nElms2++]=arr[i];
				for(int j =i;j<nElms-1;j++) {
					arr[j]=arr[j+1];
				}
				i--;
				
				nElms--;
			}
		}
		return Arrays.copyOf(tempArr, nElms2);

	}
//	public void display(Predicate<T> predicate) {
//		for(int i=0; i<nElms;i++) {
//			System.out.println(arr[i].toString());
//		}
//		
//	}
	public void display() {
		for(int i =0;i<nElms;i++) {
			System.out.println(arr[i].toString());
		}
	}
	public T[] search(Predicate<T> predicate) {
		T [] tempArr = (T[]) Array.newInstance(clazz, nElms);
		int nElms2=0;
		for(int i=0; i<nElms;i++) {
			if(predicate.test(arr[i])) {
				tempArr[nElms2++]=arr[i];
			}
		}
		return Arrays.copyOf(tempArr, nElms2);
		
	}
	

}
