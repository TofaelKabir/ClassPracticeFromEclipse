package logicalStatement;

public class EvenOdd2 {

	public static void main(String[] args) {
		int value1 = 15;
		int value2 = 8;
		if (value1 % 2 == 0 && value1 > value2 ) {
			System.out.println(value1 + " is an even number and greater than" + " " + value2);
		}else if ((value1 % 2 == 0) && (value1 < value2)){
			System.out.println(value1 + " is an even number and smaller than" + " " + value2);
		}else if (value1 % 2 != 0 && value1 > value2){
			System.out.println(value1 + " is not an even number and greater than" + " " + value2);
		}else if (value1 % 2 != 0 && value1 < value2){
			System.out.println(value1 + " is not an even number and smaller than" + " " + value2);
		}

	}

}
	
