/*
20JY0209 カン　シチョウ
*/

import java.util.Scanner;

public class Ex037 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("購入個数を入力してください！");
		int num = scan.nextInt();
		
		System.out.println("価格を入力してください");
		int price = scan.nextInt();
		
		int sum = num * price;
		if(num >= 500){
			sum = (int)(sum*0.8);
		}
		System.out.println("定価"+price+"円の商品を"+num+"個を購入する場合は"+(int)sum+"円");
    }
}
