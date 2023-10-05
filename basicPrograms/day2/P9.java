//WAJP to print sum of all odd numbers from 1 to 10.
package day2;

public class P9 {
	

	public static void main(String[] args) {
	        int sum = 0;

	        for (int i = 1; i <= 10; i++) {
	            if (i % 2 != 0) {
	                sum += i;

	            }
	        }
	        System.out.println(sum);
	    }

	}


