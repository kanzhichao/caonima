/*
20JY0209 �J���@�V�`���E
*/

import java.util.Scanner;

public class Ex020{
	public static void main(String[] args){
		String[] data = new String[]{"�\","��","��","��","�q","�N","��","�K","�C","��","��","��"};
		Scanner scan = new Scanner(System.in);
		System.out.println("�������͂��Ă��������I");
		int year = scan.nextInt();
		for (int i=0;i<data.length;i++){
			if(i == year%12){
				System.out.println(year+"�N��"+data[i]+"�N�ł��B");
			}
		}
	}
}
