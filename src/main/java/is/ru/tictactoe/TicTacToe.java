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

	public void justForPrinting(char[] testBoard){
		for (int i = 0; i < 3; i++){
			System.out.print(testBoard[i] + " ");
		}
		System.out.println();
		for (int i = 3; i < 6; i++){
			System.out.print(testBoard[i] + " ");
		}
		System.out.println();
		for (int i = 6; i < 9; i++){
			System.out.print(testBoard[i] + " ");
		}
	}

	public char[] printBoard() {

		char[] testBoard = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
		int rowCounter = 0;

		justForPrinting(testBoard);
		return testBoard;
	}

	public char[] changeBoard() {
		int rowCounter = 0;
		char[] newBoard = printBoard();

		newBoard[0] = 'X';

		System.out.println();
		System.out.println();
		System.out.println("First character becomes X");
		justForPrinting(newBoard);

		return newBoard;
	}

}