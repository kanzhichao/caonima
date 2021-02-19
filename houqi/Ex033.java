/*
20JY0209 カン　シチョウ
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
		System.out.println("整数を入力してください！");
		do{
			num = scan.nextInt();
			sum += num;
		}while(num != -1);
		System.out.println("入力した整数の合計は"+(sum+1)+"です。");
	}
}
