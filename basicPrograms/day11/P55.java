// WAJP to convert binary to decimal.

package day11;

public class P55 {
	public static void main(String[] args) {
		int n = 1101;
		int p=1;
		int sum=0;
		
		while(n!=0) {
			int d = n%10;
			sum= sum+d*p;
			p=p*2;
			n=n/10;
		}
		System.out.println(sum);
	}

}
