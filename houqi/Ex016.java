/*
20JY0209 カン　シチョウ
*/
class Ex016{
	public static void main(String[] args){
		for(int i=1;i<10;i++){
			for(int j=1;j<10;j++){
				if(i%2==0){
					continue;
				}else if(i*j<10){
					System.out.print("  "+i*j);
				}else{
					System.out.print(" "+i*j);
				}
			}
			System.out.println();
		}
	}
}
