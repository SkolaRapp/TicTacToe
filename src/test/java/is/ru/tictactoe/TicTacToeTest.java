package is.ru.tictactoe;

import static org.junit.Assert.*;
import org.junit.*;


public class TicTacToeTest {


    @Test
    public void testBoardString() {
    	TicTacToe toe = new TicTacToe();

    	int[] testBoard = new int[9];
    	String testString = "1 2 3 \n4 5 6 \n7 8 9 \n";
    	assertEquals(testString, toe.printBoard(testBoard));
    }
}
