package p6_objectComparison;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Joe",20,3.5);
		Student s2 = new Student("Joe",20,4.5);
		Student s3 = s1;
//		Student [] arr = {s1,s2};
		System.out.println(s1==s2);///nyet diffrent mem addresses
		System.out.println(s1.equals(s2));///mem address, so no

		System.out.println(s1==s3);///same mem addresses
		System.out.println(s1.equals(s3));///mem address, so yes
		
		System.out.println(s1.equals(s2));
		
	}

}
