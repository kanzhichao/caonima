/*
20JY0209 カン　シチョウ
*/

public class Ex025 {
    public static void main(String[] args) {
        int[] data = new int[5];
        System.out.print("5件の乱数：");
        for (int i = 0; i < 5; i++) {
            int ran =(int)(Math.random()*10);
            data[i] = ran;
            System.out.print(data[i]+" ");
        }
    }
}