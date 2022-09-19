package p1_merge;

public class MergeSortArray {
	private long[] theArray;
	private int nElms;
	
	
	public MergeSortArray(int maxSize) {
		theArray = new long[maxSize];
		
	}
	public void mergeSort() {
		long[] workSpace = new long[nElms];
		recMergeSort(workSpace,0,nElms-1);
		
	}
	
	private void recMergeSort(long[] workSpace, int lowerBound, int upperBound) {
		if(lowerBound==upperBound) {
			return;
		}
		else {
			int mid = (lowerBound+upperBound)/2;
			recMergeSort(workSpace,lowerBound,mid);///sort lower half
			recMergeSort(workSpace,mid+1,upperBound);///sort upper half
			merge(workSpace,lowerBound,mid+1,upperBound);
			
		}
	}
	private void merge(long[] workSpace, int lowPointer, int highPointer, int upperBound) {
		// TODO Auto-generated method stub
		int j =0;/////workspace index
		int lowerBound=lowPointer;
		int mid = highPointer-1;
		int n = upperBound-lowerBound+1;///number of data items

		while(lowPointer<=mid && highPointer<= upperBound) {///niether arrays are done
			if(theArray[lowPointer]<theArray[highPointer]) {
				workSpace[j++]=theArray[lowPointer++];
		
			}
			else {
				workSpace[j++]=theArray[highPointer++];
				
			
			}
		
		}
		while(lowPointer<=mid) {
			workSpace[j++]=theArray[lowPointer++];
		}
		while(highPointer<=upperBound) {
			workSpace[j++]=theArray[highPointer++];
		}
		for(j=0;j<n;j++) {
			theArray[lowerBound+j]=workSpace[j];
		}
	}
	public void insert(long a) {
		theArray[nElms++]=a;
	}
	public void display() {
		for(int i =0;i<nElms;i++) {
			System.out.print(theArray[i] + " ");
		}
		System.out.println("");
	}
	
	
	
	

}
