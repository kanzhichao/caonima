/*
20JY0209 カン　シチョウ
*/

public class Ex045 {
	public static void main(String[] args){
		Food f1 = new Food("たい焼き",100);
		f1.printPrice();
		f1.printPrice(3);
	}
}

class Food{
	String name;
	int price;
	
	Food(String name,int price){
		this.name = name;
		this.price = price;
	}
	
	void printPrice(){
		System.out.println(name+"は1個"+price+"円");
	}
	
	void printPrice(int n){
		System.out.println(name+"は"+n+"個"+n*price+"円");
	}
}
