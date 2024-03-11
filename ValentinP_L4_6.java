import java.util.Random;
import java.util.Scanner;

/*Define a one-dimensional array of char type, less than a value n introduced from the keyboard. Each value
contains some randomly generated alpha-numerical characters. Generate a String object using the array.
Display the initial content of the array and after that, process all the elements so that all numbers will be
replaced with ‘*’. Display the result.*/

public class ValentinP_L4_6 {
	private static Scanner kb;

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter dimension: ");
		int dim = kb.nextInt();

		Random rand = new Random();
		char[] arr = new char[dim];
		String alphaNumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

		for (int i = 0; i < dim; i++) {
			arr[i] = alphaNumeric.charAt(rand.nextInt(alphaNumeric.length()));
		}
		// String str = Arrays.toString(arr);
		String str = new String(arr);
		System.out.println("Generated string: " + str);
		System.out.println("Modified string: " + str.replaceAll("\\d", "*"));

	}

}
