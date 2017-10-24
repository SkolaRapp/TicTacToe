package is.ru.tictactoe;

import static org.junit.Assert.*;
import org.junit.*;


public class TicTacToeTest {


    @Test
    public void testBoardString() {
    	TicTacToe toe = new TicTacToe();

    	char[] testBoard = new char[9];
    	String testString = "$ $ $ \n$ $ $ \n$ $ $ \n";
    	assertEquals(testString, toe.printBoard(testBoard));
    }
}
