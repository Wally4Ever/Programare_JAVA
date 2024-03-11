/*Define a class X that will have the following attributes: a private array of characters, a protected String object
and an integer without access specifier. The class will contain an explicit constructor, which will initialize the
attributes, accessor and mutator methods for fields that cannot be accessed outside the class and redefine the
finalize () method inherited from the Object class, which will display an appropriate message.*/
public class X {

	private char[] arr;
	protected String str;
	int nr;

	public char[] getArr() {
		return arr;
	}

	public void setArr(char[] arr) {
		this.arr = arr;
	}

	public X(String str, char[] arr, int nr) {
		this.str = str;
		this.arr = arr;
		this.nr = nr;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("\nObject garbage collected : " + this);
	}
}
