package p2;

import java.util.Hashtable;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bag bag = new Bag(10);
		for(int i =0; i<bag.length()-1;i++) {
			bag.insert(i);
		}
		bag.display();
		///
		System.out.println("");
		Bag bag2 = new Bag(10);
		Integer [] arr= new Integer[10];
		for(int i =0; i<bag.length();i++) {
			arr[i]=i;
		}
		bag2.insertArr(arr);
		bag2.display();
	}

}
