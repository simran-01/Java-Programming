//WAJP to check palindrome

package day7;

public class P36 {
	public static void main(String[] args) {
		
		int n = 1331;
		int temp = n;
		int rev=0;
		
		while (n!=0) {
			int d = n%10;
			rev = rev*10+d;
			n=n/10;
			
		}
		
		if(rev==temp) {
			System.out.println(temp+" is a palindrome");
		}
		else {
			System.out.println(temp+" is not a palindrome");
		}
		
	}

}
