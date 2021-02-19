/*
20JY0209 ƒJƒ“@ƒVƒ`ƒ‡ƒE
*/

import java.util.Scanner;

public class Ex038 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("w“üŒÂ”‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢I");
        int num = scan.nextInt();

        System.out.println("‰¿Ši‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
        int price = scan.nextInt();

        int newPrice = getPrice(num,price);
        int sum = getTotalPrice(num,newPrice);

        System.out.println("’è‰¿"+newPrice+"‰~‚Ì¤•i‚ð"+num+"ŒÂ‚ðw“ü‚·‚éê‡‚Í"+(int)sum+"‰~");
    }

    static int getPrice(int num, int price) {
        if(num>= 500) {
            price = (int) (price * 0.8);
        }
        return price;
    }

    static int getTotalPrice(int num, int price) {
        int sum = num * price;
        return sum;
    }
}
