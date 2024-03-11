/*Develop a Java program which defines a class named Person that contains as private attributes: name
(String), latitude and longitude (float). The class contains an explicit constructor without parameters that
will initialize the latitude and longitude with 0 and the string with null. A finalize() method will be used
as a destructor from C++ and will display a message. The mutator methods, setName(), setLongitude() and
setLatitude() will be defined to modify the attributes of the class. Define appropriate accesor methods.
Instantiate n objects, read the corresponding data from the keyboard and display the information related to all
the objects.
*/
public class Person {
	private String name;
	private float lat;
	private float lon;

	public Person() {
		this.lat = 0;
		this.lon = 0;
		this.name = null;
	}

	public void outPerson() {
		System.out.println("Soldier " + getName() + " is at location " + getLat() + " - " + getLon());
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Person MIA. Ceasing search and rescue op");
	}

	public float getLat() {
		return lat;
	}

	public void setLat(float lat) {
		this.lat = lat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getLon() {
		return lon;
	}

	public void setLon(float lon) {
		this.lon = lon;
	}

}
