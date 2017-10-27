package is.ru.tictactoe;
import java.util.Random;

public class TicTacToe {
	
	private char[] newBoard;
	private int count;
	private char winner;
	private int countMoves;
	
	//constructor
	public TicTacToe() {
		newBoard = new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9'};
		count = 0;
		winner = 'b';
		countMoves = 0;
	}

	//because newBoard is private
	public char[] getBoard() {
		return newBoard;
	}

	public char getWinner() {
		return winner;
	}

	public static void main(String[] args) {
		
	}

	//get the placement the user wants to put her 'X' into
	public char[] getInput(String input) {
		if(!isDigit(input)) {
			//TODO: error message if not a digit
			return newBoard;
		}
		if(!isValidInput(input)) {
			//TODO: error message if not a valid input
			return newBoard;
		}

		int inputNum = Integer.parseInt(input);
		if(!isTaken(inputNum)) {
			//if not, put in the 'X'
			updateBoard(inputNum, 'X');
		}

		//check for winner

		return newBoard;
	}

	//if user wants to play again we reset the variables
	public void newGame() {
		newBoard = new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9'};
		count = 0;
		winner = 'b';
		countMoves = 0;
	}

	public char[] computersTurn() {
		computersTurnHelper();
		//check winner
		if(isThereAWinner(newBoard)) {
			//TODO: quit game
		}
		return newBoard;
	}

	//computer inputs 'O' into a random empty place on the board
	public boolean computersTurnHelper() {
		//Randomize - if spot isTaken, randomize again
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

	//check to see if the number inputted is between 1-9
	public boolean isValidInput(String input) {
		int num = Integer.parseInt(input);
		if(num < 10 && num > 0) {
			return true;
		}
		return false;
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
		//TODO: change method name here:
		if(isWinnerX(newBoard)) {
			//
		}
		count++;
	}

	public boolean isThereAWinner(char[] board) {
		return (winnerInTheHouse(board) == 'X' || winnerInTheHouse(board) == 'O');
	}

	//calls isWinnerX and isWinnerO
	public char winnerInTheHouse(char[] board) {
		if(isWinnerX(board)) {
			return 'X';
		}
		else if(isWinnerO(board)) {
			return 'O';
		}
		else {
			return 'b';
		} 
	}

	//check if user is the winner
	public boolean isWinnerX(char[] board) {
		
		//check for vertical winner
		for(int i = 0; i < 9; i++) {
			if(board[i % 3] == 'X') {
				winner = 'X';
				return true;
			}
		}
		//check for horizontal winners
		if(board[0] == 'X' && board[1] == 'X' && board[2] == 'X') {
			winner = 'X';
			return true;
		}
		if(board[3] == 'X' && board[4] == 'X' && board[5] == 'X') {
			winner = 'X';
			return true;
		}
		if(board[6] == 'X' && board[7] == 'X' && board[8] == 'X') {
			winner = 'X';
			return true;
		}
		//check for diogonal winners
		if(board[0] == 'X' && board[4] == 'X' && board[8] == 'X') {
			winner = 'X';			
			return true;
		}
		if(board[2] == 'X' && board[4] == 'X' && board[6] == 'X') {
			winner = 'X';
			return true;
		}

		return false;
	}

	//check if the computer is the winner
	public boolean isWinnerO(char[] board) {
		
		//check for vertical winner
		for(int i = 0; i < 9; i++) {
			if(board[i % 3] == 'O') {
				winner = 'O';
				return true;
			}
		}
		//check for horizontal winners
		if(board[0] == 'O' && board[1] == 'O' && board[2] == 'O') {
			winner = 'O';
			return true;
		}
		if(board[3] == 'O' && board[4] == 'O' && board[5] == 'O') {
			winner = 'O';
			return true;
		}
		if(board[6] == 'O' && board[7] == 'O' && board[8] == 'O') {
			winner = 'O';
			return true;
		}
		//check for diogonal winners
		if(board[0] == 'O' && board[4] == 'O' && board[8] == 'O') {
			winner = 'O';			
			return true;
		}
		if(board[2] == 'O' && board[4] == 'O' && board[6] == 'O') {
			winner = 'O';
			return true;
		}

		return false;
	}

	//if all the spots are taken there is a draw
	public boolean isDraw() {
		return (count == 9);
	}

	//method to turn a character array to a string
	public String charToString(char[] charray) {
		String stringFromCharArray = new String(charray);
		return stringFromCharArray;
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

	public boolean checkIfInputHasBeenGiven(char character, int number, char[] array){
		if (array[number - 1] == 'X' || array[number - 1] == 'O'){
			return true;
		}
		return false;
	}



	public String updateString(String str) {
		char character = str.charAt(0);
		char[] array = getBoard();
		int number = Character.getNumericValue(character);
		boolean usedOrNot = checkIfInputHasBeenGiven(character, number, array);
		if (usedOrNot == true){
			String sameString = String.copyValueOf(array);
			return sameString;
		}
		if (countMoves % 2 == 0){
			array[number - 1] = 'X';
			countMoves++;
		}
		else {
			array[number - 1] = 'O';
			countMoves++;
		}
		String newString = String.copyValueOf(array);
		return newString;
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