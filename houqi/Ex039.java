/*
20JY0209 �J���@�V�`���E
*/

public class Ex039 {
    public static void main(String[] args) {
		Square sq = new Square();
		sq.width = 7;
		sq.height = 3;
		sq.showWidth();
		sq.showHeight();
		sq.showArea();
    }
}

class Square{
	int width;
	int height;
	void showWidth(){
		System.out.println("������"+width+"�ł��B");
	}
	
	void showHeight(){
		System.out.println("������"+height+"�ł��B");
	}
	
	void showArea(){
		System.out.println("�ʐς�"+height*width+"�ł��B");
	}
}
