/*
20JY0209 カン　シチョウ
*/

import java.util.Scanner;

class Sp005{
	public static void main(String[] args){
		int[][] data = new int[3][3];
		data[0][0]=1;
		data[0][1]=5;
		data[0][2]=9;
		
		data[1][0]=4;
		data[1][1]=3;
		data[1][2]=2;
		
		data[2][0]=7;
		data[2][1]=6;
		data[2][2]=8;
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int times = 0;
		System.out.println("整数を入力してください。");
		do{	
			num = scan.nextInt();
			for(int i=0;i<3;i++){
				for(int j=0;j<3;j++){
					if(data[i][j] == num){
						times += 1;
					}
				}
			}
		}while(num != -1);
		
		System.out.println();
		System.out.println("ビンゴカード");
		for(int m=0;m<3;m++){
			for(int n=0;n<3;n++){
				System.out.print(data[m][n]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("ビンゴした数は"+times+"つです。");
	}
}