import java.util.Scanner;

/*Develop a Java program which defines a class named Person that contains as private attributes: name
(String), latitude and longitude (float). The class contains an explicit constructor without parameters that
will initialize the latitude and longitude with 0 and the string with null. A finalize() method will be used
as a destructor from C++ and will display a message. The mutator methods, setName(), setLongitude() and
setLatitude() will be defined to modify the attributes of the class. Define appropriate accesor methods.


Instantiate n objects, read the corresponding data from the keyboard and display the information related to all
the objects.
*/
public class ValentinP_L4_4 {
	private static Scanner kb;

	public static void main(String[] args) {
		kb = new Scanner(System.in);

		System.out.println("Number of people in squad: ");
		int nr = kb.nextInt();

		Person[] squad = new Person[nr];
		for (int i = 0; i < nr; i++) {
			squad[i] = new Person(); // if written in readPerson, error: squad[i] is null.

			readPerson(squad[i]);
		}

		for (int i = 0; i < nr; i++) {
			squad[i].outPerson();
			squad[i] = null;
		}
		System.gc();

	}

	public static void readPerson(Person soldier) {

		// soldier = new Person();
		// I thought for an instance of a class the modifications are visible in main()?
		System.out.println("Name of soldier: ");
		soldier.setName(kb.next());
		System.out.println("Location of soldier (latitude, longitude): ");
		soldier.setLat(kb.nextFloat());
		soldier.setLon(kb.nextFloat());

	}
}
