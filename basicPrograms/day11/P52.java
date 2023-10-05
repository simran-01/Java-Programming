// convert decimal to binary

package day11;

public class P52 {
	public static void main(String[] args) {
		int n = 12;
		String bin = "";
		
		while (n!=0) {
			int rem= n%2;
			bin= rem+bin;
			
			n=n/2;
			
		}
		System.out.println(bin);
		
	}

}
