//WAJP to convert octal to decimal.

package day11;

public class P56 {
	public static void main(String[] args) {
		
		int oct = 15; //octal
		int p = 1;
		int sum=0; // decimal
		
		while (oct!=0) {
			
			int d = oct%10;
			sum= sum+d*p;
			p=p*8;

			
			oct=oct/10;			
		}
		System.out.println(sum); //decimal
		
		
	}

}
