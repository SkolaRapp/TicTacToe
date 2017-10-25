package is.ru.tictactoe;

import static org.junit.Assert.*;
import org.junit.*;


public class TicTacToeTest {


    @Test
    public void testBoardString() {
    	TicTacToe toe = new TicTacToe();
    	
    	char[] testBoard = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
    	String str = String.valueOf(testBoard);
    	char[] newBoard = toe.printBoard();
    	String newString =  String.valueOf(newBoard);

    	assertEquals(str, newString);
    }

    @Test
    public void changeCharToX() {
    	TicTacToe toe = new TicTacToe();

    	char[] testBoard = {'X', 'O', 'O', '4', 'X', '6', '7', '8', 'X'};
    	String str = String.valueOf(testBoard);
    	char[] newBoard = toe.changeBoard();
    	String newString =  String.valueOf(newBoard);

    	assertEquals(str, newString);
   	}
}
