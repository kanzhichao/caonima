/*
20JY0209 �J���@�V�`���E
*/

import java.util.Scanner;

public class Ex035 {
    public static void main(String[] args) {
        int data[] = new int[5];
        Scanner scan = new Scanner(System.in);
        int i = 1;
        do {
            System.out.println(i +"�l�ځF" );
            int n = scan.nextInt();
            data[i-1] = n;
            i++;
        }while(i<6);

        int max = getMax(data);
        int min = getMin(data);
		double ave = getAve(data); 
		
		System.out.println("�ō��_�F"+ max+"�_");
        System.out.println("�Œ�_�F"+ min+"�_");
		System.out.println("���ϓ_�F"+ ave+"�_");
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