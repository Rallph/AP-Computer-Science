// Ralph Nahra
//
// This is the driver class for U9A3
// which will generate 10 cars or trucks
// and draw them in random locations
// in the display window 



import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Container;
import java.awt.Color;
import java.util.ArrayList;

public class U9A3 extends JFrame {

	ArrayList<Vehicle> list = new ArrayList<Vehicle>();


	public U9A3() {


		super("Unit 9 Assignment 3");
		Container c = getContentPane();
		c.setBackground(Color.yellow);



		for (int i = 0; i < 10; i++) {

			int lX, lY;
			int vc = (int)(Math.random() *2);

			if (vc == 0) {

				lY = (int)((Math.random() * 400) + 50);
				lX = (int)((Math.random() * 400) + 20);

				list.add(new Car(lX, lY));

			} else {

				lY = (int)((Math.random() * 370) + 50);
				lX = (int)((Math.random() * (480 - 182)) + 20);

				list.add(new Truck(lX, lY));
			}

		}

	}


	public static void main(String[] args) {

		U9A3 x = new U9A3();
		x.setSize(500,500);
		x.setVisible(true);
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void paint(Graphics g) {

		super.paint(g);

		for (int i = 0; i < 10; i++) {

			Vehicle v = list.get(i);
			v.draw(g);
		}
	}


}