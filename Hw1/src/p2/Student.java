package p2;

public class Student implements Comparable<Student>{
	private String name;
	private double gpa;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + ", age=" + age + "]";
	}
	public Student(String name, double gpa, int age) {
		super();
		this.name = name;
		this.gpa = gpa;
		this.age = age;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}

	
	

}
