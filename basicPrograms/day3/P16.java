//WAJP to check if a number is a prime number or not.

package day3;

import java.util.Scanner;

public class P16 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		
		for(int i = 1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		
		if(count == 2) {
			System.out.println(n+" is a Prime Number");
		}
		else {
			System.out.println(n+" is not a Prime Number");
		}
		
		
	}
}
