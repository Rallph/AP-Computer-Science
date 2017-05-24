// Ralph Nahra
//
// This program will get the data of basketball players
// from a text file and display them to the screen.

import javax.swing.JTextArea;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;


public class U7Test extends JFrame {

	private JTextArea output = new JTextArea();
	private ArrayList<BBPlayer> players = new ArrayList<BBPlayer>();
	private Container c = getContentPane();

	public static void main(String[] args) {

		U7Test x = new U7Test();
		x.setSize(500,500);
		x.setVisible(true);
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public U7Test() {

		Font font = new Font("Monospaced",Font.PLAIN, 12);
		output.setFont(font);
		c.add(output);
		output.setText(" Original List\n\n");


		try {

			Scanner reader = new Scanner(new File("U:\\STUDENT\\PROJECTS\\West Projects\\Computer Science\\JavaData\\u7test.txt"));

			while (reader.hasNext()) {

				String line = reader.nextLine();

				players.add(new BBPlayer(line));
			}

			reader.close();

		} catch (IOException e) {

			throw new RuntimeException(e.toString());
		}


		PrintList();
		Sort();
		output.append("\n Sorted List\n\n");
		PrintList();
	}	

	public void PrintList() {

		output.append(" Number Year   Position      Points Per Game");
		output.append("\n ------ ----   --------      ---------------\n");

		for (int i = 0; i < players.size(); i++) {

			BBPlayer x = players.get(i);

			output.append("  " + x.getNum() + "\t" + x.getYear() + "\t " + x.getPos() + "\t\t" + x.getPPG() + "\n");
		}

		output.append("\n\n");
	}

	public void Sort() {

		int j;
		BBPlayer temp;

		for(int n=1; n<players.size(); n++) {
			temp = players.get(n);
			j = n;

			while(j > 0 && temp.getPPG() < players.get(j - 1).getPPG()) {
				BBPlayer b = players.get(j-1);
				players.set(j, b);
				j--;
			}

			players.set(j, temp);
		}

		BBPlayer x = players.get(4);
		BBPlayer y = players.get(0);
		players.set(0,x);
		players.set(4,y);

		BBPlayer z = players.get(3);
		BBPlayer w = players.get(1);
		players.set(1,z);
		players.set(3,w);

	}

}