// WAJP to print sum of all odd digits of a number.
package day6;

public class P33 {
	
	public static void main(String[] args) {
		
		int input = 2514795;
		int sum = 0;
		
		while(input!=0) {
			int digit = input%10;
			if(digit%2!=0) {
				sum+=digit;
				
			}
			input = input/10;
			
		}
		System.out.println(sum);
	}

}
