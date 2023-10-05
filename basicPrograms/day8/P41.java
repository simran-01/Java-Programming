// WAJP to check spy number.

package day8;

public class P41 {
	
	public static void main(String[] args) {
		int n = 1124;
		int temp = n;
		int sum =0;
		int mul=1;
		while(n!=0) {
			int d =n%10;
			sum=sum+d;
			mul=mul*d;
			n=n/10;
		}
		
		if(sum==mul) {
			System.out.println(temp+" is a spy number");
		}
		else {
			System.out.println(temp+" is not a spy number");
		}
		
	}

}
