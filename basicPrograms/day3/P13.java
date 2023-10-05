//WAJP to print the 7th fibonacci number from the series.

package day3;

public class P13 {
	
	public static void main(String[] args) {
		
		int n = 7;
		int a =0 , b=1,c=0;
		
		for(int i = 1; i<=n-2;i++) {
			c = a+b;
			a=b;
			b=c;
		}
		System.out.println(c);
		
		
		
	}

}
