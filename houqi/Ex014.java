/*
20JY0209 カン　シチョウ
*/

import java.util.Scanner;

public class Ex014{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("”*”を表示する個数を入力してください。");
		int n = scan.nextInt();
		
		if (n>0){
			for(int i=0;i<n;i++){
				System.out.print("*");
			}
		}else{
			System.out.println("次回からは1以上の数字を入力してくださいね！");
		}
	}
}
