/*
20JY0209 カン　シチョウ
*/

import java.util.Scanner;

public class Ex034 {
    public static void main(String[] args) {
		int ran1 =(int)(Math.random()*10);
		int ran2 =(int)(Math.random()*10);
		int max = maxValue(ran1,ran2);
		System.out.println("a:"+ran1+",b:"+ran2+",max:"+max);
    }
	
	static int maxValue(int a,int b){
		
		if(a > b){
			return a;
		}else{
			return b;
		}
	}
}
