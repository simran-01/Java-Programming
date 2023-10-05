// WAJP to sum of all digits

package day6;

public class P31 {
	
	public static void main(String[] args) {
		
		int n = 128796;
		int sum = 0 ;
		
		while(n != 0) {
			int digit = n % 10;
			sum = sum+ digit;
			n= n /10;
			
		}
		System.out.println(sum);
		
		
		
		
		
	}

}
