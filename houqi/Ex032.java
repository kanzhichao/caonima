/*
20JY0209 �J���@�V�`���E
*/

import java.util.Scanner;

public class Ex032 {
    public static void main(String[] args) {
		int height1 = 180;
		int height2 = 160;
		int height3 = 140;
		System.out.println("1�l�ڂ̃T�C�Y��"+selectSize(height1)+"�ł��B");
		System.out.println("2�l�ڂ̃T�C�Y��"+selectSize(height2)+"�ł��B");
		System.out.println("3�l�ڂ̃T�C�Y��"+selectSize(height3)+"�ł��B");
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
