import java.util.Random;

/*Write a class named Methods having 3 methods: a method with a variable number 
 * of integer parameters, which returns the arithmetic mean of the parameters; 
 * another method in which will be defined a one-dimensional
array of n double-type numbers (n being the parameter of the method and which
 will be read in main () from the keyboard), its elements will receive 
 randomly generated values and the method will return this array; a
static method that receives as a parameter a character array, converts the 
respective characters into uppercase letters and forms a String object 
from this array, which wiil be returned by the function. */
public class Methods {

	public float avg(int... sir) {

		int sum = 0;
		for (int j : sir)
			sum += j;
		return (float) sum / sir.length;

	}

	public double[] newArr(int n) {

		Random rand = new Random();
		double arr[] = new double[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextDouble();
		}
		return arr;
	}

	public static String toUpper(char[] x) {

		for (int i = 0; i < x.length; i++) {

			x[i] = Character.toUpperCase(x[i]);
		}
		return new String(x);
	}
}