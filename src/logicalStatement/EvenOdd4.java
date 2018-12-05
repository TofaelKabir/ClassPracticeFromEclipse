package logicalStatement;

public class EvenOdd4 {

	public static void main(String[] args) {
		int value1 = 17;
		int value2 = 18;
		if (value1 % 2 == 0 & value1 > value2 ) {
			System.out.println(value1 + " is an even number and greater than" + " " + value2);
		}else if (value1 % 2 == 0 & value1 < value2){
			System.out.println(value1 + " is an even number and smaller than" + " " + value2);
		}else if (value1 % 2 == 0 & value1 == value2){
			System.out.println(value1 + " is an even number and equal to value2 which is" + " " + value2);
		}else if (value1 % 2 != 0 && value1 > value2){
			System.out.println(value1 + " is an odd number");
		}else if (value1 % 2 == 0 || value1 > value2){
			System.out.println(value1 + " is an even number and value1 might be greater than value2");
		}else if (value1 % 2 !=0 & value1 >= value2){
			System.out.println(value1 + " is an odd number and equal to value2 which is" + " " + value2);
		}else{
			System.out.println("There is no valid case");
		}

	}

}
	
