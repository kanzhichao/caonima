/*
20JY0209 �J���@�V�`���E
*/

public class Ex029 {
    public static void main(String[] args) {
        int[] data = new int[7];
		System.out.print("�z��v�f�̐����F");
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
		System.out.println("�z��v�f�̍ŏ��l�F"+min);
    }
}