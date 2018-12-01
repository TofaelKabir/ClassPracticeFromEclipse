package oop.encapsulation;

public class Employee {
	
	private String empName;
	private int epmID;
	private char sex;
	private boolean usaCitizen;
	
	
	public Employee () {
		System.out.println("This is from default constructor");
	}
	public Employee(String empName, int epmID, char sex, boolean usaCitizen) {
		this.empName = empName;
		this.epmID = epmID;
		this.sex = sex;
		this.usaCitizen = usaCitizen;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEpmID() {
		return epmID;
	}
	public void setEpmID(int epmID) {
		this.epmID = epmID;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public boolean isUsaCitizen() {
		return usaCitizen;
	}
	public void setUsaCitizen(boolean usaCitizen) {
		this.usaCitizen = usaCitizen;
	}
	

}
