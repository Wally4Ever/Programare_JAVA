import java.util.Scanner;

/*Use the structure used at 1’ and implement lambda expressions to define the arithmetic operations. Check the
functionality*/
public class ValentinP_L5_1_2 {
	private static Scanner kb;

	public static void main(String[] args) {
		double a, b;
		kb = new Scanner(System.in);
		System.out.println("Input two numbers: ");
		a = kb.nextDouble();
		b = kb.nextDouble();

		T1 add = (double x, double y) -> (x + y);
		T2 subtract = (double x, double y) -> (x - y);
		T3 multiply = (double x, double y) -> (x * y);
		T4 divide = (double x, double y) -> (x / y);

		System.out.println("Sum is: " + add.plus(a, b));
		System.out.println("Difference is: " + subtract.minus(a, b));
		System.out.println("Multiplication is: " + multiply.multiply(a, b));
		System.out.println("Division is: " + divide.divide(a, b));
	}

}
