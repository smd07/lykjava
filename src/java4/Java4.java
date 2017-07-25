package java4;

import java.util.Scanner;

public class Java4 {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		int giris=input.nextInt();
		
		System.out.println(getHacim(giris));

		

	}
	
	public static int getHacim(int r) {
		
		
		return (int) (4*Math.PI/3*Math.pow(r, 3));
		
		
	}
	
	
	
	
	

}
