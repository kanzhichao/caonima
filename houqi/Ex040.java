/*
20JY0209 �J���@�V�`���E
*/

public class Ex040 {
    public static void main(String[] args) {
		Square sq = new Square();
		sq.width = 7;
		sq.height = 3;
		int w = sq.getWidth();
		int h = sq.getHeight();
		int a = sq.getArea();
		System.out.println("������"+w+"�C"+"������"+h+"�C"+"�ʐς�"+a+"�ł��B");
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
