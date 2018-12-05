package additionAndSubtraction;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.addition();
		cal.subtraction();
		cal.subtotal();
		System.out.println("Our Calculator name is: "+cal.getName());
    }
}
