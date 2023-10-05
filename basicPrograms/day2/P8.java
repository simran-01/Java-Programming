//WAJP to print factorial of numbers from 1 to 10 line by line.

package day2;

public class P8 {
	public static void main(String[] args) {
		
		for(int i =1 ; i<=10 ; i++) {
			int fact = 1;
			for(int j = 1 ; j<=i;j++) {
				fact = fact*j;
			}
			System.out.println(fact);
		}
		
	}

}
