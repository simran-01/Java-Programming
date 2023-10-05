
//WAJP to count all leap year between a given range.
package day4;

public class P23 {
	
	public static void main(String[] args) {
		
		int count =0;
		
		for(int y1= 2023,y2=2100;y1<=y2;y1++) {
			if(y1%4==0 && y1%100!=0 || y1%400==0) {
				count++;				
			}
		}
		
		System.out.println(count);
		
	}

}
