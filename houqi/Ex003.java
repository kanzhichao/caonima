/*
20JY0209 カン　シチョウ
*/
class Ex003{
	public static void main(String[] args){
		
		int i1,i2;
		
		i1=23;
		i2=4;
		
		int sum = i1+i2;
		int dist = i1-i2;
		int times = i1*i2;
		int div = i1/i2;
		int mod1 = i1-div*i2;
		int mod2 = i1%i2;
		
		System.out.println(i1+" + "+i2+" = "+sum);
		System.out.println(i1+" - "+i2+" = "+dist);
		System.out.println(i1+" * "+i2+" = "+times);
		System.out.println(i1+" / "+i2+" = "+div);
		System.out.println(i1+" / "+i2+"の余りは"+mod1+"です(余りの演算子不使用)");
		System.out.println(i1+" / "+i2+"の余りは"+mod2+"です(余りの演算子使用)");
	}
}
