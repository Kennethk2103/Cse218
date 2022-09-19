package p1;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		ComparableBag<Student> bag = new ComparableBag<>();		
		bag.add(new Student("S",3.0));
		bag.add(new Student("T",4.0));
		bag.add(new Student("U",5.0));
		Student k= new Student("AB",1.0);
		bag.add(k);
		
		bag.add(new Student("B",0.0));
		
		System.out.println(bag.search((Student s) ->{
			return s.getName().equals(k.getName());
		}));
		System.out.println(bag.search((Student s) ->{
			return (s.getId()>2);
		}));
		
		
	}

}
