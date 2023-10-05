//WAJP to print even numbers in the range given by user.

package day1;

import java.util.Scanner;

public class P5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int a = sc.nextInt(),b=sc.nextInt(); a<=b ; a++) {
			if (a%2==0) {
				System.out.println(a);
				
			}
		}
		
		
	}

}
