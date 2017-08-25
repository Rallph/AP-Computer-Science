//
// This program will simulate the game of life

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Container;
import java.awt.Font;

public class U5A4 extends JFrame {

	private JTextArea output;
	private String[][] board = {{" "," "," "," "," "," "},
								{" "," ","*"," "," "," "},
								{" "," "," ","*"," "," "},
								{" ","*","*","*"," "," "},
								{" "," "," "," "," "," "},
								{" "," "," "," "," "," "}};

	public static void main(String[] args) {

		U5A4 app = new U5A4();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public U5A4() {

		Container container= getContentPane();
		output = new JTextArea();

		output.setFont(new Font("Monospaced", Font.PLAIN, 10));
		output.setText("Generation 0\n");
		container.add(output);

		PrintMatrix();


		for (int count = 1; count <= 4; count++) {

			String[][] temp = new String[6][6];

			for (int i = 0; i < 6; i++) {

				for (int j = 0; j < 6; j++) {

					if (numNeighbors(i,j) == 3) temp[i][j] = "*";

					else if (numNeighbors(i,j) <= 1 || numNeighbors(i,j) >= 4)
						temp[i][j] = " ";
					else if (numNeighbors(i,j) == 2)
						temp[i][j] = board[i][j];


				}
			}

			board = temp;

			if (count == 2 || count == 4) {

				output.append("Generation " + count + "\n");
				PrintMatrix();
			}
		}


		setSize(200,500);
		setVisible(true);
	}

	private void PrintMatrix() {

		for (int j = 0; j < 6; j++) {

			output.append("|");
			for (int k = 0; k < 6; k++) {

				output.append(board[j][k] + "|");
			}

			output.append("\n");
			output.append("-------------\n");
		}
	}

	private int numNeighbors(int row, int col) {

		int c = 0;

		for (int i = row - 1; i <= row + 1; i++) {

			for (int j = col - 1; j <= col+1; j++) {

				if (i == row && j == col)
					continue;

				try {

					if (board[i][j].equals("*"))
						c++;
				} catch (RuntimeException exception) {

					continue;
				}
			}
		}
		return c;
	}


}








