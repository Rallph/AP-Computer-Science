//
//This is the code for the RightTriangle class, which implements
//the Shape and Comparable interfaces and can determine the area
//and perimeter of a triangle with two given leg lengths.

public class RightTriangle implements Shape, Comparable
{
	private double leg1;
	private double leg2;

	public RightTriangle(double x, double y) {

		leg1 = x;
		leg2 = y;
	}

	//Determines and returns area of right triangle
	public double area() {

		return
	}

	//Determines and returns perimeter of right triangle
	public double perimeter() {



		return ;
	}

	public int compareTo(Object obj) {
	//The EXACT SAME as compareTo in Rectangle.class
		
		return 0;
	}

	public String toString() {

		return "Right Triangle[" + leg1 + ", " + leg2 + "]";
	}
}








