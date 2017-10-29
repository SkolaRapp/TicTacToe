package is.ru.tictactoe;
import java.util.Random;

public class TicTacToe {
	
	private char[] newBoard;
	private int count;
	private char winner;
	
	//constructor
	public TicTacToe() {
		newBoard = new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9'};
		count = 0;
		winner = 'b';
	}

	//because newBoard is private
	public char[] getBoard() {
		return newBoard;
	}

	public char getWinner() {
		return winner;
	}

	public int getCount() {
		return count;
	}

	public static void main(String[] args) {
		
	}

	//get the placement the user wants to put her 'X' into
	public char[] getInput(String input) {
		if(!isDigit(input)) {
			return newBoard;
		}
		if(!isValidInput(input)) {
			return newBoard;
		}

		int inputNum = Integer.parseInt(input);
		if(!isTaken(inputNum)) {
			//if not, put in the 'X'
			updateBoard(inputNum, 'X');
		}

		return newBoard;
	}

	//if user wants to play again we reset the variables
	public void newGame() {
		newBoard = new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9'};
		count = 0;
		winner = 'b';
	}

	public char[] computersTurn() {
		computersTurnHelper();
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
		isThereAWinner(makeStringFromCharArray(newBoard));		
		count++;
	}

	public boolean isThereAWinner(String strBoard) {
		char[] board = strBoard.toCharArray();
		if (checkIfBoardIsFull() == false) {
			return true;
		}

		return (winnerInTheHouse(board) == 'X' || winnerInTheHouse(board) == 'O');
	}

	//calls isWinnerX and isWinnerO
	public char winnerInTheHouse(char[] board) {
		if(isWinnerX(board) == true) {
			return 'X';
		}
		else if(isWinnerO(board) == true) {
			return 'O';
		}
		else {
			return 'd';
		} 
	}

	//check if user is the winner
	public boolean isWinnerX(char[] board) {
		
		//check for vertical winner
		if(board[0] == 'X' && board[3] == 'X' && board[6] == 'X') {
			winner = 'X';
			return true;
		}

		if(board[1] == 'X' && board[4] == 'X' && board[7] == 'X') {
			winner = 'X';
			return true;
		}

		if(board[2] == 'X' && board[5] == 'X' && board[8] == 'X') {
			winner = 'X';
			return true;
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
		if(board[0] == 'O' && board[3] == 'O' && board[6] == 'O') {
			winner = 'O';
			return true;
		}

		if(board[1] == 'O' && board[4] == 'O' && board[7] == 'O') {
			winner = 'O';
			return true;
		}

		if(board[2] == 'O' && board[5] == 'O' && board[8] == 'O') {
			winner = 'O';
			return true;
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

	public char[] printBoard() {

		char[] testBoard = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
		int rowCounter = 0;

		//justForPrinting(testBoard);
		return testBoard;
	}

	public boolean checkIfInputHasBeenGiven(char character, int number, char[] array) {
		if (array[number - 1] == 'X' || array[number - 1] == 'O') {
			return true;
		}
		
		return false;
	}

	public String updateString(String numberFromForm) {
		char character = numberFromForm.charAt(0);
		char[] array = getBoard();
		int number = Character.getNumericValue(character);
		boolean usedOrNot = checkIfInputHasBeenGiven(character, number, array);
		if (usedOrNot == true) {
			String sameString = String.copyValueOf(array);
			return sameString;
		}
		array[number - 1] = 'X';
		String newString = makeStringFromCharArray(array);
		
		return newString;
	}

	public String makeStringFromCharArray(char[] array) {
		String returnString = String.copyValueOf(array);

		return returnString;
	}

	public boolean checkIfNoChangeWasMade(String numberFromForm) {
		char character = numberFromForm.charAt(0);
		char[] array = getBoard();
		int number = Character.getNumericValue(character);
		if (array[number - 1] == 'X' || array[number - 1] == 'O') {
			return true;
		}

		return false;
	}

	public boolean checkIfBoardIsFull() {
		char[] array = getBoard();
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 'X' && array[i] != 'O') {
				return true;
			}
		}

		return false;
	}

	public String returnNewString(String numberFromForm) {
        String newString = "";
        newString = updateString(numberFromForm);

        return newString;
    }

    public String returnComputerMove(String numberFromForm, String newString, boolean checkIfMoveIsValid) {
        String computerMove = "";
        if(checkIfMoveIsValid == false) {
            if (checkIfBoardIsFull() == true) {
                char[] array = computersTurn();
                computerMove = makeStringFromCharArray(array);
            }
        }
        else {
            computerMove = newString;
        }

        return computerMove;
    }

    public void setBoardForTestingFunctions(String board) {
    	char[] temp = board.toCharArray();
    	newBoard = temp;
    }

    public char getResult(boolean isTheGameOver, String computerMove) {
        char[] board = computerMove.toCharArray();
        if (isTheGameOver == true) {
            return winnerInTheHouse(board);
        }
        return '/'; 
    }

    public String returnTheStringAfterComputerMove(String numberFromForm, String newString, boolean checkIfMoveIsValid, boolean isTheGameOver) {
    	String computerMove = "";
    	if (isTheGameOver == false) {
            computerMove = returnComputerMove(numberFromForm, newString, checkIfMoveIsValid);
        }
        else{
            computerMove = newString;
        }

        return computerMove;
    }
}