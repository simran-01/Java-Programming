// Swapping using third variable.

package day5;

public class P25 {
	public static void main(String[] args) {
		
		int a = 10 ;
		int b = 20;
		
		System.out.println("---Before Swapping---");
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("---After Swapping---");
		int c = a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
		
	}

}
