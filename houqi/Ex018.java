/*
20JY0209 カン　シチョウ
*/

import java.util.Scanner;

public class Ex018{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("”○””●”を表示する個数を入力してください。");
		int n = scan.nextInt();
		
		if(n>0){
			for(int i=1;i<=n;i++){
				if(i%2 != 0){
					System.out.print("○");
				}else{
					System.out.print("●");
				}
			}
		}else{
			System.out.println("次回からは1以上の数字を入力してくださいね！");
		}
	}
}
