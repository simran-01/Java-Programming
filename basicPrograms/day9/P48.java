//WAP to find gcd/hcf of two numbers.

package day9;

public class P48 {
	
	public static void main(String[] args) {
		
		int a = 12;
		int b =15;
		int gcd = 1;
		
		for(int i=1; i<=a && i<=b;i++) {
			if(a%i==0 && b%i==0) {
				gcd = i;
			}
		}
		
		System.out.println(gcd);
		
	}

}
