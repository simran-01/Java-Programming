//WAJP to check if number is Strong number or not.

package day8;

public class P43 {
	public static void main(String[] args) {
		int n = 145;
		int temp=n;
		int sum=0;
		
		while(n!=0) {
			int d = n%10;
			int fact=1;
			for(int i=1; i<=d;i++ ) {
				fact=fact*i;
			}
			sum+=fact;
			
			n=n/10;
		}
		
		if(sum==temp) {
			System.out.println(temp+" is a Strong number");
			
		}
		else {
			System.out.println(temp+" is not a Strong number");
		}
		
	}

}
