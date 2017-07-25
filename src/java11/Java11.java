package java11;

public class Java11 {
	
	
	static int temp;
	public static void main(String[] args) {
		
		int[] array={1,2,3,4,5,6};
		
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
			
		}
		
		
		int son=array.length;
		
		for (int i = 0; i < array.length/2; i++) {
			--son;
			
			temp=array[i];
			array[i]=array[son];
			array[son]=temp;
			
			
		}
		
		System.out.println("");
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
			
		}
		

	}
	
	
	

}
