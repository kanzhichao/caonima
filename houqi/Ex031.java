/*
20JY0209 �J���@�V�`���E
*/

import java.util.Scanner;

public class Ex031 {
    public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("�_������͂��Ă��������I");
		int ten = stdIn.nextInt();
		assess(ten);
    }
	
	static void assess(int ten){
		if(ten >= 80){
			System.out.println("��ς悭�ł��܂����I");
		}else if(ten >= 60){
			System.out.println("�悭�ł��܂����I");
		}else{
			System.out.println("�撣��܂��傤�I");
		}
	}
}
