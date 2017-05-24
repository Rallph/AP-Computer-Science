//Incomplete U9 FRQ Parallelogram class

public class Parallelogram extends Quadrilateral {

	private Point topLeft;
	private Point botLeft;
	private Point botRight;

	public Parallelogram(String lbl, Point tL, Point bL, Point bR) {

		super(lbl);
		topLeft = tL;
		botLeft = bL;
		botRight = bR;
	}

	public double perimeter() {

		return (2 * distance(botLeft, botRight)) + (2 * distance(botLeft, topLeft));
	}

	public double area() {

		return (topLeft.getY() - botLeft.getY()) * distance(botLeft,botRight);
	}
}

