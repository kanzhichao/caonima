/*
20JY0209 カン　シチョウ
*/

import java.util.Scanner;

public class Ex035 {
    public static void main(String[] args) {
        int data[] = new int[5];
        Scanner scan = new Scanner(System.in);
        int i = 1;
        do {
            System.out.println(i +"人目：" );
            int n = scan.nextInt();
            data[i-1] = n;
            i++;
        }while(i<6);

        int max = getMax(data);
        int min = getMin(data);
		double ave = getAve(data); 
		
		System.out.println("最高点："+ max+"点");
        System.out.println("最低点："+ min+"点");
		System.out.println("平均点："+ ave+"点");
    }
	
	static int getMax(int[] arry){
		int max = arry[0];
		for (int j = 1; j < 5; j++) {
            if(arry[j] > max){
                max = arry[j];
            }
		}
		return max;
	}
	
	static int getMin(int[] arry){
		int min = arry[0];
		for (int j = 1; j < 5; j++) {
            if(arry[j] < min){
                min = arry[j];
            }
		}
		return min;
    }
	
	static double getAve(int[] arry){
		int sum = 0;
		double ave = 0;
		for (int j = 0; j < arry.length; j++) {
			sum += arry[j];
		}
		ave = (double)sum /arry.length;
		return ave;
	}
}