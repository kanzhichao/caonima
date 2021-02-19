/*
20JY0209 カン　シチョウ
*/
class Sp001{
	public static void main(String[] args){
		int[][] data = new int[10][10];
		for(int i=1;i<10;i++){
			for(int j=1;j<10;j++){
				data[i][j]=i*j;
				if(i*j<10){
					System.out.print("  "+data[i][j]);
				}else{
					System.out.print(" "+data[i][j]);
				}
			}
			System.out.println();
		}
	}
}
