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

/*    @Test
    public void changeCharToX() {
    	TicTacToe toe = new TicTacToe();

    	char[] testBoard = {'X', 'O', 'O', '4', 'X', '6', '7', '8', 'X'};
    	String str = String.valueOf(testBoard);
    	char[] newBoard = toe.changeBoard();
    	String newString =  String.valueOf(newBoard);

    	assertEquals(str, newString);
   	}
*/
   	//to test that the initial board string is as expected
   	@Test
   	public void testBoard() {
   		TicTacToe tic = new TicTacToe();
   		
   		char[] expectedArray = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
   		String expected = String.valueOf(expectedArray);
    	char[] boardTest = tic.getBoard();
    	String returned =  String.valueOf(boardTest);

    	assertEquals(expected, returned);
   	}

    @Test
    public void testIsDigit() {
        TicTacToe tic = new TicTacToe();

        String ten = "10";
        assertTrue(tic.isDigit(ten));
    }

    @Test
    public void testUpdateBoard() {
        TicTacToe tic = new TicTacToe();

        char[] expectedArray = {'1', '2', '3', '4', '5', '6', 'X', '8', '9'};

        assertArrayEquals(expectedArray, tic.updateBoard(7));
    }

    @Test
    public void testIsTaken() {
        TicTacToe tic = new TicTacToe();

        tic.updateBoard(5);

        assertTrue(tic.isTaken(5));
    }
}
