//WAJP to find largest digit in a number.

package day9;

public class P50 {
	
	public static void main(String[] args) {
		
		int n = 2345687;
		int max=0;
		
		while(n!=0) {
			int d = n%10;
			if(d>max) {
				max=d;
			}
						
			n=n/10;
		}
		System.out.println(max);
	}


}
