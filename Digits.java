import java.util.Scanner; 
public class Digits {

	public static void main(String[] args) {
		 Scanner scnr =new Scanner(System.in);
		 System.out.print("Enter a number here to find the first digit");
		int input=scnr.nextInt();
		int m1=firstDigit(input);
		System.out.println("The first digit is: " + m1);
		int mlast=lastDigit(input);
		System.out.println("The last digit is " + mlast);
		int m3=lastDigit(input);
		System.out.println("The length of this number is "+ m3 + " digits long");
	return;

	}
public static int firstDigit(int one) {
	int numresult=0;
	 int result=0;
	int check=0;
	String s1;
	 if(one<0) { 
		 Math.abs(one);
		 s1=	Integer.toString(one);
	String s2=s1.substring(0,2);
	numresult=Integer.parseInt(s2);
	numresult=numresult*-1;
	return numresult;
	 }
	 else {		
	
 char charother[]=String.valueOf(one).toCharArray();
 result=charother[0];
 numresult= Character.getNumericValue(result);
 return numresult;
 }
}
public static int lastDigit(int two) {

	 char charlast[]=String.valueOf(two).toCharArray();
			 
	int result=charlast[charlast.length-1];
	int numlast= Character.getNumericValue(result);
	 return numlast;
	 }
	 public static int digits(int three) {
		 int stlength=String.valueOf(three).length();
		 if(three<0) {
			stlength=stlength-1; 
		 }
	
	return stlength;
	
	 }
}
