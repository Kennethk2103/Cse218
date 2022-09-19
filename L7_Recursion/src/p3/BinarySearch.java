package p3;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] arr = {"A","D","F","G","M","N","Z"};
		System.out.println(binarySearch(arr, 0, arr.length-1,"F"));
	}

	private static int binarySearch(String[] arr, int start, int end, String key) {
		// TODO Auto-generated method stub
		if(start>end) {
			return -1;
		}
		int mid = (start+end)/2;
		if(arr[mid].equals(key)) {
			return mid;
		}
		else if(arr[mid].compareTo(key)>0) {
			
			return binarySearch(arr,start,(mid-1),key);
		}
		else {
			return binarySearch(arr,(mid+1),end,key);
		}
		
		
	}
	

}
