//WAJP to print all the digits of a number.

package day6;

public class P28 {
	
	public static void main(String[] args) {
		
		int n = 523;
		
		while (n!=0) {
			int digit = n % 10;
			System.out.println(digit);
			n = n/10;
			
		}
		
		
		
	}

}
