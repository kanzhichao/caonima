/*
20JY0209 �J���@�V�`���E
*/

import java.util.Scanner;

public class Ex017{
	public static void main(String[] args){
		System.out.print("���͂��鐮���̍��v�����߂܂��B");
		Scanner scan = new Scanner(System.in);
		System.out.println("��������͂��Ă��������B�i���������v��1000�𒴂�����I�����܂��j");
		int n=scan.nextInt();
		int i=0;
		int sum=0;
		int m;
		
		do{
			System.out.print("��������͂��Ă��������F");
			m=scan.nextInt();
			sum +=m;
			if(sum>1000){
				break;
			}
			i++;
		}while(i<n);
		if(sum>1000){
			sum -=m;
			System.out.println("���v��1000�𒴂����̂ŏI�����܂�");
		}
		System.out.println("���v��"+sum+"�ł��B");
	}
}
