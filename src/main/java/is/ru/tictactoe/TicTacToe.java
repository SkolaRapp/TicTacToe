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

	public char[] printBoard(char[] board) {

		String boardString = "";
		char[] newBoard = new char[9];
		int rowCounter = 0;

		for(int i = 0; i < 9; i++) {
			char number = (char)(i + '0');
			//System.out.print(number + " ");
			newBoard[i] = number;
			rowCounter++;

			if(rowCounter % 3 == 0) {
				//System.out.println();
			}
		}

		return newBoard;
	}

	public char[] changeBoard(char[] board) {
		int rowCounter = 0;
		char[] newBoard = new char[9];
		newBoard = printBoard(board);

		//System.out.println();
		//System.out.println();
		boardString = printBoard(board);
		myNewBoard[0] = 'X';

		for(int i = 0; i < myNewBoard.length; i++) {
			
		}

		return newBoard;
	}

}