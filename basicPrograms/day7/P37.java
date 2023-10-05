// WAJP check if number is a special number or not.

package day7;

public class P37 {
	
	public static void main(String[] args) {
		int n = 19,temp=n,prod = 1,sum = 0;
		
		while(n!=0) {
			int digit = n%10;
			prod = prod*digit;
			sum= sum+digit;
		
			
			n= n/10;
		}
		
		if(sum+prod==temp) {
			System.out.println(temp+" is a special number.");
		}
		else {
			System.out.println(temp+" is not a special number.");
		}
	}

}
