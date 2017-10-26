package is.ru.tictactoe;

public class TicTacToe {
	
	//private char[] board;
	private char[] newBoard = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
	
	//constructor
	public TicTacToe() {
		//board = new char[9];
		

		//fill the board
		//for(int i = 0; i < board.length; i++) {
			//board[i] = '$';
		//}
	}

	//because newboard is private
	public char[] getBoard() {
		return newBoard;
	}

	public static void main(String[] args) {
		
	}

	public char[] getInput(String input) {
		//check the input - is it int between 1 and 9
		if(Integer.parseInt(input) < 1 || Integer.parseInt(input) > 9) {
			//TODO ERROR
		}

		//check if the spot is taken - return an error message?

		//if not, put in the X
		newBoard[input - 1] = 'X';

		return newBoard;
	}

	public char[] computersTurn() {

	} 

/*	public void justForPrinting(char[] testBoard){
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
*/
/*	public char[] printBoard() {

		char[] testBoard = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
		int rowCounter = 0;

		//justForPrinting(testBoard);
		return testBoard;
	}
*/
/*	public char[] changeBoard() {
		int rowCounter = 0;
		char[] newBoard = printBoard();

		justForPrinting(newBoard);
		
		newBoard[0] = 'X';
		System.out.println();
		System.out.println();
		System.out.println("User makes his first move");
		justForPrinting(newBoard);

		newBoard[1] = 'O';
		System.out.println();
		System.out.println();
		System.out.println("Next the computer makes his move");
		justForPrinting(newBoard);

		newBoard[4] = 'X';
		System.out.println();
		System.out.println();
		System.out.println("User makes his move");
		justForPrinting(newBoard);

		newBoard[2] = 'O';
		System.out.println();
		System.out.println();
		System.out.println("Computer makes his move");
		justForPrinting(newBoard);

		newBoard[8] = 'X';
		System.out.println();
		System.out.println();
		System.out.println("User makes his move");
		justForPrinting(newBoard);
		System.out.println();
		System.out.print("Woo hoo, the user won");

		return newBoard;
	}
*/
}