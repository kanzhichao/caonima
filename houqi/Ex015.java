/*
20JY0209 �J���@�V�`���E
*/

import java.util.Scanner;

public class Ex015{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("�����`�̂P�ӂ́h*�h�̐�����͂��Ă�������");
		int n = scan.nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i>0 && j>0 && i<n-1 && j<n-1){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}