// WAJP to find binary to octal

package day12;

public class P58 {
	
	public static void main(String[] args) {
		
		int n = 1101; //binary
		int p = 1;
		int sum=0; //decimal
		
		while(n!=0) {
			
			int d = n%10;
			sum= sum+ p*d;
			p=p*2;
			
			n=n/2;
		}
		
		String oct="";
		
		while(sum!=0) {
			int rem= sum%8;
			oct = rem+oct;			
			sum= sum/8;
		}
		System.out.println(oct);
		
	}

}
