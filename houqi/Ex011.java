/*
20JY0209 �J���@�V�`���E
*/
class Ex011{
	public static void main(String[] args){
		for(int i=0;i<7;i++){
			for(int j=0;j<7;j++){
				if(i==j||j==7-i-1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
}
