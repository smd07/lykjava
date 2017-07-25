package java14;

import java.util.Scanner;

public class Java14 {

	public static void main(String[] args) {

		int key = 1;
		Scanner input = new Scanner(System.in);
		String kelime = "kelime dfd";
		System.out.println("bir kelime/cümle gir");
		kelime = input.nextLine();
		System.out.println("şifreleme sayısı");
		Scanner input2 = new Scanner(System.in);
		key = input2.nextInt();
		System.out.println(CaesarChiper(kelime, key));
		kelime = CaesarChiper(kelime, key);
		System.out.println(CaesarReverse(kelime, key));

	}

	public static String CaesarChiper(String str, int key) {

		String yeni = "";
		if (key<0) {key=26-(-key%26);
			
		}

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				
				
				yeni+=(char)('a'+(str.charAt(i)+key-'a')%26);
				
				
				
			} 
			else if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				yeni+=(char)('A'+(str.charAt(i)+key-'A')%26);
			} else
				yeni += (char) (str.charAt(i));
		}

		return yeni;

	}

	public static String CaesarReverse(String str, int key) {

		

		return CaesarChiper(str, -key);

	}

}
