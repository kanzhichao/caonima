/*
20JY0209 �J���@�V�`���E
*/

public class Ex023{
	public static void main(String[] args){
		int[] Data;
		Data = new int[4];
		Data[0]=3;
		Data[1]=6;
		Data[2]=9;
		Data[3]=5;
		
		System.out.print("�z��v�f�̐����F");
		for(int i=0;i<4;i++){
			System.out.print(Data[i]+" ");
		}
		System.out.println();
		System.out.print("�z��v�f�̋t���F");
		for(int i=0;i<4;i++){
			System.out.print(Data[3-i]+" ");
		}
	}
}
