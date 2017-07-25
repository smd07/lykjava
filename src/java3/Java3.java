package java3;

import java.util.Scanner;

public class Java3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("x girin:");
		int x=input.nextInt();
		System.out.println("y girin:");
		int y=input.nextInt();
		
		
		System.out.println("çevre:"+getPeri(x,y)+"  alan:"+getArea(x,y)+" hip:"+getHip(x,y));
		
		
		

	}

	public static int getPeri(int x, int y) {

		return getHip(x, y) + x + y;

	}

	public static int getArea(int x, int y) {

		return (x * y) / 2;

	}

	public static int getHip(int x, int y) {

		return (int) Math.hypot(x, y);
	}

}