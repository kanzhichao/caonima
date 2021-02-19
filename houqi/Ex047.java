/*
20JY0209 カン　シチョウ
*/

public class Ex047 {
	public static void main(String[] args){
		Robot r = new Robot(60,18,"ガンダム");
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
		System.out.println("重さは"+weight+"tonです");
	}
	
	void showHeight(){
		System.out.println("身長は"+height+"mです");
	}
	
	void showName(){
		System.out.println("名前は"+name+"です");
	}
	
	Robot(int weight,int height,String name){
		this.weight = weight;
		this.height = height;
		this.name = name;
	}
	
}
