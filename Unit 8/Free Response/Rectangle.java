//
//This is the class for the Rectangle class, which implements
//the Shape class and can find area and perimeter when given
//the length and width.

public class Rectangle implements Shape, Comparable
{
	private double length;
	private double width;

	public Rectangle(double len, double wid) {

		length = len;
		width = wid;
	}

	//Determines and returns area of the rectangle
	public double area() {

		return length * width;
	}

	//Determines and returns area of rectangle
	public double perimeter() {

		return (2 * length) + (2 * width);
	}

	//Returns 1 if area of rectangle references by this is larger
	//Returns -1 if area of rectangle references by obj is larger
	//
	//If areas are equal, check perimeters. If perimieteres are
	//equal return 0. Return 1 if perimieter of rectangle referenced
	//by this is larger. Return -1 if perimeter of rectangle
	//references by obj is larger. IT IS POSSIBLE YOU COULD BE
	//COMPARING A RECTANGLE TO SOME OTHER SHAPE IN THIS METHOD.
	public int compareTo(Object obj) {

		Shape s = (Shape)obj;

		if (this.area() > s.area())
			return 1;
		else if (this.area() < s.area())
			return -1;
		else if (this.area() == s.area()) {

			if (this.perimeter() > s.perimeter())
				return 1;
			else if (this.perimeter < s.perimeter())
				return -1;
			else return 0;
		}

		return 0;
	}

	public String toString() {

		return "Rectangle [" + length + ", " + width + "]";
	}
}









