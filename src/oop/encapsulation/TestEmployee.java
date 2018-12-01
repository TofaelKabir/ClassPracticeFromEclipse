package oop.encapsulation;

public class TestEmployee {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setEmpName("Mohammad Sharkar");
		emp1.setEpmID(2188458);
		emp1.setSex('M');
		emp1.setUsaCitizen(false);
		 
		System.out.println(emp1.getEmpName()+"  "+emp1.getEpmID()+"  "+emp1.getSex()+"  "+emp1.isUsaCitizen());
        
		Employee emp2 = new Employee("Nishat Sultana", 288352, 'F',true);
		System.out.println(emp2.getEmpName()+" "+emp2.getEpmID()+" "+emp2.getSex()+" "+emp2.isUsaCitizen());
		
		//Employee emp3 = new Employee();
		//emp3.empName //it is not possible to call private variable
	}

}
