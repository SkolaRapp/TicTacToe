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

	public String printBoard(char[] board) {

		String boardString = "";
		int rowCounter = 0;

		for(int i = 1; i <= 9; i++) {
			char number = (char)(i + '0');
			System.out.print(number + " ");
			boardString += (number + " ");
			rowCounter++;

			if(rowCounter % 3 == 0) {
				System.out.println();
				boardString += Character.toString('\n');
			}
		}

		return boardString;
	}

	public String changeBoard(char[] board) {
		String boardString = "";
		int rowCounter = 0;

		System.out.println();
		System.out.println();
		boardString = printBoard(board);
		char[] myNewBoard = boardString.toCharArray();
		myNewBoard[0] = 'X';

		for(int i = 1; i <= 9; i++) {
			System.out.print(myNewBoard[0] + " ");
			rowCounter++;
			if(rowCounter % 3 == 0) {
				System.out.println();
			}
		}

		boardString = String.valueOf(myNewBoard);

		return boardString;
	}

}