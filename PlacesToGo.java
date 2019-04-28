  /**
       *  Program #5b
       *  Driver file used to tes 5a, and ensure that we understand the enhanced for loop
       *  CS108-2 
       *  3-19-18
       *  @author  Andrew Botros
       */




import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class PlacesToGo {
	 public static void main(String[] args) {
ArrayList<Place> part2= new ArrayList<>();
Place[] locationss = {
	new Place("New York", "One very large city", 100.2, 150.1283),
	new Place("Los Angeles", "City of angels", 54.89, -100.30)
};
Eatery[] restaurantss ={
	new Eatery("Chilis", "American sized food", 36.265, 127.387, "American", 30, 3),
	new Eatery("Panda Express", "My Favorite Place", -117.479, -27.968, "Chinese", 10, 4)
};
Attraction[] attractionss= {
		new Attraction("County Fair", "Janky rides", -23.27, 237.387, 25, 3),
		new Attraction("San Diego Zoo", "Harambe lives in our hearts", -45.27, 28.39, 40, 1)
};
for (Place p1: locationss) //populate the list with the elements each loop performs this
	part2.add(p1);

for (Eatery e1 : restaurantss) 
    part2.add(e1);

for (Attraction a1 : attractionss) 
    part2.add(a1);


for(Place x: part2) 
	System.out.println(x.toString());//same process as for Destination

System.out.println();//print a new line after the first set of objects unsorted are printed
Collections.sort(part2);
for(Place y: part2) 
	System.out.println(y.toString());//after the sort method has been called the order is now different so we repeat the process on the list that is now sorted



}
}
	
