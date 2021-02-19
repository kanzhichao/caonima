/*
20JY0209 カン　シチョウ
*/

public class Ex027{
	public static void main(String[] args){
		int[] data1 = new int[]{11,22,33};
		int[] data2 = new int[data1.length];
		
		for(int i=0;i<data1.length;i++){
			data2[i]=data1[i];
		}
		
		data2[0] = 10;
		data2[1] = 20;
		
		System.out.print("data1:");
		printAry(data1);
		System.out.print("data2:");
		printAry(data2);
	}
	static void printAry(int[] ary){
		for(int data : ary){
			System.out.print(data +" ");
		}
		System.out.println();
	}
}
