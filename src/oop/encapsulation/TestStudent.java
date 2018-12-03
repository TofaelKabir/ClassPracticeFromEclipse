package oop.encapsulation;

public class TestStudent {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.setStName("Mohammad Sharkar");
		st1.setStId(3743);
		st1.setDob("12-12-96");
		
		System.out.println(st1.getStName()+"  "+st1.getStId()+"  "+st1.getDob());
		
		Student st2 = new Student();
		st2.setStName("Mohammad Hafiz");
		st2.setStId(3789);
		st2.setDob("12-01-94");
		
		System.out.println(st2.getStName()+"  "+st2.getStId()+"  "+st2.getDob());
		
		Student st3 = new Student("Nur Islam", 3456, "05-09-90");
		System.out.println(st3.getStName()+"  "+st3.getStId()+"  "+st3.getDob());
		

	}

}
