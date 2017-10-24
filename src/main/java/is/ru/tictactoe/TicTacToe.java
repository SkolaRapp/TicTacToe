package is.ru.tictactoe;

public class TicTacToe {
	
	public static void main(String[] args){
	
		int[] board = new int[9];
		int turn = 0;

		//fill the board
		for(int i = 0; i < board.length; i++) {
			board[i] = i + 1;
		}

		System.out.println("TicTacToe");

		//display board
		int rowCounter = 0;
		for(int i = 0; i < 9; i++) {
			System.out.print(board[i] + " ");
			rowCounter++;

			if(rowCounter % 3 == 0) {
				System.out.println();
			}
		}

		
	}

}