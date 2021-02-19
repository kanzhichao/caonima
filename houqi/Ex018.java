/*
20JY0209 ƒJƒ“@ƒVƒ`ƒ‡ƒE
*/

import java.util.Scanner;

public class Ex018{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("h›hhœh‚ð•\Ž¦‚·‚éŒÂ”‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢B");
		int n = scan.nextInt();
		
		if(n>0){
			for(int i=1;i<=n;i++){
				if(i%2 != 0){
					System.out.print("›");
				}else{
					System.out.print("œ");
				}
			}
		}else{
			System.out.println("ŽŸ‰ñ‚©‚ç‚Í1ˆÈã‚Ì”Žš‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢‚ËI");
		}
	}
}
