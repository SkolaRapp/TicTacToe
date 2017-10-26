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
		if(!isDigit(input)) {
			return newBoard;
		}

		int moron = Integer.parseInt(input);

		if(!isTaken(moron)) {
			//if not, put in the X
			updateBoard(moron);
		}

		return newBoard;
	}

	public void computersTurn() {

	}

	//check to see if input is a number, something else
	public boolean isDigit(String input) {
		try{
			int num = Integer.parseInt(input);
			return true;
		}
		catch(NumberFormatException e){
			return false;
		}
	}

	public boolean isTaken(int idjit) {
		//check if the spot is taken
		if(newBoard[idjit - 1] == 'X' || newBoard[idjit - 1] == 'O') {
			return true;
		}
		else {
			return false;
		}
	}

	public void updateBoard(int input) {
		//TODO FOR O TOO
		newBoard[input - 1] = 'X';
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
	public char[] printBoard() {

		char[] testBoard = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
		int rowCounter = 0;

		//justForPrinting(testBoard);
		return testBoard;
	}

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