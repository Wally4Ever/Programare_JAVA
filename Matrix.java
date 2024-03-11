import java.util.Arrays;
import java.util.Random;

/*Write a Java class that models a matrix of integer values. The dimensions and the array of elements are private
attributes and are controlled using appropriate setter-getter methods. 
Write the methods for displaying the
matrix, for determining and returning the number of 9 adjacent elements cells that don’t differ with more than
5% from a threshold value.
*/
public class Matrix {
	private int[][] matrix;
	private int row;
	private int col;

	public Matrix() {
		this.row = 3;
		this.col = 3;
		System.out.println("Default 3X3 matrix has been created! ");
		generateMatrix();
	}

	public Matrix(int row, int col) {
		this.row = row;
		this.col = col;
		this.matrix = new int[this.col][this.row];
		generateMatrix();
	}

	private void generateMatrix() {

		Random rand = new Random();
		for (int i = 0; i < getCol(); i++) {
			for (int j = 0; j < getRow(); j++) {
				matrix[i][j] = rand.nextInt(10);
			}
		}
	}

	public void displayMatrix() {
		System.out.println("Matrix is: ");
		for (int i = 0; i < getCol(); i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}

	public int sum() {
		int sum = 0;
		for (int i = 0; i < getCol(); i++) {
			for (int j = 0; j < getRow(); j++) {
				sum += getEl(i, j);
			}
		}
		return sum;
	}

	public void setEl(int row, int col, int n) {
		matrix[row][col] = n;
	}

	public int getEl(int row, int col) {
		return matrix[row][col];
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

}
