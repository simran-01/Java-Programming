
//convert decimal to octal
package day11;

public class P53 {
	public static void main(String[] args) {
		
		int n = 13;
		String oct = "";
		
		while (n!=0) {
			int rem = n%8;
			oct = rem+oct;
			
			n=n/8;
						
		}
		System.out.println(oct);
	}

}
