//WAJP to find sum of digits of a number only if digit is a prime number.

package day6;

public class P34 {
	public static void main(String[] args) {
		int n = 578;
		int sum = 0 ;
		
		while(n !=0) {
			int digit = n %10;
			int count = 0;
			for(int i = 1 ; i<=digit ; i++) {
				if(digit%i==0) {
					count++;
				}
			}
			if(count==2) {
				sum+=digit;
			}
			n= n/10;
		}
		System.out.println(sum);
	
		
	}

}
