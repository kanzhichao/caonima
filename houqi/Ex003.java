/*
20JY0209 �J���@�V�`���E
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
		System.out.println(i1+" / "+i2+"�̗]���"+mod1+"�ł�(�]��̉��Z�q�s�g�p)");
		System.out.println(i1+" / "+i2+"�̗]���"+mod2+"�ł�(�]��̉��Z�q�g�p)");
	}
}
