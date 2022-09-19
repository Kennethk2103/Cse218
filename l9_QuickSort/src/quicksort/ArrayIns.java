package quicksort;

public class ArrayIns {
	private long[] theArray;
	private int nElms;
	public ArrayIns(int max) {
		theArray = new long[max];
	}
	public void insert(long a) {
		theArray[nElms++]=a;
	}
	public void display() {
		for(int i =0; i<nElms;i++) {
			System.out.print(theArray[i] + " ");
		}
		System.out.println("");
	}
	public int size() {
		return nElms;
	}
	
	public void quickSort() {
		recQuickSort(0,nElms-1);
	}
	private void recQuickSort(int left, int right) {
		if(right - left<=0) {
			return;
		}
		else {
			long pivot = theArray[right];
			int partision = partIt(left,right,pivot);
			recQuickSort(left,partision-1);
			recQuickSort(partision+1,right);
			
		}
		
	}
	public int partIt(int left, int right, long piviot) {
		int leftPtr = left-1;
		int rightPtr = right+1;
		while(true) {
			while(leftPtr<right && theArray[++leftPtr]<piviot) {
				;
			}
			while(rightPtr>left && theArray[--rightPtr]>=piviot) {
				;
			}
			if(leftPtr>=rightPtr) {
				break;
			}
			else {
				swap(leftPtr,rightPtr);
			}
			
		}
		swap(leftPtr,right);
		return leftPtr;
	}
	public void swap(int dex1,int dex2) {
		long temp = theArray[dex1];
		theArray[dex1]=theArray[dex2];
		theArray[dex2]=temp;
	}
	
	
	
}
