/*
20JY0209 カン　シチョウ
*/

import java.util.Scanner;

public class Ex020{
	public static void main(String[] args){
		String[] data = new String[]{"申","酉","戌","亥","子","丑","寅","卯","辰","巳","午","未"};
		Scanner scan = new Scanner(System.in);
		System.out.println("西暦を入力してください！");
		int year = scan.nextInt();
		for (int i=0;i<data.length;i++){
			if(i == year%12){
				System.out.println(year+"年は"+data[i]+"年です。");
			}
		}
	}
}
