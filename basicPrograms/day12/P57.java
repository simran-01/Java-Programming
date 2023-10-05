//WAJP to convert from octal to hexadecimal

package day12;

public class P57 {
	public static void main(String[] args) {
		
		int oct = 15; //octal
		int p = 1;
		int sum=0; // decimal
		
		while (oct!=0) {
			
			int d = oct%10;
			sum= sum+d*p;
			p=p*8;

			
			oct=oct/10;			
		}
		
		String hex="";
		
		while(sum!=0) {
			int rem=sum%16;
			
			switch(rem) {
			
			case 10: hex= 'A'+hex;
			break;
			
			case 11: hex= 'B'+hex;
			break;
			
			case 12: hex='C'+hex;
			break;
			
			case 13: hex='D'+hex;
			break;
			
			case 14: hex='E'+hex;
			break;
			
			case 15: hex='F'+hex;
			break;
			
			default: hex= rem+hex;
			break;
			}
			
			sum= sum/16;
		}
		
		System.out.println(hex);
		
		
	
		
		
	}

}
