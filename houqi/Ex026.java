/*
20JY0209 �J���@�V�`���E
*/

import java.util.Scanner;

public class Ex026 {
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

        int max = data[0];
        int min = data[0];
        int sum = data[0];
        double avg = 0;

        for (int j = 1; j < 5; j++) {
            if(data[j] > max){
                max = data[j];
            } else if(data[j] < min){
                min = data[j];
            }

            sum += data[j];
            avg = (double)sum /data.length;
        }

        System.out.println("�ō��_�F"+ max+"�_");
        System.out.println("�Œ�_�F"+ min+"�_");
        System.out.println("���ϓ_�F"+ avg+"�_");
    }
}