//Swapping without using third variable.

package day5;

public class P26 {
	
	public static void main(String[] args) {
		
		int a = 10;//30,20
		int b = 20;//10
		
		a =a+b; // 10+20=30
		b= a-b; // 30-20=10
		a=a-b;  // 30-10=20
		
		System.out.println(a); // 20
		System.out.println(b); // 10
		
		
	}

}
