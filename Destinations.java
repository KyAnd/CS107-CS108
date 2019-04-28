  /**
       *  Program #5a
       *  Take the previous objects we made in programs and access them using arraylists. 
       *  CS108-2 
       *  3-19-18
       *  @author  Andrew Botros
       */





import java.util.ArrayList;

public class Destinations {

    public static void main(String[] args) {
        ArrayList<Place> places = initList();
int i =0;
int z=0;
        // ToDo: Print each Place using enhanced for-loop showing polymorphism
        for(Place x: places) {
        	System.out.println(x.toString());//the Place x stores the places and then uses their toString method to "print" the objects
        }

        // ToDo: For each Eatery, print numeric rating followed by a space followed by appropriate 'stars'
for(i=0;i<3;++i) {//Eatery according to the code already provided has an index from 0-2 

		Eatery eat=(Eatery)places.get(i);//store the object in the current iteration and cast it to be type Eatery
		System.out.println(eat.getRating()+" "+eat.ratingToStars());//for each Eatery use the appropriate methods
	}

        // ToDo: For each Restaurant, print its name followed by a space followed by its description
for(z=3;z<=5;++z) {//from 3-5 are the Restaurants and thats all we need note: I could've also used instanceOf here and on line 15
	
	
	
	
		Attraction att=(Attraction)places.get(z);
		System.out.println(att.getName()+" "+att.getDescription());//same exact process for the loop above
	}

		


  
        // ToDo: Test Tea Station's latitude and longitude against Tender Greens', print true or false
double l0= places.get(1).location.latitude;//Tea Station is index 1 so use get 1
double lon0=places.get(1).location.longitude;
double l1=places.get(2).location.latitude;//Tender Greens is index 2 in the arraylist so use get 2
double lon1=places.get(2).location.longitude;

if(Math.abs(l0-l1) <0.001 && Math.abs(lon0-lon1) <0.001) {
	System.out.println("true");
}
else {
	System.out.println("false");
}
	

        // ToDo: Compare Original Pancake House and Tender Greens cuisine, print true or false
double lathouse= places.get(0).location.latitude;
double lonhouse=places.get(0).location.longitude;
double lat1green=places.get(2).location.latitude;
double lon1green=places.get(2).location.longitude;


if(Math.abs(lathouse-lat1green) > 0.001 && Math.abs(lonhouse-lon1green) > 0.001) {//use the code from our previous program
	System.out.println("false");
}
else {
	System.out.println("true");
}


double l4= places.get(4).location.latitude;
double lon4=places.get(4).location.longitude;
double l5=places.get(4).location.latitude;
double lon5=places.get(4).location.longitude;


if(Math.abs(l4-l5) > 0.001 && Math.abs(lon4-lon5) > 0.001) {//already know the indices so use get and process the values 
	System.out.println("false");
}


else {
	System.out.println("true");
}

    }
    public String getIdentificationString() {
    	return "Program 5a, Andrew Botros";
    }

    
    
    private static ArrayList<Place> initList() {
        ArrayList<Place> list = new ArrayList<>();
        Eatery[] restaurants = {
                new Eatery("Original Pancake House","Breakfast",32.815274,-117.1546500,"casual dining",14.0,4),
                new Eatery("Tea Station","Asian cafe with tea drinks",32.76049,-117.06739,"casual dining",8.0,3),
                new Eatery("Tender Greens","2400 Historic Decatur Rd",32.73547,-177.21601,"casual dining",26.0,4)
        };
        Attraction[] fun = {
                new Attraction("PetCo Park","Padres Baseball",32.708129,-117.157036,37.0,0),
                new Attraction("Birch Aquarium at Scripps Institution of Oceanography",
                        "Fish Aquarium",32.865776,-117.250518, 18.50, 1),
                new Attraction("San Diego Zoo","Animal Park",32.735316,-117.149046,52.0,2)
        };
        for (Eatery e : restaurants)
            list.add(e);
        for (Attraction a : fun)
            list.add(a);

        return list;
    }
}