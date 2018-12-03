package oop.encapsulation;

public class Student {
	private String StName;
	private int StId;
	private String dob;
	
	public Student() {
		System.out.println("This is from default constructor");
	}
	public Student(String stName, int stId, String dob) {
		this.StName = stName;
		this.StId = stId;
		this.dob = dob;
	}
	public String getStName() {
		return StName;
	}
	public void setStName(String stName) {
		StName = stName;
	}
	public int getStId() {
		return StId;
	}
	public void setStId(int stId) {
		StId = stId;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}

}
