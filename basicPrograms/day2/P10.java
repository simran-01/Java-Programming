
//WAJP to print product of numbers from 1 to 50 only if number is divisible by 7.
package day2;

public class P10 {
	
	public static void main(String[] args) {

        long prod = 1;

        for (int i = 1; i <= 50; i++) {
            if (i % 7 == 0) {
                prod = prod * i;
            }
        }
        System.out.println(prod);
    }

}
