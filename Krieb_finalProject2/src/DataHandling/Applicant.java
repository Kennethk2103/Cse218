package DataHandling;

import java.io.File;
import java.io.Serializable;

public class Applicant implements Serializable, Comparable<Applicant> {///Data storage only, dont do anything with data here 
	private String first_Name;
	private String last_Name;
	private String email;
	private int id;
	private String phoneNum;
	private String password;
	private String address;
	private String state;
	private double gpa;
	private int sat;
	private String essay;
	private double income;
	private double AI;
	private Applicant next;///only used in case of email collision

	public Applicant() {
		super();
		income =-1;
		gpa=-1;
		sat=-1;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public Applicant getNext() {
		return next;
	}
	public void setNext(Applicant next) {
		this.next = next;
	}
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public int getSat() {
		return sat;
	}
	public void setSat(int sat) {
		this.sat = sat;
	}
	public String getEssay() {
		return essay;
	}
	public void setEssay(String fi) {
		this.essay = fi;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public double getAI() {
		return AI;
	}
	public void setAI(double aI) {
		AI = aI;
	}
	@Override
	public int compareTo(Applicant o) {
		return Double.compare(this.AI, o.getAI());
	}
	
}
