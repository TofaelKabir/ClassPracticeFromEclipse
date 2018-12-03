package oop.Inheritance;

public class TestHumanPhysic {

	public static void main(String[] args) {
		GrandPa gp = new GrandPa();
		gp.eyeColor();
		gp.straightHair();
		
		
		Daddy dy = new Daddy();
		dy.curlyHair();
		dy.eyeColor();
		dy.straightHair();
		
		Uncle un = new Uncle();
		un.brownEyes();
		un.eyeColor();
		un.straightHair();
		
		Me me = new Me();
		me.skinColor();
		me.curlyHair();
		me.eyeColor();
		me.straightHair();

		Son son = new Son();
		son.athletic();
		son.skinColor();
		son.curlyHair();
		son.eyeColor();
		son.straightHair();
		
		GrandSon gs = new GrandSon();
		gs.eyeColor();
		gs.straightHair();
		
		

	}

}
