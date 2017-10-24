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

		//for(int i = 0; i < 9; i++) {
			//int numberAbove = i + 1;
			//char number = (char)(numberAbove + '0');
			//System.out.print(number + " ");
			//newBoard[i] = number;
			//rowCounter++;

			//if(rowCounter % 3 == 0) {
				//System.out.println();
			//}
		//}

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