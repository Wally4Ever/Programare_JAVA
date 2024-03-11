import java.util.Random;

/*Write a Java program that generates 2 random values and performs 
 * some mathematical operations on them*/
public class ValentinP_L3_6 {

	public static void main(String[] args) {

		Random rand = new Random();
		int a = rand.nextInt(50) + 1;
		int b = rand.nextInt(50) + 1;

		System.out.println("a=" + a);
		System.out.println("b=" + b);

		System.out.printf("Sum: %d\n", a + b);
		System.out.printf("Difference: %d\n", a - b);
		System.out.println("Product: " + a * b);
		System.out.printf("Average: %.2f\n", (a + b) / 2.00);
	}
}
