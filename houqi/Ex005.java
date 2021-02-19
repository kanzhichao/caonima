/*
20JY0209 カン　シチョウ
*/
class Ex005{
	public static void main(String[] args){
		
		int i1=5;
		int i2=3;
		double div;
		
		div = (double)i1/i2;
		div = div * 100;
		div = (int)(div+0.5);
		div = div/100;
		System.out.println(i1+"/"+i2+"="+div);
	}
}
