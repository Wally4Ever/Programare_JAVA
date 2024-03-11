import java.util.Scanner;

//Read a string from the standard input. Turn the string into a character array. 
//Look for in this array a character
//specified in the program. Display the number of occurrences.
public class ValentinP_L3_2 {
	private static Scanner kb;

	public static void main(String[] args) {
		kb = new Scanner(System.in);
		System.out.println("Insert a string: ");

		String input = kb.next();

		char arr[];
		arr = input.toCharArray();

		System.out.println("\nWhat character to look for in the input? ");

		char look = kb.next().charAt(0);

		int nr = 0;
		for (int i = 0; i < arr.length; i++)
			if (arr[i] == look)
				nr++;

		System.out.println("\nThe character appears " + nr + " times in the input");
	}
}
