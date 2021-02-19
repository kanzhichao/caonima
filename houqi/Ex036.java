/*
20JY0209 カン　シチョウ
*/

import java.util.Scanner;

public class Ex036 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("学生の人数を入力してください！");
		int student = scan.nextInt();
		
		System.out.println("出席率が100％の学生の人数を入力してください");
		int goodStudent = scan.nextInt();
		
		double rate = rateCalculate(student,goodStudent);
		System.out.println("出席率が100％の学生は全体の"+rate+"％です");
    }
	
	static double rateCalculate(int a,int b){
		double rate;
		rate = (double)b/a;
		rate = rate * 1000;
		rate = (int)(rate+0.5);
		rate = rate / 10;
		
		return rate;
	}
}
