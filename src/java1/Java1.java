package java1;

import java.util.Random;
import java.util.Scanner;

public class Java1 {

	public static void main(String[] args) {
	
		Random rand = new Random();
		int k1 = rand.nextInt(12)+1;
		
		Random rand2 = new Random();
		int k2 = rand2.nextInt(12)+1;
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("isim giriniz");
		String kad1=input.next();
		System.out.println("isim giriniz");
		String kad2=input.next();
		
		
		
		if (k1>k2) {
			System.out.println(k1+" atarak "+kad1+" kazandı");
			System.out.println(k2+" atarak "+kad2+" kaybetti");
		}
		else if (k2>k1) {
			System.out.println(k2+" atarak "+kad2+" kazandı");
			System.out.println(k1+" atarak "+kad1+" kaybetti");
		}
		else {
			System.out.println("berabere");
		}
		
		
		input.close();
		
	}

}
