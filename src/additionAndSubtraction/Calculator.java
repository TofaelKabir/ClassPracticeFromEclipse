package additionAndSubtraction;

public class Calculator {
	int a = 34;
	int b = 23;
	int c = a + b;
	int d = a - b;
	String name = "Casio";
	
 public void addition() {
	 System.out.println(c);
 }
 public void subtraction() {
	 System.out.println(d);
 }
 public int subtotal() {
	 int total = a+b+c+d;
	 System.out.println(total);
	 return total;
 }
 public void setName(String name) {
		this.name = name;
 }
 public String getName() {
		return name;
 }

}
