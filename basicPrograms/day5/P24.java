//WAJP to check perfect square.

package day5;

public class P24 {
	
	public static void main(String[] args) {
		
		int n = 20;
		int i =1;
		
		for(;i<=n ;i++) {
			if(i*i==n) {
				System.out.println("Perfect Square");
				break;
			}
		}
				
		if(i*i>n) {
			System.out.println("Not Perfect Square");
		}
		
		
		
	}

}
