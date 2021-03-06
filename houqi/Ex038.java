/*
20JY0209 カン　シチョウ
*/

import java.util.Scanner;

public class Ex038 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("購入個数を入力してください！");
        int num = scan.nextInt();

        System.out.println("価格を入力してください");
        int price = scan.nextInt();

        int newPrice = getPrice(num,price);
        int sum = getTotalPrice(num,newPrice);

        System.out.println("定価"+newPrice+"円の商品を"+num+"個を購入する場合は"+(int)sum+"円");
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
