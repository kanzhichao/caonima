/*
20JY0209 �J���@�V�`���E
*/

public class Ex043 {
	public static void main(String[] args){
		Car3 c3 = new Car3();
		c3.print();
			
		c3.run('��',50);
		c3.print();
		
		c3.turn('�k');
		c3.print();
		
		
		c3.turn('��',60);
		c3.print();
		
		c3.stop();
		c3.print();
	}
	
}

class Car3{
	int gasoline = 50;
	char direction = '�k';
	int speed = 0;
	
	void run(char dir,int spd){
		gasoline -= 1;
		direction = dir;
		speed = spd;
	}
	
	void turn(char dir,int spd){
		gasoline -= 1;
		direction = dir;
		speed = spd;
	}
	
	void turn(char dir){
		gasoline -= 1;
		direction = dir;
	}
	
	void stop(){
		speed = 0;
	}
	
	void print(){
		System.out.println("�K�\�����F"+gasoline+" Liter");
		System.out.println("����	�F"+direction);
		System.out.println("�X�s�[�h�F"+speed+"km/h");
		System.out.println();
		
	}
}