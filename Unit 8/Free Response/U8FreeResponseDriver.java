//
//This is the Driver Class for the U8 Free Response questions.

import java.util.ArrayList;

public class U8FreeResponseDriver
{
	public static void main(String args[])
	{
		U8FreeResponseDriver app = new U8FreeResponseDriver();
	}

	public U8FreeResponseDriver()
	{
		ArrayList<Comparable> list = new ArrayList<Comparable>();

		list.add(new Rectangle(5.2, 8.5));
		list.add(new Rectangle(3.9, 4.7));

		list.add(new RightTriangle(3.7, 5.1));
		list.add(new RightTriangle(1.8, 8.6));

		list.add(new Rectangle(8.7, 5.5));
		list.add(new RightTriangle(7.9, 6.4));

		list.add(new Rectangle(4.0, 5.0));
		list.add(new Rectangle(5.0, 4.0));

		list.add(new RightTriangle(3.0, 4.0));
		list.add(new RightTriangle(2.0, 6.0));

		//for you to complete
	}
}








