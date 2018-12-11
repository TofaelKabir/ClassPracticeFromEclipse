package oop.Inheritance;
 
public class GrandPa {
	//public final int age; //final variable can't be declared, must be initialize
	public final int age = 100;
	public void eyeColor() {
		System.out.println("GrandPa has blue eyes and his age is : "+age);
	}	
	public void straightHair() {
		System.out.println("Grandpa has straight hair");
	}
}

//GrandPa = Super Class
//Daddy, Uncle, Me, Son, GrandSon = Sub Class
//Single Inheritance: GrandPa -- Daddy
//MultiLevel Inheritance: GrandPa -- Daddy -- Me -- Son
//Hierarchical Inheritance: GrandPa -- Daddy, GrandPa -- Uncle, GrandPa -- GrandSon etc.


//tofaelKabir