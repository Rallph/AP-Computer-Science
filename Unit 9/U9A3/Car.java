// Ralph Nahra
// 
// This is the code for the car class which  
// is a subclass of the Vehicle superclass
// It has a draw method which will draw a car
// on the display window


import java.awt.Color;
import java.awt.Graphics;

public class Car extends Vehicle {

	public Car(int x, int y) {

		super(x,y);
	}

	public void draw(Graphics g) {

		g.setColor(Color.red);

		g.drawRect(getX() + 20, getY(), 40, 10);
		g.drawRect(getX(), getY() + 10, 80, 20);
		g.drawOval(getX() + 15, getY() + 30, 10, 10);
		g.drawOval(getX() + 65, getY() + 30, 10, 10);

	}

}