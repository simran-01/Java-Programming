//WAJP to print all the factors of a number.

package day3;

public class P14 {
	public static void main(String[] args) {
		int n = 6;
		
		for(int i = 1 ; i<=n ; i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}
		
	}

}
