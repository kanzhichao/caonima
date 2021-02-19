/*
20JY0209 カン　シチョウ
*/

import java.util.Scanner;

class Sp004{
	public static void main(String[] args){
		int[][] data = new int[3][3];
		Scanner scan = new Scanner(System.in);
		System.out.println("整数を9つ入力してください。");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				int k = scan.nextInt();
				data[i][j] = k;
			}
		}
		
		System.out.println();
		
		for(int m=0;m<3;m++){
			for(int n=0;n<3;n++){
				System.out.print(data[m][n]+" ");
			}
			System.out.println();
		}
	}
}
