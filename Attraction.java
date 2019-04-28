  /**
       *  Program #4b
       *  creating an object that is to be used with locations using geo coordinates
       *  CS108-2 
       *  3-19-18
       *  @author  Andrew Botros
       */





public class Attraction extends Place {
int type;
double price;

public Attraction(String name, String desc, double latitude, double longitude, double price, int type) {
	super(name, desc, latitude,  longitude);
	this.type=type;
	this.price=price;
}
public double getPrice() {
	return price;
}
public int getType() {
	return type;
}
public boolean hasAnimals() {
	if(type==1 || type==2) {
		return true;
	}
	else {
		return false;
	}
}
@Override
public String toString() {
	

if(type==1 || type==2) {
	return  name + " (latitude:" + location.latitude +",longitude:"+location.longitude +")\n\tTickets average $" + price + "0 and feature exciting animals";
}//within toString it will determine what type it is and display appropriate output 
else {
	return name + " (latitude:" + location.latitude +",longitude:"+location.longitude +")\n\tTickets average $" + price + "0";
}
}
}