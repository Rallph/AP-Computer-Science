//Ralph Nahra
//
//This project will create an applet that displays two rectangles
//and their shared space

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Rectangle;
import java.applet.Applet;

public class U1A2b extends Applet {

	public void init() {

	setBackground(Color.yellow);


	}



	public void paint(Graphics g) {


		g.setColor(Color.blue);


		Rectangle one = new Rectangle(5, 10, 50, 80);
		Rectangle two = new Rectangle(20, 50, 65, 55);

		Rectangle three = one.intersection(two);

		int x = (int)three.getX();
		int y = (int)three.getY();
		int width = (int)three.getWidth();
		int height = (int)three.getHeight();


		g.drawRect(5, 10, 50, 80);
		g.drawRect(20, 50, 65, 55);
		g.setColor(Color.red);


		g.fillRect(x, y, width, height);


		}

}