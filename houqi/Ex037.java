/*
20JY0209 ƒJƒ“@ƒVƒ`ƒ‡ƒE
*/

import java.util.Scanner;

public class Ex037 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("w“üŒÂ”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢I");
		int num = scan.nextInt();
		
		System.out.println("‰¿Ši‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
		int price = scan.nextInt();
		
		int sum = num * price;
		if(num >= 500){
			sum = (int)(sum*0.8);
		}
		System.out.println("’è‰¿"+price+"‰~‚Ì¤•i‚ğ"+num+"ŒÂ‚ğw“ü‚·‚éê‡‚Í"+(int)sum+"‰~");
    }
}
