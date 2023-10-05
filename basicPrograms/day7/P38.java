//WAJP to print all special numbers from 1 to 1000.

package day7;

public class P38 {
	
	public static void main(String[] args) {
		for(int i = 1; i<=1000;i++) {
			int temp = i;
			int prod = 1;
			int sum = 0;
			int tsum=0;
			
			while(temp!=0) {
				int digit = temp%10;
				prod = prod*digit;
				sum= sum+digit;
				tsum= prod+sum;
				
				temp= temp/10;
			}
			if (tsum==i) {
				System.out.println(i);				
			}
		}
	}

}
