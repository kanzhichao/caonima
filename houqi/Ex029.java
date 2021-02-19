/*
20JY0209 カン　シチョウ
*/

public class Ex029 {
    public static void main(String[] args) {
        int[] data = new int[7];
		System.out.print("配列要素の正順：");
        for (int i = 0; i < 7; i++) {
            int ran =(int)(Math.random()*21-10);
            data[i] = ran;
            System.out.print(data[i]+" ");
        }
		System.out.println();
		
		int min = data[0];
		for(int j=1;j<data.length;j++){
			if(data[j]<min){
				min=data[j];
			}
		}
		System.out.println("配列要素の最小値："+min);
    }
}