/*
20JY0209 カン　シチョウ
*/

public class Ex024{
	public static void main(String[] args){
		int[] ary = {1,2,3,4,5};
		int sum = 0;
		double ave;
		for(int i=0;i<ary.length;i++){
			sum = sum + ary[i];
		}
		ave = sum/ary.length;
		
		System.out.println(ave);
	}
}
