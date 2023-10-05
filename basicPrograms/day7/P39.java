//WAJP to check if number is niven number or not.

package day7;

public class P39 {
	
	public static void main(String[] args) {
		int n = 21;
		int temp =n;
		int sum =0;
		
		while(n!=0) {
			int d = n%10;
			sum+=d;
			n=n/10;			
		}
		
		if(temp%sum==0) {
			System.out.println(temp+" is a niven number");
		}
		else {
			System.out.println(temp+" is not a niven number");
		}
		
	}

}
