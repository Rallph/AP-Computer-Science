//
// This will create a Tic Tace Toe game using
// the Piece and Board classes

import javax.swing.JOptionPane;

public class TicTacToe {

	Board board = new Board(3,3);
	Piece[][] pieces = board.getBoard();

	public static void main(String[] args) {

		TicTacToe x = new TicTacToe();
	}

	public TicTacToe() {


		fill();
		board.drawBoard();
		boolean inPlay = true;
		boolean turn = true; // true -> X's turn, false -> O's turn

		do {

			if (turn) {

				String input = JOptionPane.showInputDialog("Player X enter unfilled space as row then column separated by a space");
				Piece x = new Piece("X");
				if (!board.isOccupied(Integer.parseInt(input.substring(0,1)), Integer.parseInt(input.substring(2)))) {

					board.addPiece(x,Integer.parseInt(input.substring(0,1)), Integer.parseInt(input.substring(2)));
				} else {

					JOptionPane.showMessageDialog(null, "Space already filled", "Tic Tac Toe", JOptionPane.ERROR_MESSAGE);
					continue;
				}
			} else {

				String input = JOptionPane.showInputDialog("Player O enter unfilled space as row then column separated by a space");
				Piece x = new Piece("O");
				if (!board.isOccupied(Integer.parseInt(input.substring(0,1)), Integer.parseInt(input.substring(2)))) {

					board.addPiece(x,Integer.parseInt(input.substring(0,1)), Integer.parseInt(input.substring(2)));
				} else {

					JOptionPane.showMessageDialog(null, "Space already filled", "Tic Tac Toe", JOptionPane.ERROR_MESSAGE);
					continue;
				}
			}

			board.drawBoard();

			turn = !turn;

			if (checkWin() == true) {

				inPlay = false;
			}

		} while (inPlay);

	}

	private void fill() {

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				pieces[i][j] = new Piece();
			}
		}
	}

	private boolean checkWin() {

		boolean over = false;
		String winner = "";
		for (int i = 0; i < 3; i++) {

			if (pieces[i][0].equals(pieces[i][1]) && pieces[i][1].equals(pieces[i][2])&& board.isOccupied(i,0)) {

				winner = pieces[i][0].getID();
				over = true;
				// game is over
			}

			if (pieces[0][i].equals(pieces[1][i]) && pieces[1][i].equals(pieces[2][i])&& board.isOccupied(0,i)) {

				winner = pieces[0][i].getID();
				over = true;
				// game is over
			}

			if (pieces[0][0].equals(pieces[1][1]) && pieces[0][0].equals(pieces[2][2])&& board.isOccupied(0,0)) {

				winner = pieces[0][0].getID();
				over = true;
				// game is over
			}

			if (pieces[0][2].equals(pieces[1][1]) && pieces[0][2].equals(pieces[2][0])&& board.isOccupied(0,2)) {

				winner = pieces[0][2].getID();
				over = true;
				// game is over
			}


		}

		boolean tie = false;
		int boardCount = 0;
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				if (pieces[i][j].getID() != " ")
					boardCount++;
			}

		}

		if (boardCount == 9) {

			tie = true;
			over = true;	
		} 

		if (over == true && tie == false) {


			JOptionPane.showMessageDialog(null, "The winner is player " + winner, "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		} else if (over == true && tie == true) {

			JOptionPane.showMessageDialog(null, "The game is a tie", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
		}
		return over;
	}


}









