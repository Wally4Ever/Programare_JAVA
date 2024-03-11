import java.util.Scanner;

/*Instead of an interface that contains all the aforementioned methods, implement 4 functional interfaces, one for
each method.
The interfaces will be implemented within a single class. Instantiate the class and check the implemented operations.*/
public class ValentinP_L5_1_1 implements T1, T2, T3, T4 {
	private static Scanner kb;

	public static void main(String[] args) {
		double a, b;
		kb = new Scanner(System.in);
		System.out.println("Input two numbers: ");
		a = kb.nextDouble();
		b = kb.nextDouble();

		ValentinP_L5_1_1 obj = new ValentinP_L5_1_1();

		System.out.println("Sum is: " + obj.plus(a, b));
		System.out.println("Difference is: " + obj.minus(a, b));
		System.out.println("Multiplication is: " + obj.multiply(a, b));
		System.out.println("Division is: " + obj.divide(a, b));
	}

	public double divide(double a, double b) {
		return a / b;
	}

	public double multiply(double a, double b) {
		return a * b;
	}

	public double minus(double a, double b) {
		if (a > b)
			return a - b;
		else
			return b - a;
	}

	public double plus(double a, double b) {
		return a + b;
	}
}

interface T1 {
	public double plus(double a, double b);
}

interface T2 {
	public double minus(double a, double b);
}

interface T3 {
	public double multiply(double a, double b);
}

interface T4 {
	public double divide(double a, double b);
}
