/*
20JY0209 �J���@�V�`���E
*/

public class Ex030 {
    public static void main(String[] args) {
        int[] data = new int[100];
		int a = 0;
		int b = 0;
		int c = 0;
        for (int i = 0; i < 100; i++) {
            int ran =(int)(Math.random()*3);
            data[i] = ran;
			if(data[i] == 0){
            	System.out.println("����񂯂�F	�O�|");
				a += 1;
			}else if(data[i] == 1) {
				System.out.println("����񂯂�F	�`���L");
				b += 1;
			}else{
				System.out.println("����񂯂�F	�p�|");
				c += 1;
			}
        }
		System.out.println();
		System.out.println("�O�|�̉񐔁F	"+a+"��");
		System.out.println("�`���L�̉񐔁F	"+b+"��");
		System.out.println("�p�|�̉񐔁F	"+c+"��");
    }
}