import java.util.Scanner;

/*Develop a class hierarchy of shapes and write a program that computes the amount of paint needed to paint different
objects. The hierarchy will consist of a parent class Shape with three derived classes - Sphere, Rectangle, and Cylinder.
For the purposes of this exercise, the only attribute a shape will have is a name and the method of interest will be one
that computes the area of the shape (surface area in the case of three-dimensional shapes). Do the following.

A. Write an abstract class Shape with the following members:
- an instance variable shapeName of String type
- an abstract method area()
- a toString() method that returns the name of the shape

B. The file Sphere.java contains the Sphere class which is a descendant of Shape. A sphere has a radius as a private
integer variable and implements the body of the inherited abstract method area().

C. Define similar classes for a rectangle and a cylinder. The classes Rectangle and Cylinder are also derived from the
Shape class. A rectangle is defined by its length and width. A cylinder is defined by a radius and height.
Note: Each of the derived classes override the toString method and define specific mutator and accessor methods*/

abstract class Shape {
	private String shapeName;

	public abstract double area();

	public String toString() {
		return "This is a shape";
	}

	public String getShapeName() {
		return shapeName;
	}

	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}
}

class Sphere extends Shape {

	private int radius;

	public Sphere(int radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius * 4;
	}

	@Override
	public String toString() {
		return "This is a sphere";
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

}

class Rectangl extends Shape {

	private int width;
	private int height;

	public Rectangl(int width, int height) {
		this.height = height;
		this.width = width;
	}

	@Override
	public double area() {
		return width * height;
	}

	@Override
	public String toString() {
		return "This is a rectangle";
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}

class Cylinder extends Shape {
	private int radius;
	private int height;

	public Cylinder(int radius, int height) {
		this.radius = radius;
		this.height = height;
	}

	@Override
	public double area() {
		return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		return "This is a Cylinder";
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}

interface Paint {
	final float paintPerSurface = 1;
}

public class ValentinP_L5_3 implements Paint {
	private static Scanner kb;

	public static void main(String[] args) {
		kb = new Scanner(System.in);
		System.out.println("Sphere: R ");
		int in = kb.nextInt();
		Sphere ball = new Sphere(in);
		System.out.println(ball.toString());

		System.out.println("Rectangle: LxW ");
		in = kb.nextInt();
		int in2 = kb.nextInt();
		Rectangl deck = new Rectangl(in, in2);
		System.out.println(deck.toString());

		System.out.println("Cylinder: RxH ");
		in = kb.nextInt();
		in2 = kb.nextInt();
		Cylinder tank = new Cylinder(in, in2);
		System.out.println(tank.toString());

		System.out.printf("Paint needed for sphere: %.2f\n", ball.area() * paintPerSurface);
		System.out.printf("Paint needed for rectangle: %.2f\n", deck.area() * paintPerSurface);
		System.out.printf("Paint needed for cylinder: %.2f\n", tank.area() * paintPerSurface);
	}
}
