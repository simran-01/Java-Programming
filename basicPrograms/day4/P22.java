//WAJP to print all perfect numbers in the range 1 to 1000.

package day4;

public class P22 {
	
	public static void main(String[] args) {
		
		
		for (int i = 1 ; i<=1000 ; i++) {
			int sum =0;
			for(int j = 1; j<i ; j++ ) {
				if(i%j==0) {
					sum=sum+j;
				}
			}
			if(sum==i) {
				System.out.println(i);
			}
		
			
		}
	}

}
