package p1;

import java.util.Objects;

public class Student implements Comparable<Student>{
	private String name;
	private static int idNum;
	private int id;
	private double Gpa;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}

	public double getGpa() {
		return Gpa;
	}
	public void setGpa(double gpa) {
		Gpa = gpa;
	}
	public Student(String name, double gpa) {
		super();
		this.name = name;
		id = idNum++;
		Gpa = gpa;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", Gpa=" + Gpa + "]";
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Gpa, id, name);
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
		return Double.doubleToLongBits(Gpa) == Double.doubleToLongBits(other.Gpa) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name);
	}
	
	
}
