package p5;

public class Demo {
	static int count=0;
	static int position=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = {'a','b','c','f','f','f','g'};
		System.out.println(counter(arr,'f'));
	}
	
	public static int counter(char [] arr,char val) {
		if(arr[position]==val) {
			count++;
		}
		if(position<arr.length-1) {
			position++;
			counter(arr,val);
		}
		return count;
	
		
		
	}

}
