// WAJP to print only the even digits from the number.


package day6;

public class P29 {

	public static void main(String[] args) {
		
		int n = 1235468;
		
		while (n!=0) {
			
			int digit = n%10;
			if (digit%2==0) {
				System.out.println(digit);
			}
			n= n /10;			
		}
		
	}
}
