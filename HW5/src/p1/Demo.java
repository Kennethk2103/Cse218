package p1;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,6,7};
		System.out.println(isMember(arr,8,0));
	}
	public static boolean isMember(int [] arr,int val,int count) {
		if(count>=arr.length) {
			return false;
		}
		if(arr[count]!=val) {
			count++;
			return isMember(arr,val,count);
		}
		
		return true;
		


		
	
		
		
	}

}
