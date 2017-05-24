// Ralph Nahra
//
// This is the driver class for U8A3. It will
// accept user input and create the cards that will
// be used in a trick. The end result of the trick will
// be shown.

import javax.swing.JOptionPane;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class U8A3 {

  public static void main(String[] args) {

    ArrayList<Card> list = new ArrayList<Card>();

    for (int i = 0; i < 5; i++) {

      String input = JOptionPane.showInputDialog("Enter a card into the trick");
      StringTokenizer s = new StringTokenizer(input);
      String su = s.nextToken();
      int v = Integer.parseInt(s.nextToken());
      list.add(new Card(su, v));
    }

    Trick t = new Trick(list);

    System.out.println(t);
    System.out.println("Winner of the trick = " + t.getWinner());
    System.out.println("Total points in trick = " + t.getTotal());
  }
}

/*
Trick 1:

The Trick:

4 of Diamonds
8 of Diamonds
Ace of Spades
King of Clubs
Ace of Diamonds

Winner of the trick = Ace of Diamonds
Total points in trick = 0


Trick 2:

The Trick:

7 of Spades
3 of Spades
10 of Spades
Ace of Hearts
9 of Spades

Winner of the trick = 10 of Spades
Total points in trick = 1

Trick 3:

The Trick:

5 of Clubs
8 of Hearts
2 of Clubs
Queen of Spades
Jack of Hearts

Winner of the trick = 5 of Clubs
Total points in trick = 15
*/
