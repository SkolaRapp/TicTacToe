package is.ru.tictactoe;

public class TicTacToe {
	
	private char[] board;

	//constructor
	public TicTacToe() {
		board = new char[9];

		//fill the board
		for(int i = 0; i < board.length; i++) {
			board[i] = '$';
		}
	}

	public static void main(String[] args){
		
	}

	public String printBoard(char[] board) {

		String boardString = "";
		int rowCounter = 0;

		for(int i = 1; i <= 9; i++) {
			char number = char(i);
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

}