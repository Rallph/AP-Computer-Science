//
// This program will create and display Rectangles that use the Line class
// onto a Java Applet

import javax.swing.JApplet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Container;

public class U9A2 extends JApplet {

	public void init() {

		Container c = getContentPane();
		c.setBackground(Color.yellow);
	}


	public void paint(Graphics g) {

		super.paint(g);
		g.setColor(Color.green);
		Rectangle r1 = new Rectangle(25, 30, 10, 5);
		Rectangle r2 = new Rectangle(75, 100, 15, 3);
		Rectangle r3 = new Rectangle(50, 200, 8, 12);

		r1.drawRect(g);
		r2.drawRect(g);
		r3.drawRect(g);
	}
}








