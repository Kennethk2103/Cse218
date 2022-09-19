package p5_comparator_Function_interface;


import java.util.Arrays;
import java.util.Comparator;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s2 = new Student("b",20,3.0);
		Student s3 = new Student("c",22,2.0);
		Student s1 = new Student("a",25,4.0);
		Student s4 = new Student("d",23,1.0);
		Student s5 = new Student("e",0,4.9);
		Student s6 = new Student("g",30,1.3);
		Student s7 = new Student("z",85,3.3);
		Student s8 = new Student("p",6,2.5);
		Student[] arr = {s1,s2,s3,s4,s5,s6,s7,s8};
		Arrays.sort(arr,  (Student o1,Student o2)-> {
			return o1.getName().compareTo(o2.getName());
		});
		int StudentFound= Arrays.binarySearch(arr, s3);
		System.out.println(arr[StudentFound]);
//		System.out.println(Arrays.toString(arr));
	}

}
