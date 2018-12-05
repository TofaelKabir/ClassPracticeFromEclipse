package logicalStatement;

public class CompareNumer3 {

	public static void main(String[] args) {
		int value1 = 63;
		int value2 = 53;
		int value3 = 45;
		if (value1>value2 & value3>50) {
			System.out.println(value1+"  is bigger than  "+value2);
		}else if (value1<value2){
			System.out.println(value1+ "  is smaller than  "+value2);
		//}else if(value1==value2){ //else if used, when we use the logic (Value1==Value2) OR WE CAN USE ONLY else
		}else { 
			System.out.println(value1+"  is equal to  "+value2);
		}

	}

}
