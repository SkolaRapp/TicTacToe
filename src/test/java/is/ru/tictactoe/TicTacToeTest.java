package is.ru.tictactoe;

import static org.junit.Assert.*;
import org.junit.*;


public class TicTacToeTest {


    @Test
    public void testBoardString() {
    	TicTacToe toe = new TicTacToe();

    	char[] testBoard = new String("123456789").toCharArray();
    	assertEquals(testBoard, toe.printBoard(testBoard));
    }

    @Test
    public void changeCharToX() {
    	TicTacToe toe = new TicTacToe();

    	char [] testBoard = new String("X23456789").toCharArray();
    	assertEquals(testBoard, toe.changeBoard(testBoard));
    }
}
