
/*From the main ()
method, defined in another class, call the methods of the Methods class and 
display the results on the screen(the call values for the first method and 
the character string for the 3rd method will be defined in main ()).
*/
import java.util.Arrays;
import java.util.Scanner;

class ValentinP_L4_1 {
	private static Scanner kb;

	public static void main(String... args) {

		kb = new Scanner(System.in);

		System.out.println("Number of integers: ");
		int n = kb.nextInt();

		System.out.println("Array's integers: ");
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		Methods obj = new Methods();

		System.out.println("Average is: " + obj.avg(arr));

		double sir[] = new double[n];
		sir = obj.newArr(n);
		System.out.println("Array on randomized double values is:\n" + Arrays.toString(sir));

		System.out.print("\nEnter the number of characters: ");
		n = kb.nextInt();

		char w[] = new char[n];
		System.out.print("Enter characters: ");

		for (int i = 0; i < n; i++) {
			w[i] = kb.next().charAt(0);
		}
		System.out.println("The new string is: " + Methods.toUpper(w));

	}
}