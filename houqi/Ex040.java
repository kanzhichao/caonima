/*
20JY0209 カン　シチョウ
*/

public class Ex040 {
    public static void main(String[] args) {
		Square sq = new Square();
		sq.width = 7;
		sq.height = 3;
		int w = sq.getWidth();
		int h = sq.getHeight();
		int a = sq.getArea();
		System.out.println("横幅は"+w+"，"+"高さは"+h+"，"+"面積は"+a+"です。");
    }
}

class Square{
	int width;
	int height;
	
	int getWidth(){
		return width;
	}
	
	int getHeight(){
		return height;
	}
	
	int getArea(){
		return width*height;
	}
}
