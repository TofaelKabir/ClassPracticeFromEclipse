package oop.abstraction;

public abstract class MedicalSchool implements Hospital {
	public abstract void anatomyLab();
	public void bioChemistryLab() {
		System.out.println("Biochemistry lab is extremely equiped");
	}

}
