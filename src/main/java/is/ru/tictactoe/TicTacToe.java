package is.ru.tictactoe;

public class TicTacToe {
	
	private int[] board;

	//constructor
	public TicTacToe() {
		board = new int[9];

		//fill the board
		for(int i = 0; i < board.length; i++) {
			board[i] = i + 1;
		}
	}

	public static void main(String[] args){
		
	}

	public String printBoard(int[] board) {

		String boardString = "";
		int rowCounter = 0;

		for(int i = 1; i <= 9; i++) {
			System.out.print(i + " ");
			boardString += (i + " ");
			rowCounter++;

			if(rowCounter % 3 == 0) {
				System.out.println();
				boardString += Character.toString('\n');
			}
		}

		return boardString;
	}

}