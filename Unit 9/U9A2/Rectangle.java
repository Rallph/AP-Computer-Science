//
// This is the code for the rectangle class which uses the Line class in order
// to print Rectangles in a Java Applet

import java.awt.Graphics;

public final class Rectangle extends Line {

	private int width;

	public Rectangle(int xc, int yc, int l, int w) {

		super(xc,yc,l);
		width = w;
	}

	public void drawRect(Graphics g) {

		for (int i = 0;i <= width; i++)
			drawLine(g);

	}
}








