import java.util.Scanner;

/*Write a Java class that models a matrix of integer values. The dimensions and the array of elements are private
attributes and are controlled using appropriate setter-getter methods. Write the methods for displaying the
matrix, for determining and returning the number of 9 adjacent elements cells that don’t differ with more than
5% from a threshold value.
*/
public class ValentinP_L4_3 {
	private static Scanner kb;

	public static void main(String[] args) {
		kb = new Scanner(System.in);

		System.out.println("Input no. of rows: ");
		int row = kb.nextInt();
		System.out.println("Input no. of columns: ");
		int col = kb.nextInt();

		Matrix bob = new Matrix(row, col);
		bob.displayMatrix();
		System.out.println("The sum of all the elements is: " + bob.sum());
	}

}
