/*
20JY0209 カン　シチョウ
*/

import java.util.Scanner;

public class Sp011 {
    public static void main(String[] args) {
        int [] ary = new int[2];
        Scanner scan = new Scanner(System.in);
        System.out.print("numAを入力してください＞");
        ary[0] = scan.nextInt();
        System.out.print("numBを入力してください＞");
        ary[1] = scan.nextInt();
        System.out.print("numCを入力してください＞");
        int c = scan.nextInt();
        int sum = calcVolume(ary,c);
        System.out.println("直方体の体積は"+sum+"です。");

    }

    static int calcVolume(int[] array,int d) {
        int taiseki = array[0]*array[1]*d;
        return taiseki;
    }
}
