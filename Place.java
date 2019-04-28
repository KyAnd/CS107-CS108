



  /**
       *  Program #4a
       *  creating an object that is to be used with locations that checks their proximity
       *  CS108-2 
       *  3-19-18
       *  @author  Andrew Botros
       */

public class Place implements Comparable<Place> {//implement comparable interface to allow Collections.sort to work
	public String name;
	public String description;
	public Location location=new Location();

public Place(String name, String desc, double longitude, double latitude) {
	this.name=name;
	description=desc;
	location.latitude=longitude;
	location.longitude=latitude;


	
	
}
public String getIdentificationString() {
	return "Program 5b, Andrew Botros";
}
public void setName(String name) {
	this.name = name;
}

public String getName() {
	return name;
}



public void setDescription(String description) {
	this.description = description;
}
public String getDescription() {
	return description;
}
public void setLocation(Location location) {
	this.location = location;
}
public void setLocation(double longitude, double latitude) {
	location.longitude=latitude;
	location.latitude=longitude;
	
}

public Location getLocation() {
	return  location;
}
@Override
public String toString() {
	
	  return name +","+description+","+ location.toString();
}
@Override
public int compareTo(Place otherPlace) {
	String s1=this.name;//compare this place object 
	String s2=otherPlace.name;//get the name of the OtherPlace argument
	int nameequals=s1.compareTo(s2); //This returns 0, -1, 1 depending on the result of the arguments
	return nameequals; 

}
public boolean equals(Place otherPlace) {
	Location l1=new Location ();
	double lat1 =Math.toRadians(l1.latitude);
    double lon1 = Math.toRadians(l1.longitude);

    double lat2 = Math.toRadians(otherPlace.location.latitude);
    double lon2 =  Math.toRadians(otherPlace.location.longitude);
    if(Math.abs(lat1-lat2) >0.001 && Math.abs(lon1-lon2)>0.001) {
	return false;
    }
    else {
    	return true;
    }
}



}