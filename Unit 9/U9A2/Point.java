// Ralph Nahra
//
// This is the code for the Point class, whcih is a
// superclass for the Line class. It plots a point as an
// asterisk on a JApplet

import java.awt.Graphics;

public class Point {


	private int x, y;
	private static int count = 0;
	private int inc = 0;

	public Point(int xc,int yc) {

		x = xc;
		y = yc;
		inc = count;
	}

	public void drawPoint(Graphics g) {

		g.drawString("*", x, y);
		x += 10;
		count += 10;
		inc = count;
	}

	public void adjust() {

		x -= inc;
		y+= 10;
		count = 0;
	}
}