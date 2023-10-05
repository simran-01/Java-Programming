// find largest area of triangle

package day5;

import java.util.Scanner;


public class P27 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int base1 = sc.nextInt();
		int height1 = sc.nextInt();
		
		int base2= sc.nextInt();
		int height2=sc.nextInt();
		
		float area1 = (base1*height1)/2.0f;
		float area2 = (base2*height2)/2.0f;
		
		if(area1>area2) {
			System.out.println(area1);
		}
		else {
			System.out.println(area2);
		}
		
		
		
		
		
		
		
		
	}

}
