package returnTypeMethodFahim;

public class Calculator {
	public void additionAndDisplay(int a, int b) {
		int total = a+b;
		System.out.println(total);
		}
	public int addition(int c, int d) {
		int total = c+d;
		System.out.println(total);
		return total;
	}
}
