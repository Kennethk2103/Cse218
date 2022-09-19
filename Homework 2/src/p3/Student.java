package p3;

public class Student {
	private String name;
	private int id;
	private String phonenum;
	private String major;
	private String registrationDate;
	public Student(String name, int id, String phonenum, String major, String registrationDate) {
		super();
		this.name = name;
		this.id = id;
		this.phonenum = phonenum;
		this.major = major;
		this.registrationDate = registrationDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(String registrationDate) {
		this.registrationDate = registrationDate;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", phonenum=" + phonenum + ", major=" + major
				+ ", registrationDate=" + registrationDate + "]";
	}
	
	
}
