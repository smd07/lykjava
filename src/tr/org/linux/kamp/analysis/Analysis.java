package tr.org.linux.kamp.analysis;

import java.util.Random;
import java.util.Scanner;

public class Analysis {

	public static void main(String[] args) {

		System.out.println(cardRank() + cardSuit());

	}

	private static String cardRank() {

		Random rand = new Random();
		int sayi = rand.nextInt(13)+1;

		if (sayi > 1 && sayi <= 10) {
			return "" + sayi;
		}

		if (sayi == 1) {
			return "as";
		}
		if (sayi == 11) {
			return "vale";
		}
		if (sayi == 12) {
			return "kız";
		}
		if (sayi == 13) {
			return "papaz";
		} else
			return "";
	}

	private static String cardSuit() {

		Random rand = new Random();
		int sayi = rand.nextInt(4);

		if (sayi == 0) {
			return "sinek";
		}

		if (sayi == 1) {
			return "maça";
		}
		if (sayi == 2) {
			return "karo";
		}
		if (sayi == 3) {
			return "kupa ";
		} else
			return "";
	}

}
