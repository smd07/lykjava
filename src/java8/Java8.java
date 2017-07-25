package java8;

public class Java8 {

	public static void main(String[] args) {
		int[][] array=new int[10][10];
		int sayac=1;
		
		

		for (int i =0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				
				array[i][j]=(i+1)*(j+1);
				sayac++;
			
		}
		}
		

		for (int i =0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				
				if (array[i][j]/10>=1) {
					System.out.print(" "+array[i][j]+ "  ");
				}
				else
					System.out.print("  "+array[i][j]+ "  ");
			
		}
			System.out.println("");
		}
		
		

	}

}
