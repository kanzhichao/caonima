/*
20JY0209 �J���@�V�`���E
*/

import java.util.Scanner;

public class Ex037 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�w��������͂��Ă��������I");
		int num = scan.nextInt();
		
		System.out.println("���i����͂��Ă�������");
		int price = scan.nextInt();
		
		int sum = num * price;
		if(num >= 500){
			sum = (int)(sum*0.8);
		}
		System.out.println("�艿"+price+"�~�̏��i��"+num+"���w������ꍇ��"+(int)sum+"�~");
    }
}
