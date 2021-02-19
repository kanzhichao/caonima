/*
20JY0209 カン　シチョウ
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
		System.out.println("横幅は"+width+"です。");
	}
	
	void showHeight(){
		System.out.println("高さは"+height+"です。");
	}
	
	void showArea(){
		System.out.println("面積は"+height*width+"です。");
	}
}
