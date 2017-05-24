// Ralph Nahra & Leo Shriver
//
// This is the code for the ScoreList class which
// will contain a list of Score objects and can
// manipulate it.

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class ScoreList {

	private ArrayList<Score> list = new ArrayList<Score>();

	public ScoreList(Score s) {

		try {

			Scanner in = new Scanner (new File
				("topten.txt"));



			while (in.hasNext()) {

				String line = in.nextLine();
				String[] l = line.split("\t");

				list.add(new Score(l[2], Integer.parseInt(l[1])));
			}
			in.close();

		} catch (IOException e) {

			throw new RuntimeException (e.toString());
		}

		list.add(s);

		sort();
		ranks();
		printList();
		toFile();

	}


	public void printList() {

		System.out.println("The Top 10 Scores for the Game");

		int i = 0;

		while (i < list.size() && i < 10) {

			System.out.println(list.get(i));
			i++;
		}
	}

	public void sort() {

		int j;
		Score temp;

		for (int n = 1; n < list.size(); n++) {

			temp = list.get(n);
			j = n;

			while (j > 0 && temp.getScore() > (list.get(j - 1)).getScore()) {

				list.set(j, list.get(j - 1));
				j--;
			}

			list.set(j, temp);
		}
	}

	public void ranks() {

		for (int i = 0; i < list.size(); i++) {

			Score x = list.get(i);
			x.setRank(i + 1);
		}
	}

	public void toFile() {

		try {

			FileWriter writer = new FileWriter("topten.txt");
			PrintWriter out = new PrintWriter(writer);

			int i = 0;

			while (i < list.size() && i < 10) {

				Score x = list.get(i);
				out.println(x);
				i++;
			}

			out.close();
		} catch (IOException e) {

			throw new RuntimeException(e.toString());
		}

	}


}