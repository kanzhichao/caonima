/*
20JY0209 �J���@�V�`���E
*/

import java.util.Scanner;

public class Ex018{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("�h���h�h���h��\�����������͂��Ă��������B");
		int n = scan.nextInt();
		
		if(n>0){
			for(int i=1;i<=n;i++){
				if(i%2 != 0){
					System.out.print("��");
				}else{
					System.out.print("��");
				}
			}
		}else{
			System.out.println("���񂩂��1�ȏ�̐�������͂��Ă��������ˁI");
		}
	}
}
