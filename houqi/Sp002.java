/*
20JY0209 �J���@�V�`���E
*/

import java.util.Scanner;

class Sp002{
	public static void main(String[] args){
		int[][] data = new int[3][3];
		data[0][1]=1;
		data[0][2]=2;
		data[1][0]=2;
		data[1][2]=1;
		data[2][0]=1;
		data[2][1]=2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("����񂯂����͂��Ă��������B");
		System.out.print("user1�F");
		int a = scan.nextInt();
		System.out.print("user2�F");
		int b = scan.nextInt();
		
		if(a==b){
			System.out.println("����");
		}else{
			System.out.println("user"+data[a][b]+"�̏���");
		}
	}
}
