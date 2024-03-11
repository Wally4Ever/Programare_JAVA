import java.util.Scanner;

/*Read from the keyboard an integer value bigger than 16.777.216. 
 * Use bit masks for isolating each of the 4 bytes
of the read value. Display the initial and the isolated 
values as decimal, binary and hexadecimal strings*/
public class ValentinP_L3_7 {
	private static Scanner kb;

	public static void main(String[] args) {
		kb = new Scanner(System.in);
		System.out.println("Input integer larger than 16.777.216: ");
		int integer = kb.nextInt();
		if (integer <= 16777216) {
			System.out.println("Error! Value too small! Program wil terminate.");
			return;
		}
		int byte1 = (integer >> 24) & 0xFF;
		int byte2 = (integer >> 16) & 0xFF;
		int byte3 = (integer >> 8) & 0xFF;
		int byte4 = integer & 0xFF;
		System.out.println("Initial value: " + Integer.toBinaryString(integer));
		System.out.println("Byte 1: " + byte1 + " = " + Integer.toBinaryString(byte1));
		System.out.println("Byte 2: " + byte2 + " = " + Integer.toBinaryString(byte2));
		System.out.println("Byte 1: " + byte3 + " = " + Integer.toBinaryString(byte3));
		System.out.println("Byte 2: " + byte4 + " = " + Integer.toBinaryString(byte4));
	}
}