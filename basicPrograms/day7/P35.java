//WAJP to print reverse of a number.

package day7;

public class P35 {
	
	public static void main(String[] args) {
		int n = 1234;
		int rev= 0;
		
		while (n!=0) {
			int d = n%10;
			rev=rev*10+d;
			n=n/10;
			
		}
		
		System.out.println(rev);
		
		
	}

}
