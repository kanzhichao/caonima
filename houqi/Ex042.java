/*
20JY0209 カン　シチョウ
*/

public class Ex042 {
	public static void main(String[] args){
		Car c1 = new Car();
		
		c1.gasoline = 50;
		
		c1.run('西',50);
		
		c1.turn('北');
		
		c1.stop();
		
		c1.run('東',100);
		
		c1.stop();
		
	}
	
}

class Car{
	int gasoline;
	char direction;
	int speed;
	
	void run(char dir,int spd){
		gasoline -= 1;
		direction = dir;
		speed = spd;
		print();
	}
	
	void turn(char dir){
		gasoline -= 1;
		direction = dir;
		print();
	}
	
	void stop(){
		speed = 0;
		print();
	}
	
	void print(){
		System.out.println("ガソリン："+gasoline+" Liter");
		System.out.println("方向	："+direction);
		System.out.println("スピード："+speed+"km/h");
		System.out.println();
		
	}
}
