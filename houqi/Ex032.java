/*
20JY0209 カン　シチョウ
*/

import java.util.Scanner;

public class Ex032 {
    public static void main(String[] args) {
		int height1 = 180;
		int height2 = 160;
		int height3 = 140;
		System.out.println("1人目のサイズは"+selectSize(height1)+"です。");
		System.out.println("2人目のサイズは"+selectSize(height2)+"です。");
		System.out.println("3人目のサイズは"+selectSize(height3)+"です。");
    }
	
	static char selectSize(int height){
		char size;
		if(height >= 170){
			size = 'L';
		}else if(height > 150){
			size = 'M';
		}else{
			size = 'S';
		}
		return size;
	}
}
