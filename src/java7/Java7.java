package java7;

public class Java7 {

	public static void main(String[] args) {
		int[][] board=new int[4][3];
		System.out.println("borad length"+board.length);
		int counter=0;
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				board[i][j]=counter;
				counter++;
			}
			
		}
		
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.println(board[i][j]=counter);
				counter++;
			}
			
		}

	}

}
