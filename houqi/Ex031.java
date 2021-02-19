/*
20JY0209 カン　シチョウ
*/

import java.util.Scanner;

public class Ex031 {
    public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("点数を入力してください！");
		int ten = stdIn.nextInt();
		assess(ten);
    }
	
	static void assess(int ten){
		if(ten >= 80){
			System.out.println("大変よくできました！");
		}else if(ten >= 60){
			System.out.println("よくできました！");
		}else{
			System.out.println("頑張りましょう！");
		}
	}
}
