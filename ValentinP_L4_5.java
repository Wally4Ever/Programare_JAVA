
/*Build a Java application that tests the new methods of the String class, introduced in Java11.*/
public class ValentinP_L4_5 {

	public static void main(String[] args) {

		String str = "Software engineering is a lifestyle";

		System.out.println("Blank? " + str.isBlank());

		str = "Software\nis\nlife\n";
		System.out.println("Lines in string:");
		str.lines().forEach(System.out::println);

		str = "Hello! ";
		String repeatedStr = str.repeat(3);
		System.out.println("String*3: " + repeatedStr);

		str = "    This is string     ";
		System.out.println("Trimmed string: " + str.strip());

		System.out.println("Leading spaces removed is: " + str.stripLeading());

		System.out.println("Trailing spaces removed is: " + str.stripTrailing());

	}

}
