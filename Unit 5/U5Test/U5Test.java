// Ralph Nahra
//
// This is the driver class for the Unit 5 Test project

public class U5Test {

  public static void main(String[] args) {

    String[] names = {"Iowa City", "Ames", "Waterloo", "Ottumwa", "Burlington"};

    int[][] chart = {{0,121,81,83,82},
                     {121,0,96,116,190},
                     {81,96,0,117,154},
                     {83,116,117,0,77},
                     {82,190,154,77,0}};

    DistanceChart x = new DistanceChart(chart, names);
    String[] result = x.makeItinerary();

    System.out.println("The Itinerary\n-------------");

    for (int i = 0; i < result.length; i++) {

      System.out.println(result[i]);
    }
  }
}


/*

Output:

The Itinerary
-------------
Ames
Waterloo
Iowa City
Burlington
Ottumwa

*/