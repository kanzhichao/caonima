/*
20JY0209 �J���@�V�`���E
*/

public class Ex046 {
	public static void main(String[] args){
		Robot r = new Robot(60,18,"�K���_��");
		r.showName();
		r.showWeight();
		r.showHeight();
	}
}

class Robot{
	int weight;
	int height;
	String name;
	
	void showWeight(){
		System.out.println("�d����"+weight+"ton�ł�");
	}
	
	void showHeight(){
		System.out.println("�g����"+height+"m�ł�");
	}
	
	void showName(){
		System.out.println("���O��"+name+"�ł�");
	}
	
	Robot(int ton,int meter,String title){
		weight = ton;
		height = meter;
		name = title;
	}
	
}
