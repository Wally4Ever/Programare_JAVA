import java.text.SimpleDateFormat;
import java.util.Calendar;
/*Write an application which defines a class named Child. Define the methods and member variables for this class
which enable a Child object to store/do the following:
- the name of the child
- the child’s birthday
- the child can introduce him/herself by „saying”: Hello my name is ...
- the child can tell his/her age
- the child can add two numbers smaller than 10 and return the result like so: The sum of X and Y is equal to Z
- the child knows how to say Goodbye!
- the child can speak the alphabet both in direct and inverse order
- the child can color a chess board given its dimensions by using alternative colors (for the colors use the
symbols 1 and 0)
- the child can play dots and crosses (X-0) by him/herself 😊 (use the application developed in the previous
homework)
Remarks: the child’s name and birthday cannot be accessed from outside the class.
All the information about a Child will be filled-in using a Child object and its associated methods and variables.
The interaction with the child will be done through an object which is instantiated in the main method.*/

public class Child {
	private String name;
	private Calendar birthday;
	public ValentinP_L3_11 game;

	public Child() {
		this.name = "Error404";
		this.birthday = Calendar.getInstance();
		// this.birthday = Calendar.;
		game = new ValentinP_L3_11();
	}

	public Child(String name, int day, int month, int year) {
		this.name = name;
		this.birthday = Calendar.getInstance();
		this.birthday.set(year, month - 1, day);
		game = new ValentinP_L3_11();
	}

	public void sayHello() {
		System.out.println("Hello! My name is " + getName());
	}

	public void sayAge() {
		Calendar today = Calendar.getInstance();
		int age = today.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);
		// check if it's past birthday in current year
		if (today.get(Calendar.DAY_OF_YEAR) > birthday.get(Calendar.DAY_OF_YEAR))
			age--;
		System.out.println("I am " + age + " years old!");
	}

	public void addNr(int a, int b) {
		if (a < 10 && b < 10)
			System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
		else
			System.out.println("I'm sorry, I can't add numbers that large :(");
	}

	public void sayBye() {
		System.out.println("Goobye!!!");
	}

	public void sayAlphabet() {
		System.out.println("I can say the alphabet!");
		for (char c = 'a'; c <= 'z'; c++) {
			// x = (char) c;
			System.out.print(c + " ");
		}
		System.out.println("\nI can even say it backward! ");
		for (char c = 'z'; c >= 'a'; c--) {
			System.out.print(c + " ");
		}
		System.out.println();
	}

	public void colorBoard(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print((j + i) % 2);
			}
			System.out.println();
		}
	}

	public Calendar getBirthday() {
		return birthday;
	}

	public void setBirthday(int year, int month, int day) {
		this.birthday.set(year, month - 1, day);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Child kid = new Child("Danut", 7, 4, 2010);
		// Child kid = new Child();
		kid.sayHello();
		// calendar to string
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("My birthdat is: " + format.format(kid.getBirthday().getTime()));
		kid.sayAge();

		kid.addNr(11, 12);
		kid.addNr(5, 6);
		kid.sayAlphabet();
		kid.colorBoard(3);
		kid.game.play();
		kid.sayBye();
	}

}
