//
// This is the Truck subclass
// which extends the vehicle superclass.
// it accepts coordinates as arguments
// and has a draw method which will 
// draw a truck to the display

import java.awt.Color;
import java.awt.Graphics;

public class Truck extends Vehicle {


	public Truck(int x, int y) {

		super(x,y);
	}



	public void draw(Graphics g) {

		g.setColor(Color.blue);
		g.drawRect(getX(), getY() + 20, 30,50);
		g.drawRect(getX() + 32, getY(), 150, 70);
		g.drawOval(getX() + 5, getY() + 70, 10, 10);
		g.drawOval(getX() + 35, getY() + 70, 10, 10);
		g.drawOval(getX() + 45, getY() + 70, 10, 10);
		g.drawOval(getX() + 170, getY() + 70, 10, 10);
		g.drawOval(getX() + 160, getY() + 70, 10, 10);



	}


}








