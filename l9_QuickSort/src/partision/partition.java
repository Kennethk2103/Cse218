package partision;

public class partition {
	private long [] arr;
	private int nElms;
	public partition(int max) {
		arr = new long[max];
	}
	public void insert(long value) {
		arr[nElms++]=value;
	}
	public void display() {
		for(int i=0;i<nElms;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public int partIt(int left, int right, long piviot) {
		int leftPtr = -1;
		int rightPtr = right+1;
		while(true) {
			while(leftPtr<right && arr[++leftPtr]<piviot) {
				;
			}
			while(rightPtr>left && arr[--rightPtr]>=piviot) {
				;
			}
			if(leftPtr>=rightPtr) {
				break;
			}
			else {
				long temp = arr[leftPtr];
				arr[leftPtr]=arr[rightPtr];
				arr[rightPtr]=temp;
			}
			
		}
		return leftPtr;
	}
	public void swap(int dex1,int dex2) {
		long temp = arr[dex1];
		arr[dex1]=arr[dex2];
		arr[dex2]=temp;
	}
	
	public int size() {
		return nElms;
	}
}
