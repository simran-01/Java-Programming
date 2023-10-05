//WAJP to find result of number raised to power

package day9;

public class P47 {
	
	public static void main(String[] args) {
		
		int number = 5;
		int power=4;
		int pow=1;
		
		for(int i=1;i<=power;i++) {
			pow = pow*number;
		}
		System.out.println(pow);
		
	}

}