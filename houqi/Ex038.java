/*
20JY0209 �J���@�V�`���E
*/

import java.util.Scanner;

public class Ex038 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("�w��������͂��Ă��������I");
        int num = scan.nextInt();

        System.out.println("���i����͂��Ă�������");
        int price = scan.nextInt();

        int newPrice = getPrice(num,price);
        int sum = getTotalPrice(num,newPrice);

        System.out.println("�艿"+newPrice+"�~�̏��i��"+num+"���w������ꍇ��"+(int)sum+"�~");
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
