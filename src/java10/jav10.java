package java10;

import java.util.Random;

public class jav10 {

	static int[] array=new int[10];
	public static void main(String[] args) {
		
		
		
		generateArray();
		printArray();
		System.out.println("");
		sortArray();
		System.out.println("");
		System.out.println(getAverage());
		
		
		
	}
	public static void printArray() {

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}

	}
	
	public static int getAverage() {
		int result=0;
		for (int i = 1; i < array.length-1; i++) {
			result=result+array[i];
		}
		
		return result/(array.length-2);
		
		
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
		
		
		System.out.println("min:"+array[0]+"  max:"+array[(array.length-1)]);

	}
	

	public static void generateArray() {

		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(10)+1;
		}

	}
	
	
	
}
