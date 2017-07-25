package java12;

import java.util.Random;

public class Java12 {
	static String name = "sim";

	public static void main(String[] args) {
		int sayac = 0;
		int k = 1;
		Random rand = new Random();
		while (k == 1) {
			for (int j = 0; j < 2; j++) {

				int harf = rand.nextInt(26) + 97;
				
				name = name + (char) harf;
				if (name == "simon") {
					System.out.println((String) name + " " + sayac + " deneme");
					k = 0;
				}
				
				
			}
			System.out.println(name);
			name = "sim";
			sayac++;
		}

	}

}
