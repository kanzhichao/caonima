/*
20JY0209 カン　シチョウ
*/

import java.util.Scanner;

class Sp003{
	public static void main(String[] args){
		int[][] data = new int[6][2];
		data[0][0]=100;
		data[1][0]=200;
		data[2][0]=400;
		data[3][0]=600;
		data[4][0]=1000;
		data[5][0]=2000;
		
		data[0][1]=100;
		data[1][1]=190;
		data[2][1]=370;
		data[3][1]=550;
		data[4][1]=900;
		data[5][1]=1700;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("荷物の重さを入力してください：");
		int weight = scan.nextInt();
		for(int i=0;i<6;i++){
			if(weight==data[i][0]){
				System.out.println("料金は"+data[i][1]+"円です。");
			}
		}
	}
}
