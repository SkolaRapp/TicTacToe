package is.ru.tictactoe;
import java.util.Random;

public class TicTacToe {
	
	private char[] newBoard;
	private int count;
	
	//constructor
	public TicTacToe() {
		newBoard = new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9'};
		count = 0;
	}

	//because newBoard is private
	public char[] getBoard() {
		return newBoard;
	}

	public static void main(String[] args) {
		
	}

	//get the placement the user wants to put her 'X' into
	public char[] getInput(String input) {
		//TODO: check the input - is it int between 1 and 9
		if(!isDigit(input)) {
			//TODO: error message if not a digit
			return newBoard;
		}

		int inputNum = Integer.parseInt(input);

		if(!isTaken(inputNum)) {
			//if not, put in the 'X'
			updateBoard(inputNum, 'X');
		}

		return newBoard;
	}

	public char[] computersTurn() {
		computersTurnHelper();

		return newBoard;
	}

	//computer inputs 'O' into a random empty place on the board
	public boolean computersTurnHelper() {
		//Randomiza - if spot isTaken, randomize again
		Random rand = new Random();
		int randNum = rand.nextInt(9) + 1;

		if(count == 9) {
			return false;
		}

		while(isTaken(randNum)) {
			randNum = rand.nextInt(9) + 1;
		}

		updateBoard(randNum, 'O');

		return true;
	}

	//check to see if input is a number, and not something strange
	public boolean isDigit(String input) {
		try {
			int num = Integer.parseInt(input);
			return true;
		}
		catch(NumberFormatException e) {
			return false;
		}
	}

	//check if the spot is taken
	public boolean isTaken(int place) {
		if(newBoard[place - 1] == 'X' || newBoard[place - 1] == 'O') {
			return true;
		}
		else {
			return false;
		}
	}

	//input character 'X' or 'O' into the board array
	public void updateBoard(int input, char placement) {
		newBoard[input - 1] = placement;
		count++;
	}

	//WINNER - mod 3, sama lina med sama signali, tha winner, 
		//checka ser a horna linum, bera stokin saman med AND
	public boolean isWinner(char[] board) {
		
		//check for vertical winner
		for(int i = 0; i < 9; i++) {
			if(board[i % 3] == 'X') {
				return true;
			}
		}
		//check for horizontal winners
		if(board[0] == 'X' && board[1] == 'X' && board[2] == 'X') {
			return true;
		}
		if(board[3] == 'X' && board[4] == 'X' && board[5] == 'X') {
			return true;
		}
		if(board[6] == 'X' && board[7] == 'X' && board[8] == 'X') {
			return true;
		}
		//check for diogonal winner
		if(board[0] == 'X' && board[4] == 'X' && board[8] == 'X') {
			return true;
		}
		if(board[2] == 'X' && board[4] == 'X' && board[6] == 'X') {
			return true;
		}
		
		return false;
	}

	//if all the spots are taken there is a draw
	//TODO: must we also check if there is no possible winner with spots left??
	public boolean isDraw() {
		return (count == 9);
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