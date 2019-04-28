  /**
       *  Program #4c
       *  creating an object that prints statements based on the type of location using the superclass Place
       *  CS108-2 
       *  3-19-18
       *  @author  Andrew Botros
       */

//andrew botros
public class Eatery extends Place {//ZYBOOKS IS NOT WORKING FOR MY TEST PLEASE CHECK FOR CORRECTNESS
	double cost;
	String cuisine;
	int starRating;
	public Eatery(String name, String desc, double latitude, double longitude, String cuisine, double cost, int starRating) {
		super(name,desc,latitude,longitude);
		this.cost=cost;
		this.cuisine=cuisine;
		this.starRating=starRating;
	}
	public double getCost() {
		return cost;
	}
	
	public String getCuisine() {
		return cuisine;
	}
	
	public int getRating() {
		return this.starRating;
	}
	public String ratingToStars() {
		StringBuffer sb2=new StringBuffer();
		for(int i=0;i<starRating;++i)
		sb2.insert(i,"*");
		String s2=sb2.toString();
	  return s2;//use a stringBuffer with a for loop to print the correct number of stars
	
	
		
	}
	public String getCostToSymbols() {
		StringBuffer sb1=new StringBuffer();
		String s1="";
		if(cost <25 ) {
			sb1.insert(0,"$");
			 s1=sb1.toString();
			return s1;//at the first index of the StringBuffer insert the correct symbol
		}
		else if(cost>=25 && cost<50 ) {
			sb1.insert(0,"$");
			sb1.insert(1,"$");
			 s1=sb1.toString();
			 return s1;
		}
		else if(cost >=50 && cost<75) {
			sb1.insert(0,"$");
			sb1.insert(1,"$");
			 s1=sb1.toString();
			 return s1;
		}
		else if(cost >=75 && cost<100) {
			sb1.insert(0,"$");
			sb1.insert(1,"$");
			sb1.insert(2,"$");
			sb1.insert(3,"$");
		s1=sb1.toString();
			return s1;

			
			
		}
		
		else if(cost>=100) {
			sb1.insert(0,"$");
			sb1.insert(1,"$");
			sb1.insert(2,"$");
			sb1.insert(3,"$");
			sb1.insert(4, "+");
			s1=sb1.toString();
			return s1;
			}
				 
			
		else {
			s1=sb1.toString();
			return s1;
		}
		}
	@Override
	public String toString() {
	super.toString();
	StringBuffer sb2=new StringBuffer();
	for(int i=0;i<starRating-1;++i) {//use starRating-1 because the program includes an * already present for this statement
	sb2.insert(i,"*");
	
	}
	StringBuffer sb1=new StringBuffer();
	
	
	
String s11=getCostToSymbols();//use this getter to get the appropriate string
	String s2=sb2.toString();
	
	
	
	return name+ " (latitude:" + location.latitude +",longitude:" +location.longitude+")\n\tPrice: " +s11 + "\n\tRating: *" + s2;
	
		
	}
}
		
