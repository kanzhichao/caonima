/*
20JY0209 �J���@�V�`���E
*/

public class Ex048 {
	public static void main(String[] args){
		String []data = new String[3];
		data [0] = "d1";
		data [1] = "d2";
		data [2] = "d3";
		
		Robot data[0] = new Robot(60.0,18,"�K���_��");
	//	d2 = new Robot(0.23,1.8,"ASIMO");
	//	d3 = new Robot(1.0,1.5,"���{�R��");
		
		data[0].showSpec();
		
	}
}

class Robot{
	double weight;
	double height;
	String name;
	
	void showSpec(){
		System.out.println(name+"("+weight+"ton,"+height+"m)");
	}
	Robot(double weight,double height,String name){
		this.weight = weight;
		this.height = height;
		this.name = name;
	}
	
	
}
