/*
20JY0209 カン　シチョウ
*/

public class Ex041 {
	public static void main(String[] args){
		PlasticBottle pb1 = new PlasticBottle();
		PlasticBottle pb2 = new PlasticBottle(1000);
		PlasticBottle pb3 = new PlasticBottle(350,200);
		pb1.show();
		pb2.show();
		pb3.show();
	}
	
}


class PlasticBottle{
	int size;
	int nokori;
	
	PlasticBottle(){
		size = 500;
		nokori = 500;
	}
	
	PlasticBottle(int ml){
		size = ml; 
		nokori = 0;
	}
	
	PlasticBottle(int ml ,int remain){
		size = ml;
		nokori = remain;
	}
	
	void show(){
		System.out.println("サイズは"+size+"ml"+"残りは"+nokori+"mlです。");
	}
}
