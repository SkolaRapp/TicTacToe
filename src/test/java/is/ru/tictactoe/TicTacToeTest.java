package is.ru.tictactoe;

import static org.junit.Assert.*;
import org.junit.*;


public class TicTacToeTest {


    @Test
    public void testBoardString() {
    	TicTacToe toe = new TicTacToe();

    	char[] testBoard = new char[9];
    	testBoard = ['1', '2', '3', '4', '5', '6', '7', '8', '9'];
    	assertEquals(testBoard, toe.printBoard(testBoard));
    }

    @Test
    public void changeCharToX() {
    	TicTacToe toe = new TicTacToe();

    	char [] testBoard = new char[9];
    	testBoard = ['1', '2', '3', '4', '5', '6', '7', '8', '9'];
    	assertEquals(testBoard, toe.changeBoard(testBoard));
    }
}
