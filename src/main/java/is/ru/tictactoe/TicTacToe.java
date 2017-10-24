package is.ru.tictactoe;

public class TicTacToe {
	
	private char[] board;

	//constructor
	public TicTacToe() {
		board = new char[9];

		//fill the board
		//for(int i = 0; i < board.length; i++) {
			//board[i] = '$';
		//}
	}

	public static void main(String[] args){
		
	}

	public char[] printBoard() {

		char[] testBoard = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
		int rowCounter = 0;

		for (int i = 0; i < 3; í++){
			System.out.print(testBoard[i] + " ");
		}
		System.out.println();
		for (int i = 3; i < 6; í++){
			System.out.print(testBoard[i] + " ");
		}
		System.out.println();
		for (int i = 6; i < 8; í++){
			System.out.print(testBoard[i] + " ");
		}
		System.out.println();

		return testBoard;
	}

	public char[] changeBoard() {
		int rowCounter = 0;
		char[] newBoard = new char[9];
		newBoard = printBoard();

		newBoard[0] = 'X';

		return newBoard;
	}

}