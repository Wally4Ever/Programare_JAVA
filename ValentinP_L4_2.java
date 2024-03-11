import java.util.Arrays;
import java.util.Scanner;
/*Define a class X that will have the following attributes: a private array of characters, a protected String object
and an integer without access specifier. The class will contain an explicit constructor, which will initialize the
attributes, accessor and mutator methods for fields that cannot be accessed outside the class and redefine the
finalize () method inherited from the Object class, which will display an appropriate message.*/
/*
In the main() method, placed in another class, create an object of X class, display the attribute values, and then
prepare the object to be removed by garbage collector. Then create a new X object, change the attribute values,
and display their attribute values.*/

public class ValentinP_L4_2 {

	private static Scanner kb;

	public static void main(String[] args) {

		kb = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String str = kb.next();

		System.out.println("Enter a number: ");
		int n = kb.nextInt();

		char[] arr = new char[str.length()];
		arr = str.toCharArray();
		arr[0] = 'x';

		X obj = new X(str, arr, n);
		System.out.println("String is " + obj.str + " char array is " + Arrays.toString(obj.getArr())
				+ " followed by number " + obj.nr);
		obj = null;
		System.gc();
	}
}
