package p1;

import java.util.Arrays;

public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sequential");
		for(int i=50;i<1010;i=i+50) {
			int [] b=Maker(i);
			for(int a=0;a<20;a++) {
			sequentialSearch(b,i);
			}

		}
		System.out.println("Binary");
		for(int i=50;i<1001;i=i+50) {
			int [] b=Maker(i);
			Arrays.sort(b);

			for(int c=0;c<20;c++) {
				binarySearch(b,i);
			}
		}
		
	}
	public static int[] Maker(int num) {
		int a[] = new int[1000];
		for(int i=0;i<num;i++) {
			int temp = (int)(Math.random()*1000000);
			a[i]=temp;
		}
		return a;
	}
	public static int sequentialSearch(int a[],int nElms) {
		long start = System.nanoTime();
		int randomNum=a[(int)(Math.random()*nElms)];
		for(int i=0;i<nElms;i++) {
			if(a[i]==randomNum) {
				System.out.println("length of array: " + nElms + " time taken " + (System.nanoTime()-start));
				return i;
			}
		}
		return -1;
		
	}
	public static int binarySearch(int a[],int nElms) {
		int randomNum=(int)(Math.random()*nElms);
		long start = System.nanoTime();
		int first=0;
		int last=nElms-1;
		while(last>=first) {
			int mid =(first+last)/2;
			if(a[mid]==a[randomNum]) {
				System.out.println("length of array: " + nElms + " time taken " + (System.nanoTime()-start));
				return mid;
			}
			else if(a[mid]>a[randomNum]) {
				last=mid-1;
			}
			else {
				first=mid+1;
			}
		}
		return -1;
		
		
	}


}
///randomly grab 20 ints within the array
///return run time