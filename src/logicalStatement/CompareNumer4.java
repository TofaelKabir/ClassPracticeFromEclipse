package logicalStatement;

public class CompareNumer4 {

	public static void main(String[] args) {
		int value1 = 64;
		int value2 = 64;
		if (value1>value2) {
			System.out.println(value1+"  is bigger than  "+value2);
		}else if (value1<value2){
			System.out.println(value1+ "  is smaller than  "+ value2);
		}else if (value1!=value2){ 
			System.out.println(value1+"  is not equal to  "+ value2);
		}else if (value1==value2){ //Equality operator(==)
			System.out.println(value1+"  is equal to  "+ value2);
		}

	}

}
//https://www.geeksforgeeks.org/difference-equals-method-java/
