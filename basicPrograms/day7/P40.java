// WAJP to print all niven numbers from 1 to 1000.
package day7;

public class P40 {
	
	public static void nivenNumbers(int n) {
		int temp=n;
		int sum =0;
		
		while(n!=0) {
			int d = n%10;
			sum+=d;
			n=n/10;			
		}		
		if(temp%sum==0) {
			System.out.println(temp);
		}
		
	
	}
	public static void main(String[] args) {
		
		for(int i =1 ; i<=1000 ; i++) {
			nivenNumbers(i);
			
		}
		
	}

}
