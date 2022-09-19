package p4_comparator_Anonymous;


import java.util.Arrays;
import java.util.Comparator;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s2 = new Student("b",20,3.0);
		Student s3 = new Student("c",22,2.0);
		Student s1 = new Student("a",25,4.0);
		Student s4 = new Student("d",23,1.0);
		Student[] arr = {s1,s2,s3,s4};
		Arrays.sort(arr,new Comparator<Student>(){

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return Double.compare(o1.getGpa(), o2.getGpa());
			}
			
			
		});
		System.out.println(Arrays.toString(arr));
	}

}
