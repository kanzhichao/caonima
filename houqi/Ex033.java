/*
20JY0209 �J���@�V�`���E
*/

import java.util.Scanner;

public class Ex033 {
    public static void main(String[] args) {
		sumOf();
    }
	static void sumOf(){
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		System.out.println("��������͂��Ă��������I");
		do{
			num = scan.nextInt();
			sum += num;
		}while(num != -1);
		System.out.println("���͂��������̍��v��"+(sum+1)+"�ł��B");
	}
}
