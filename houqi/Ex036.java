/*
20JY0209 �J���@�V�`���E
*/

import java.util.Scanner;

public class Ex036 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�w���̐l������͂��Ă��������I");
		int student = scan.nextInt();
		
		System.out.println("�o�ȗ���100���̊w���̐l������͂��Ă�������");
		int goodStudent = scan.nextInt();
		
		double rate = rateCalculate(student,goodStudent);
		System.out.println("�o�ȗ���100���̊w���͑S�̂�"+rate+"���ł�");
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
