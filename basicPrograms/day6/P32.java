// WAJP to find products of all odd digits of a number.

package day6;

public class P32 {
	
	public static void main(String[] args) {
		int n = 68431178;
		int prod = 1;
		
		while(n!=0) {
			int digit = n % 10;
			if(digit%2 != 0) {
				prod = prod * digit;
				
			}
			n=n/10;
		}
		System.out.println(prod);
		
	
	}

}
