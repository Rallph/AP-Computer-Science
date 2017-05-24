//Leo Shriver & Ralph Nahra
//
//This is the code for the WordMasterMind class, which randomly selects a word out of
//a list of 50 four letter words from a text file to be guessed by a user with the driver class.
//It prints an "X" for each letter in the correct location and an "O" for each letter
//in an incorrect location. If the letter is not in the word, it will print nothing.
//Guessing correctly on the first try yields 100 points. Each additional guess it takes
//reduces the score by 10 points. Additionally, O's are worth 1 point and X's 2 points.
//It will also utilize the TopTenList class to remember and print the top ten scorers
//and scores.

import java.util.Scanner;
import java.io.*;
import java.util.Random;

public class WordMasterMind
{
	private int guesses, xNum, oNum;
	private String word, name;
	private boolean guessed;

	public WordMasterMind()
	{
		guesses = 0;
		xNum = 0;
		oNum = 0;
		guessed = false;
		try
		{
			Scanner in = new Scanner(new File
			("U:\\STUDENT\\PROJECTS\\West Projects\\inconspicuous\\words.txt"));

			String inputLine = in.nextLine();
			String[] words = inputLine.split(" ");
			Random rand = new Random();
			int index = rand.nextInt(50);
			word = words[index];
		}
		catch(IOException e)
		{
			word = "error";
			throw new RuntimeException(e.toString());
		}

	}

	public int getScore()
	{
		if(guessed)
			return 100 - 10 * (guesses - 1) + oNum + 2 * xNum;
		return oNum + 2 * xNum;
	}

	public boolean isGuessed()
	{
		return guessed;
	}

	public String getWord()
	{
		return word;
	}

	public String guess(String g)
	{
		if(guesses == 10)
			return "Driver allows more than 10 gusses! NO GOOD\n";
		guesses++;
		String result = "Result: ";
		if(g.equals(word))
		{
			guessed = true;
			xNum += 4;
			result += "XXXX\t\tCORRECT!!\tFinal Score = " + getScore() + "\n";
			return result;
		}

		int localXNum = 0;
		int localONum = 0;

		String[] wordChars = new String[4];
		String[] guessChars = new String[4];
		for(int i=0; i<4; i++)
		{
			wordChars[i] = word.substring(i,i+1);
			guessChars[i] = g.substring(i,i+1);
		}

		for(int i=0; i<4; i++)
		{
			if(wordChars[i].equals(guessChars[i]))
				localXNum++;
			else
			{
				String guessChar = guessChars[i];
				for(int j=0; j<4; j++)
				{
					if(guessChar.equals(wordChars[j]))
						localONum++;
				}

				int occurences = 0;
				for(int j=0; j<4; j++)
				{
					if(guessChar.equals(wordChars[j]))
						occurences++;
				}

				if(occurences > 1)
					localONum -= occurences - 1;
			}
		}

		xNum += localXNum;
		oNum += localONum;

		for(int i=0; i<localXNum; i++)
			result += "X";
		for(int i=0; i<localONum; i++)
			result += "O";

		if(guesses == 10)
			result += "\tWord = " + word + "\tFinal Score = " + getScore();
		result += "\n\n";
		return result;
	}


}

