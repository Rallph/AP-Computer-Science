//
// This is the driver class that processes
// 100 quizzes and dice rolls and prints the results
// to a JFrame

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Container;
import java.awt.Font;


public class U8Test extends JFrame {

	public static void main(String[] args) {
		
		U8Test x = new U8Test();
		x.setSize(300,600);
		x.setVisible(true);
		x.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}


	public U8Test() {

		JTextArea output = new JTextArea();
		output.setFont(new Font("Monospaced", Font.BOLD, 12));
		Container c = getContentPane();
		c.add(output);

		String[] item2 = {"A", "B", "C", "D", "F"};
		String[] item1 = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "11","12"};
		Tally t1 = new Tally(item1);
		Tally t2 = new Tally(item2);

		for (int i = 0; i < 100;i++) {

			Dice d = new Dice(((int)(6 * Math.random() + 1)),((int)(6 * Math.random() + 1)));
			t1.process(d);

			Quiz q = new Quiz((int)(51*Math.random() + 50));
			t2.process(q);
		}

		int[] result1 = t1.getTally();
		int[] result2 = t2.getTally();
		output.setText("\tDice Tally\n\t----------\n");
		output.append("\nItem\t\tTally\n----\t\t-----\n");

		for (int i = 0; i < item1.length;i++) {

			output.append(" " + item1[i] + "\t\t " + result1[i] + "\n");
		}

		output.append("\n\n\n\tQuiz Tally\n\t----------\n");
		output.append("\nItem\t\tTally\n----\t\t-----\n");
		
		for(int i = 0; i < item2.length;i++) {

			output.append(" " + item2[i] + "\t\t " + result2[i] + "\n");
		}
	}
}








