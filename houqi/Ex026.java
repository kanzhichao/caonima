/*
20JY0209 カン　シチョウ
*/

import java.util.Scanner;

public class Ex026 {
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

        System.out.println("最高点："+ max+"点");
        System.out.println("最低点："+ min+"点");
        System.out.println("平均点："+ avg+"点");
    }
}