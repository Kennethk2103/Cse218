package p6_objectComparison;

import java.util.Objects;

public class Student{
	private String name;
	private int age;
	private double gpa;
	public Student(String name, int age, double gpa) {
		super();
		this.name = name;
		this.age = age;
		this.gpa = gpa;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gpa=" + gpa + "]";
	}
//	@Override
//	public int compareTo(Student o) {
//		// TODO Auto-generated method stub
////		return this.name.compareTo(o.getName());
////		return Integer.compare(this.age,o.age);
//		return Double.compare(this.gpa, o.gpa);
//	}
	@Override
	public int hashCode() {
		return Objects.hash(age, gpa, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Double.doubleToLongBits(gpa) == Double.doubleToLongBits(other.gpa)
				&& Objects.equals(name, other.name);
	}
	
}
