
    /**
       *  Program #4
       *  creating an object that is to be used with locations using geo coordinates
       *  CS108-2 
       *  3-19-18
       *  @author  Andrew Botros
       */


public class Location {
	double EARTH_RADIUS_MILES = 3963.1676;
	public double latitude;
	public double longitude;
	public Location() {
	this.latitude=0.0;
	this.longitude=0.0;
	}
	public Location (double lat, double lon) {
		latitude=lat;
		longitude=lon;
		
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double lat) {
		latitude = lat;
		return;
	}
	public double getLongitude() {
		return longitude;

	}
	public void setLongitude(double lon) {
		longitude = lon;
		return;
	}
	// Returns the distance in miles between this geo location and the given
    // other geo location
    public double distanceFrom(Location other) {
        // TODO:  First use Math.toRadians() convert this latitude & longitude, and 
        //               the other latitude & longitude to radians
        double lat1 =Math.toRadians(this.latitude);
        double lon1 = Math.toRadians(this.longitude);

        double lat2 = Math.toRadians(other.latitude);
        double lon2 =  Math.toRadians(other.longitude);

        // TODO:  Apply the spherical law of cosines with a triangle composed of 
        //               the two locations and the North Pole

        double cosC = Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1-lon2);
        double arcLenC = Math.acos(cosC);
return arcLenC* 3963.1676;
        // Return the arcLenC times RADIUS

    }
    public boolean equals(Location o ) {
    	double lat1 =Math.toRadians(this.latitude);
        double lon1 = Math.toRadians(this.longitude);

        double lat2 = Math.toRadians(o.latitude);
        double lon2 =  Math.toRadians(o.longitude);
        if(Math.abs(lat1-lat2) >0.001 && Math.abs(lon1-lon2)>0.001) {
    	return false;
        }
        else {
        	return true;
        }
        
    			}
    public String toString() {
  	  Double lat=this.latitude;
  	  Double lon=this.longitude;//to print the values as Strings I used the Double wrapper class which enables me to do so because it is NOT a primitive type
  	  String lat1=lat.toString().concat(",");
  	  String lon1=lon.toString();
  	  return  "latitude:"+lat1 + "longitude:"+ lon1;
  }
   
	
	
}