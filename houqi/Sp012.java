/*
20JY0209 �J���@�V�`���E
*/

import java.util.Scanner;

public class Sp012 {
    public static void main(String[] args) {
        int [] ary = new int[2];
        Scanner scan = new Scanner(System.in);
        System.out.print("numA����͂��Ă���������");
        ary[0]  = scan.nextInt();
        System.out.print("numB����͂��Ă���������");
        ary[1] = scan.nextInt();
        System.out.print("numC����͂��Ă���������");
        double c = scan.nextDouble();
        int sum = calcVolume(ary,c);
        System.out.println("�����̂̑̐ς�"+sum+"�ł��B");

    }

    static int calcVolume(int[] array, double d) {
        int taiseki =(int)(array[0] * array[1] * d);
        return taiseki;
    }
	
	static int calcVolume(int[] array,int d) {
        int taiseki = array[0]*array[1]*d;
        return taiseki;
    }

}
