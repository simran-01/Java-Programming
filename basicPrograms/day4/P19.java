
// WAJP to find year is a leap year or not.
package day4;

public class P19 {
	
	public static void main(String[] args) {
		int year = 1900;
		
		if(year%4==0 && (year%100!=0 || year%400==0)) {
			System.out.println("Leap Year");
			
		}
		else {
			System.out.println("Not a Leap Year");
		}
	}

}
