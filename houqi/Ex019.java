/*
20JY0209 �J���@�V�`���E
*/

import java.util.Scanner;

public class Ex019{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("�������͂��Ă��������I");
		int year = scan.nextInt();
		switch(year % 12){
			case 0:
				System.out.println(year+"�N�͐\�N�ł��B");
				break;
			case 1:
				System.out.println(year+"�N�͓єN�ł��B");
				break;
			case 2:
				System.out.println(year+"�N�͜��N�ł��B");
				break;
			case 3:
				System.out.println(year+"�N�͈�N�ł��B");
				break;
			case 4:
				System.out.println(year+"�N�͎q�N�ł��B");
				break;
			case 5:
				System.out.println(year+"�N�͉N�N�ł��B");
				break;
			case 6:
				System.out.println(year+"�N�͓ДN�ł��B");
				break;
			case 7:
				System.out.println(year+"�N�͉K�N�ł��B");
				break;
			case 8:
				System.out.println(year+"�N�͒C�N�ł��B");
				break;
			case 9:
				System.out.println(year+"�N�͖��N�ł��B");
				break;
			case 10:
				System.out.println(year+"�N�͌ߔN�ł��B");
				break;
			case 11:
				System.out.println(year+"�N�͖��N�ł��B");
				break;
		}
	}
}
