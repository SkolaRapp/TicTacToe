package is.ru.tictactoe;

import static org.junit.Assert.*;
import org.junit.*;


public class TicTacToeTest {


    @Test
    public void testBoardString() {
    	TicTacToe toe = new TicTacToe();

    	char[] testBoard = new char[9];
    	String testString = "1 2 3 \n4 5 6 \n7 8 9 \n";
    	assertEquals(testString, toe.printBoard(testBoard));
    }

    @Test
    public void changeCharToX() {
    	TicTacToe toe = new TicTacToe();

    	char [] testBoard = new char[9];
    	String testString = "X 2 3 \n4 5 6 \n7 8 9 \n";
    	assertEquals(testString, toe.changeBoard(testBoard));
    }
}
