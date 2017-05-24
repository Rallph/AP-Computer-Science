//Leo Shriver & Ralph Nahra
//
//This is the driver class for the WordMasterMind and ScoreList classes.
//It will allow the user to first enter their name and then guess up to
//ten times. If the word is not guessed within ten tries, user inputs will be closed.

import java.util.Scanner;

public class WordMasterMindDriver
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Welcome to Word Master Mind!\nEnter your name (spaces allowed): ");
		String name = in.nextLine();
		System.out.println("Remember that all words are completely lower-case and four letters long.");
		System.out.println("The words also have a maximum of two letters the same!");
		WordMasterMind m = new WordMasterMind();
		boolean guessed = m.isGuessed();

		for(int i=1; i<=10 && !guessed; i++)
		{
			System.out.print("Guess #" + i + ": ");
			String guess = in.nextLine();

			if(guess.length() != 4)
			{
				i--;
				System.out.println("Improper input! Word is 4 letters long. Try again.\n");
				continue;
			}
			System.out.print(m.guess(guess));
			guessed = m.isGuessed();
		}
		System.out.println();

		int score = m.getScore();
		Score s = new Score(name, score);
		ScoreList l = new ScoreList(s);
	}
}