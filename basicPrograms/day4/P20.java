
//WAJP to count all leap year between a given range.
package day4;

public class P20 {
	
	public static void main(String[] args) {
		
		int count = 0;
		int y1 = 1600;
		int y2=2000;
		
		while(y1<=y2) {
			if(y1%4==0 && y1%100!=0 || y1%400==0) {
				count++;				
			}
			y1++;
		}
		
		System.out.println(count);
			
		
	}

}

