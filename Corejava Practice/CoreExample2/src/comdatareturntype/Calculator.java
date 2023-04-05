package comdatareturntype;

public class Calculator {

	public int addition(int a, int b) {

		int c = a + b;
		System.out.println(a + " " + b);
		return c;
	}

	public int substraction(int a, int b) {

		int c = a - b;
		System.out.println(a + " " + b);
		return c;
	}

	public int multiplication(int a, int b) {

		int c = a * b;
		return c;
	}

	public double division(double d1, double d2) {

		double d = d1 / d2;
		return d;
	}

	public float division(float d1, float d2) {

		float f = d1 / d2;
		return f;
	}

	public static void main(String[] args) {

		System.out.println("Main method started.....");

		Calculator cal = new Calculator();
         
		System.out.println("ADDITION");
		
		int sum = cal.addition(100, 200);
		System.out.println(sum);
		
		System.out.println("SUBSTRACTION");

		System.out.println(cal.substraction(300, 100));
		
		System.out.println("MULTIPLCATION");

		int multi = cal.multiplication(40, 40);
		System.out.println(multi);

		System.out.println("DIVISION");
		
		double d = cal.division(100.123, 100.123);
		System.out.println(d);

		float f = cal.division(100.1f, 200.2f);
		System.out.println(f);

	}

}
