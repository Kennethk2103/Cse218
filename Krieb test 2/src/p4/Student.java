package p4;

import java.util.Objects;

public class Student implements Comparable<Student>{
	private String name;
	private double Gpa;

	public Student(String name, double gpa) {
		super();
		this.name = name;
		Gpa = gpa;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return Gpa;
	}

	public void setGpa(double gpa) {
		Gpa = gpa;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", Gpa=" + Gpa + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Gpa,name);
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
		return Double.doubleToLongBits(Gpa) == Double.doubleToLongBits(other.Gpa) 
				&& Objects.equals(name, other.name);
	}
	
	
}