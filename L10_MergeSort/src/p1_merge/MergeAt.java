package p1_merge;

import java.util.Arrays;

///merges two sorted arrays into 1 sorted array
public class MergeAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {12,34,36,36,61,78};
		int [] b = {1,3,9,20,38,68,100};
		int [] c = new int[a.length+b.length];
		merge(a,a.length,b,b.length,c);
		display(c,c.length);

		
	}
	
	private static void merge(int[] a, int lengthA, int[] b, int lengthB, int[] c) {
		// TODO Auto-generated method stub
		int aIndex=0;
		int bIndex=0;
		int cIndex=0;
		while(aIndex<lengthA && bIndex<lengthB) {///niether arrays are done
			if(a[aIndex]<b[bIndex]) {
				c[cIndex++]=a[aIndex++];
		
			}
			else {
				c[cIndex++]=b[bIndex++];
			
			}
		
		}
		while(aIndex<lengthA && bIndex==lengthB) {///b is done
			c[cIndex++]=a[aIndex++];
		}
		while(aIndex==lengthA && bIndex<lengthB) {///a is done
			c[cIndex++]=b[aIndex++];
		}
		
	}
	public static void display(int [] array,int size) {
		for(int i=0;i<size;i++) {
			System.out.println(array[i]);
		}
	}


	
	
	
	

}
