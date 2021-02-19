/*
20JY0209 カン　シチョウ
*/
class Ex009{
	public static void main(String[] args){
		for(int i=0;i<5;i++){
			for(int j=0;j<10;j++){
				if(j==i*2||j==i*2+1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
