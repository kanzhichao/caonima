/*
20JY0209 �J���@�V�`���E
*/

public class Ex045 {
	public static void main(String[] args){
		Food f1 = new Food("�����Ă�",100);
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
		System.out.println(name+"��1��"+price+"�~");
	}
	
	void printPrice(int n){
		System.out.println(name+"��"+n+"��"+n*price+"�~");
	}
}
