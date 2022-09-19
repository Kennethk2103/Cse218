package p4;

import java.util.ArrayList;
import java.util.jar.Attributes.Name;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Bag<Student> bag = new Bag<>(Student.class,10);
		bag.insert(new Student("A",4.0));
		bag.insert(new Student("B",1.0));
		bag.insert(new Student("C",8.0));
		bag.insert(new Student("D",5.0));
		bag.insert(new Student("E",3.3));
//		bag.display();
		bag.display();
		System.out.println("");
		Student[] arr = bag.remove(s-> ((Student) s).getGpa()>4.9);
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i].toString());
		}
		System.out.println("");
		bag.display();        
		System.out.println("");
		Student[] arr2 = bag.search(s-> s.getName().equals("E"));
		for(int i =0;i<arr2.length;i++) {
			System.out.println(arr2[i].toString());
		}


		
		
	}

}
///fianl on 12th



