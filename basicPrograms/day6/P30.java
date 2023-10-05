// WAJP to print all the digits in a number which are greater than 3.

package day6;

public class P30 {
	
	public static void main(String[] args) {
		
		int n = 342678;
		
		while(n !=0) {
			int digit = n %10;
			if (digit > 3) {
				System.out.println(digit);
				
			}
			n = n/10;
		}
		
		
		
	}

}
