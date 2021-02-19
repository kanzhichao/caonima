/*
20JY0209 カン　シチョウ
*/

import java.util.Scanner;

public class Ex013{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int x,y;
		System.out.print("xを入力してください：");
		x = scan.nextInt();
		System.out.print("yを入力してください：");
		y = scan.nextInt();
		
		int sum = x + y;
		int dist = x - y;
		int times = x * y;
		
		System.out.println("x + y = "+sum);
		System.out.println("x - y = "+dist);
		System.out.println("x * y = "+times);
	}
}
