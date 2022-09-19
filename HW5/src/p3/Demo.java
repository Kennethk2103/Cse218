package p3;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int arr [] = {1,4,8,10,3,2,5};
		System.out.println(maxElement(arr,0,0));
	}
	public static int maxElement(int arr[],int max,int count) {
		if(count==0) {
			max=arr[count];
		}
		if (count<arr.length){
			if(max<arr[count]) {
				max=arr[count];
			}
			count++;
		}
		else {
			return max;
		}
		return maxElement(arr,max,count);
		
	}

}
