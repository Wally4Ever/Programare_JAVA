import java.util.Scanner;

/*Consider a Java interface that contains the prototypes of the methods of addition, subtraction, multiplication,
division, square root and raising a number to a certain power. All methods will have two double type parameters and
specify the returned double type.
Implement the interface so that operations are defined within a class. Instantiate the class and check the implemented
operations.
*/

public class ValentinP_L5_1 {
	private static Scanner kb;

	public static void main(String[] args) {
		double a, b;
		kb = new Scanner(System.in);
		System.out.println("Input two numbers: ");
		a = kb.nextDouble();
		b = kb.nextDouble();
		Numeros nr = new Numeros();
		System.out.println("Sum is: " + nr.plus(a, b));
		System.out.println("Difference is: " + nr.minus(a, b));
		System.out.println("Multiplication is: " + nr.multiply(a, b));
		System.out.println("Division is: " + nr.divide(a, b));
		System.out.println(a + " to the power of " + b + " is: " + nr.raisePower(a, b));
	}
}

interface Calc {
	public double plus(double a, double b);

	public double minus(double a, double b);

	public double multiply(double a, double b);

	public double divide(double a, double b);

	public double raisePower(double a, double b);
	// public double squareRoot(int a, int b);
	// don't get it, why two params if it's square root?
	// can use

}

class Numeros implements Calc {

	public double plus(double a, double b) {
		return a + b;
	}

	public double minus(double a, double b) {
		if (a > b)
			return a - b;
		else
			return b - a;
	}

	public double multiply(double a, double b) {
		return a * b;
	}

	public double divide(double a, double b) {
		return a / b;
	}

	public double raisePower(double a, double b) {
		if (b > 0)
			return a * raisePower(a, b - 1);
		else
			return 1;
	}
// public double squareRoot(int a, int b) {
//	use Math.sqrt(numar);
//}

}
