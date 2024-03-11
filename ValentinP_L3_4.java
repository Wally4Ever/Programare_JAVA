import java.util.Scanner;

/*Write a Java application which defines an integer value and displays it as a binary, octal and hexadecimal string.
Write various bases convertion methods. */
public class ValentinP_L3_4 {
	private static Scanner kb;

	public static void main(String[] args) {
		kb = new Scanner(System.in);
		System.out.println("Input integer: ");
		int integer = kb.nextInt();
		System.out.println("Integer in binary: " + Integer.toBinaryString(integer));
		System.out.println("Integer in binary: " + convertBinary(integer));
		System.out.println("Integer in octal: " + Integer.toOctalString(integer));
		System.out.println("Integer in octal: " + toOctal(integer));
		System.out.println("Integer in hexadecimal: " + Integer.toHexString(integer));

	}

	public static String convertBinary(int x) {
		if (x == 0) {
			return "0";
		}
		String binar = new String();
		while (x > 0) {
			int rest = x % 2;
			binar = rest + binar;
			x /= 2;
		}
		return binar;
	}

	public static String toOctal(int num) {
		if (num == 0) {
			return "0";
		}
		String octal = "";
		while (num > 0) {
			int rest = num % 8;
			octal = rest + octal; // concatenate the remainder to the beginning of the string
			num = num / 8;
		}
		return octal;
	}

}