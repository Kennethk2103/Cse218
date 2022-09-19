package p4_lowerConstraint;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Name[] nameArr = {new Name("M", "ZZ"), new Name("A","B"),new Name("H","F")}; 
		Student[] studArr = {new Student("A",4.0),new Student("B",3.5),new Student("H",3.7)};
		display(nameArr);
		display(studArr);
		
		
	}
	
	///overloaded methods // same name diffrent var / signature
//	
//	private static void display(Name[] nameArr) {
//		System.out.println(Arrays.toString(nameArr));
//	}
//	
//	private static void display(Student[] studentArr) {
//		System.out.println(Arrays.toString(studentArr));
//	}
	
	
	private static <E> void display(E[] a) {
		System.out.println(Arrays.toString(a));
		
	}
	

}
