import java.util.Scanner;

/*Starting from the previous problem, copy the first 3 characters of the array to another array and display the
obtained result(use the arraycopy () method from the System class).*/
public class ValentinP_L3_3 {
	private static Scanner kb;

	public static void main(String[] args) {
		kb = new Scanner(System.in);
		System.out.println("Insert a string: ");

		String input = kb.nextLine();
		char arr[];
		arr = input.toCharArray();

		System.out.println("Insert one more: ");

		String input2 = kb.nextLine();
		char arr_copy[];
		arr_copy = input2.toCharArray();

		System.arraycopy(arr, 0, arr_copy, 0, 3);

//		System.out.printf("Resulting array is: %s", input);
//		System.out.println("\nResulting array is: " + input2);
		// System.out.printf("Resulting array is: %s", arr.toString()); //why it don't
		// work?
		// System.out.println("\nResulting array is: " + arr_copy.toString()); // is
		// .toString() why not work??
		System.out.print("Resulting array is: ");
		System.out.println(arr_copy);

	}
}
