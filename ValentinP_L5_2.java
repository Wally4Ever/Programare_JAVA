import java.util.Scanner;

/*Define an interface called GeometricForm that contains methods which return the area and perimeter of the
geometric form. Implement the interface for: squares, rectangles, circles, equilateral triangles and isosceles triangles.
Read from the keyboard N distinct geometric forms specified by their type and specific parameters (for example for a
circle, you would need to read its radius). Compute the total area and perimeter of all the geometric forms, taking into
account the fact that they do not overlap*/

interface GeometricForm {
	double getArea();

	double getPerim();
}

class Square implements GeometricForm {

	private double side;

	public Square(double side) {
		this.side = side;
	}

	@Override
	public double getArea() {
		return side * side;

	}

	@Override
	public double getPerim() {
		return 4 * side;
	}
}

class Rectangle implements GeometricForm {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getPerim() {
		return 2 * (width + height);
	}
}

class Circle implements GeometricForm {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	@Override
	public double getPerim() {
		return 2 * Math.PI * radius;
	}
}

class Echilateral implements GeometricForm {
	private double side;

	public Echilateral(double side) {
		this.side = side;
	}

	public double getArea() {
		return (Math.sqrt(3) / 4) * side * side;
	}

	public double getPerim() {
		return 3 * side;
	}
}

class Isoscel implements GeometricForm {
	private double base;
	private double side;

	public Isoscel(double base, double side) {
		this.base = base;
		this.side = side;
	}

	public double getArea() {
		return 0.5 * base * Math.sqrt(side * side - (base * base / 4));
	}

	public double getPerim() {
		return 2 * side + base;
	}
}

public class ValentinP_L5_2 {
	private static Scanner kb;

	public static void main(String[] args) {
		kb = new Scanner(System.in);
		System.out.println("Number of geometric figures: ");
		int n = kb.nextInt();

		GeometricForm[] forms = new GeometricForm[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Form #" + (i + 1));
			System.out.print("Enter type (square, rectangle, circle, equilateral , isosceles): ");
			String form = kb.next();
			switch (form) {
			case "square":
				System.out.print("Enter side length: ");
				double side = kb.nextDouble();
				forms[i] = new Square(side);
				break;
			case "rectangle":
				System.out.print("Enter width: ");
				double width = kb.nextDouble();
				System.out.print("Enter height: ");
				double height = kb.nextDouble();
				forms[i] = new Rectangle(width, height);
				break;
			case "circle":
				System.out.print("Enter radius: ");
				double radius = kb.nextDouble();
				forms[i] = new Circle(radius);
				break;
			case "equilateral":
				System.out.print("Enter side length: ");
				double eqSide = kb.nextDouble();
				forms[i] = new Echilateral(eqSide);
				break;
			case "isosceles":
				System.out.print("Enter base length: ");
				double isoBase = kb.nextDouble();
				System.out.print("Enter side length:");
				double isoSide = kb.nextDouble();
				forms[i] = new Isoscel(isoBase, isoSide);
				break;
			default:
				System.out.println("\nWrong input!");
				i--;
				break;
			}

		}
		double totArea = 0;
		double totPerim = 0;
		for (int i = 0; i < n; i++) {
			totArea += forms[i].getArea();
			totPerim += forms[i].getPerim();
		}
		System.out.println("Total area of forms is " + totArea + " while the length of all forms is " + totPerim);
	}
}