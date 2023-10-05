//WAJP to count digits of a number.

package day9;

public class P46 {
	
	public static void main(String[] args) {
		
		int n = 125432;
		int count=0;
		
		while(n!=0) {
			count++;
			n=n/10;
			
		}
		System.out.println(count);
		
	}

}
