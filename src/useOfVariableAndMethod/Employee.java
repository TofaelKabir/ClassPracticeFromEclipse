package useOfVariableAndMethod;

public class Employee {
	String fullName;
	int salary;
	char sex;
	boolean usCitizen;
	int evaluation;
	
	
	public void employeeInfo() {
		System.out.println("Employee Name: "+fullName+ ", His/Her Salry: "+salary+", Sex: "+sex+", US Citizen: "+usCitizen);
	}

	public int evaluationNumber() {
		return evaluation;
		
	}
}
