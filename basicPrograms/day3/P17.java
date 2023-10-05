// WAJP to count prime numbers in a given range.
//e.g. Find count of prime numbers in range 1 to 10 --- i.e. 4(2,3,5,7)

package day3;

import java.util.Scanner;

public class P17 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int totalPrime=0;
		for(int i= 1 ; i<=n;i++) {
			
			int count = 0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}				
			}
			if(count==2) {
				totalPrime++;
			}
			
		}
		
		System.out.println(totalPrime);
		
	}

}
