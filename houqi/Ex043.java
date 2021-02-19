/*
20JY0209 カン　シチョウ
*/

public class Ex043 {
	public static void main(String[] args){
		Car3 c3 = new Car3();
		c3.print();
			
		c3.run('西',50);
		c3.print();
		
		c3.turn('北');
		c3.print();
		
		
		c3.turn('南',60);
		c3.print();
		
		c3.stop();
		c3.print();
	}
	
}

class Car3{
	int gasoline = 50;
	char direction = '北';
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
		System.out.println("ガソリン："+gasoline+" Liter");
		System.out.println("方向	："+direction);
		System.out.println("スピード："+speed+"km/h");
		System.out.println();
		
	}
}