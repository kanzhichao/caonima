/*
20JY0209 �J���@�V�`���E
*/

import java.util.Scanner;

public class Ex014{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("�h*�h��\�����������͂��Ă��������B");
		int n = scan.nextInt();
		
		if (n>0){
			for(int i=0;i<n;i++){
				System.out.print("*");
			}
		}else{
			System.out.println("���񂩂��1�ȏ�̐�������͂��Ă��������ˁI");
		}
	}
}
