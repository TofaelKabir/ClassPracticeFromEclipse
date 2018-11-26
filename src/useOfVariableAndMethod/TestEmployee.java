package useOfVariableAndMethod;

public class TestEmployee {

	public static void main(String[] args) {
		Employee myEmployee = new Employee();
		myEmployee.fullName = "Mohammad Sharkar";
		myEmployee.salary = 58600;
		myEmployee.sex = 'M';
		myEmployee.usCitizen = false;
		
		myEmployee.employeeInfo();
		
		myEmployee.evaluationNumber();
		System.out.println("His/Her Evaluation number in 10 is: "+8);

	}

}
