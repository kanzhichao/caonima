/*
20JY0209 カン　シチョウ
*/

import java.util.Scanner;

public class Ex017{
	public static void main(String[] args){
		System.out.print("入力する整数の合計を求めます。");
		Scanner scan = new Scanner(System.in);
		System.out.println("数字を入力してください。（ただし合計が1000を超えたら終了します）");
		int n=scan.nextInt();
		int i=0;
		int sum=0;
		int m;
		
		do{
			System.out.print("整数を入力してください：");
			m=scan.nextInt();
			sum +=m;
			if(sum>1000){
				break;
			}
			i++;
		}while(i<n);
		if(sum>1000){
			sum -=m;
			System.out.println("合計が1000を超えたので終了します");
		}
		System.out.println("合計は"+sum+"です。");
	}
}
