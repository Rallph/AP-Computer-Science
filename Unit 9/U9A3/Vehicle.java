// Ralph Nahra
//
// This is the code for the Vehicle class,
// which is abstract. It takes x and y coordinates
// as arguments, and has accessor methods for them,
// as well as an abstract draw method

import java.awt.Graphics;

public abstract class Vehicle {

	int initX;
	int initY;

	public Vehicle(int x,int y) {

		initX= x;
		initY = y;
	}

	public int getX() {

		return initX;
	}

	public int getY() {

		return initY;
	}

	public abstract void draw(Graphics g);

}