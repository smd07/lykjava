package java9;

import java.util.Random;
import java.util.Scanner;

public class Java9 {

	static int[] array = new int[5];

	public static void main(String[] args) {

		generateArray();
		printArray();
		lastIndex();
		sortArray();
		System.out.println(" ");
		printArray();

		System.out.println("bir değer giriniz");
		Scanner input = new Scanner(System.in);
		int deger = input.nextInt();

		;
		if (searchArray(deger) == 1) {
			System.out.println("bulundu");

		} else
			System.out.println("bulunamadı");

		lastIndex();

		input.close();
	}

	public static void printArray() {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}

	}

	public static int searchArray(int a) {

		int k = 0;
		for (int i = 0; i < 5; i++) {
			if (a == array[i]) {
				k = 1;
				break;

			} else
				k = 0;
		}
		return k;

	}

	public static void sortArray() {
		int temp;

		for (int i = 1; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {

				if (array[i] < array[j]) {
					temp = array[j];

					array[j] = array[i];
					array[i] = temp;
				}
			}
		}

	}

	public static void generateArray() {

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10);
		}

	}

	public static void lastIndex() {

		System.out.println(array[array.length - 1]);

	}

}
