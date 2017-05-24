// Ralph Nahra
//
// The Line class extends the Point class and contains
// extra methods in order to print points a certain number
// of times in order to create a line


import java.awt.Graphics;

public class Line extends Point {

	private int len;

	public Line (int x, int y, int l) {

		super(x,y);
		len = l;
	}

	public void drawLine(Graphics g) {

		for (int i = 0; i <= len; i++)
			drawPoint(g);
		adjust();
	}

}