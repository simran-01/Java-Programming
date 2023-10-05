// WAJP to print numbers from 1 to 5 using all three loops.

package day1;

public class P1 {
	
	public static void main(String[] args) {
		
		// while loop
		System.out.println("--While Loop--");
		int i = 1;
		while (i<=5) {
			System.out.println(i);
			i++;			
		}
		System.out.println("---------------");
		
		//do while loop
		System.out.println("--Do While Loop--");
		int j =1;
		do {
			System.out.println(j);
			j++;
		}while(j<=5);
		System.out.println("---------------");
		
		//for loop
		System.out.println("--For Loop--");
		for(int i1 =1 ; i1<=5 ; i1++) {
			System.out.println(i1);
		}
		
		
	
		
	}

}
