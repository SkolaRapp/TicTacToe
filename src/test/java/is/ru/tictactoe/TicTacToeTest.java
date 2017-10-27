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
    public void testIsNotDigit() {
    	TicTacToe tik = new TicTacToe();

    	String a = "a";
    	assertFalse(tik.isDigit(a));
    }

    @Test
    public void testAnotherNotValidInput() {
    	TicTacToe too = new TicTacToe();

    	String eleven = "11";
    	assertFalse(too.isValidInput(eleven));
    }

    @Test
    public void testNotValidInput() {
    	TicTacToe too = new TicTacToe();

    	String negativeNum = "-7";
    	assertFalse(too.isValidInput(negativeNum));
    }

    @Test
    public void testAnotherNotValidInput3() {
    	TicTacToe too = new TicTacToe();

    	String ten = "10";
    	assertFalse(too.isValidInput(ten));
    }

    @Test
    public void testAnotherNotValidInput4() {
    	TicTacToe too = new TicTacToe();

    	String zero = "0";
    	assertFalse(too.isValidInput(zero));
    }

    @Test
    public void testValidInput4() {
    	TicTacToe too = new TicTacToe();

    	String one = "1";
    	assertTrue(too.isValidInput(one));
    }

    @Test
    public void testValidInput5() {
    	TicTacToe too = new TicTacToe();

    	String nine = "9";
    	assertTrue(too.isValidInput(nine));
    }

    @Test
    public void testUpdateBoard() {
        TicTacToe tic = new TicTacToe();

        char[] expectedArray = {'1', '2', '3', '4', '5', '6', 'X', '8', '9'};
        tic.updateBoard(7, 'X');

        assertArrayEquals(expectedArray, tic.getBoard());
    }

    @Test
    public void testIsTaken() {
        TicTacToe tic = new TicTacToe();

        tic.updateBoard(5, 'O');

        assertTrue(tic.isTaken(5));
    }

    @Test
    public void testComputersTurn() {
        TicTacToe tic = new TicTacToe();

        tic.updateBoard(2, 'X');

        assertTrue(tic.computersTurnHelper());
    }

    @Test
    public void testComputersTurn2() {
        TicTacToe tic = new TicTacToe();

        tic.updateBoard(1, 'X');
        tic.updateBoard(2, 'O');
        tic.updateBoard(3, 'X');
        tic.updateBoard(4, 'O');
        tic.updateBoard(5, 'O');
        tic.updateBoard(6, 'X');
        tic.updateBoard(7, 'X');
        tic.updateBoard(8, 'X');
        tic.updateBoard(9, 'O');

        assertFalse(tic.computersTurnHelper());
    }

    @Test
    public void testDraw() {
    	TicTacToe drawTest = new TicTacToe();

    	drawTest.updateBoard(1, 'X');
        drawTest.updateBoard(2, 'O');
        drawTest.updateBoard(3, 'X');
        drawTest.updateBoard(4, 'O');
        drawTest.updateBoard(5, 'O');
        drawTest.updateBoard(6, 'X');
        drawTest.updateBoard(7, 'X');
        drawTest.updateBoard(8, 'X');
        drawTest.updateBoard(9, 'O');

        assertTrue(drawTest.isDraw());
    }

    @Test
    public void testVerticalWinner() {
    	TicTacToe verticalTest = new TicTacToe();

    	verticalTest.updateBoard(1, 'X');
        verticalTest.updateBoard(2, 'O');
        verticalTest.updateBoard(3, '3');
        verticalTest.updateBoard(4, 'X');
        verticalTest.updateBoard(5, 'O');
        verticalTest.updateBoard(6, '6');
        verticalTest.updateBoard(7, 'X');
        verticalTest.updateBoard(8, 'X');
        verticalTest.updateBoard(9, 'O');

        // X O 3
        // X O 6
    	// X X O

        assertTrue(verticalTest.isWinner(verticalTest.getBoard()));
    }

    @Test
    public void testVerticalWinner2() {
    	TicTacToe verticalTest = new TicTacToe();

    	verticalTest.updateBoard(1, 'O');
        verticalTest.updateBoard(2, 'X');
        verticalTest.updateBoard(3, '3');
        verticalTest.updateBoard(4, 'O');
        verticalTest.updateBoard(5, 'X');
        verticalTest.updateBoard(6, 'O');
        verticalTest.updateBoard(7, 'X');
        verticalTest.updateBoard(8, 'X');
        verticalTest.updateBoard(9, 'O');

        // O X 3
        // O X O
    	// X X O

        assertTrue(verticalTest.isWinner(verticalTest.getBoard()));
    }

    @Test
    public void testHorizontalWinner() {
    	TicTacToe horTest = new TicTacToe();

    	horTest.updateBoard(1, 'X');
        horTest.updateBoard(2, 'O');
        horTest.updateBoard(3, '3');
        horTest.updateBoard(4, 'X');
        horTest.updateBoard(5, 'X');
        horTest.updateBoard(6, 'X');
        horTest.updateBoard(7, 'X');
        horTest.updateBoard(8, '7');
        horTest.updateBoard(9, 'O');

        // 1 O 3
        // X X X
    	// 7 8 O

        assertTrue(horTest.isWinner(horTest.getBoard()));
    }

    @Test
    public void testDiogonalWinner1() {
    	TicTacToe diogTest = new TicTacToe();

    	diogTest.updateBoard(1, 'X');
        diogTest.updateBoard(2, 'O');
        diogTest.updateBoard(3, 'O');
        diogTest.updateBoard(4, '4');
        diogTest.updateBoard(5, 'X');
        diogTest.updateBoard(6, '6');
        diogTest.updateBoard(7, '7');
        diogTest.updateBoard(8, '8');
        diogTest.updateBoard(9, 'X');

        // X O O
        // 4 X 6
    	// 7 8 X

        assertTrue(diogTest.isWinner(diogTest.getBoard()));
    }

    @Test
    public void testDiogonalWinner2() {
    	TicTacToe diogTest = new TicTacToe();

    	diogTest.updateBoard(1, 'O');
        diogTest.updateBoard(2, '2');
        diogTest.updateBoard(3, 'X');
        diogTest.updateBoard(4, '4');
        diogTest.updateBoard(5, 'X');
        diogTest.updateBoard(6, '6');
        diogTest.updateBoard(7, 'X');
        diogTest.updateBoard(8, 'O');
        diogTest.updateBoard(9, '9');

        // O 2 X
        // 4 X 6
    	// X O 9

        assertTrue(diogTest.isWinner(diogTest.getBoard()));
    }

    @Test
    public void checkIfXisTheWinner() {
    	TicTacToe whosTheWinner = new TicTacToe();

		whosTheWinner.updateBoard(1, 'O');
        whosTheWinner.updateBoard(2, '2');
        whosTheWinner.updateBoard(3, 'X');
        whosTheWinner.updateBoard(4, '4');
        whosTheWinner.updateBoard(5, 'X');
        whosTheWinner.updateBoard(6, '6');
        whosTheWinner.updateBoard(7, 'X');
        whosTheWinner.updateBoard(8, 'O');
        whosTheWinner.updateBoard(9, '9');   
        try {
	        assertEquals('X', whosTheWinner.getWinner());        	
        }
        catch(AssertionError e) {
        	fail("Error winner is: " + whosTheWinner.getWinner());
        }
 	
    }
}
