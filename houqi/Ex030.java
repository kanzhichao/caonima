/*
20JY0209 カン　シチョウ
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
            	System.out.println("じゃんけん：	グ－");
				a += 1;
			}else if(data[i] == 1) {
				System.out.println("じゃんけん：	チョキ");
				b += 1;
			}else{
				System.out.println("じゃんけん：	パ－");
				c += 1;
			}
        }
		System.out.println();
		System.out.println("グ－の回数：	"+a+"回");
		System.out.println("チョキの回数：	"+b+"回");
		System.out.println("パ－の回数：	"+c+"回");
    }
}