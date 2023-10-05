// WAJP to find the year is leap year or not.

package day4;

public class P18 {
	
	public static void main(String[] args) {
		
		int year = 2016;
		
		if (year%4==0) {
			
			if (year%100==0) {
				
				if (year%400==0) {
					System.out.println("Leap year");
					
				} else {
					System.out.println("Not a leap year");

				}
				
			} else {
				System.out.println("Leap year");

			}
			
		} else {
			System.out.println("Not a leap year");

		}
		
		
	}

}
