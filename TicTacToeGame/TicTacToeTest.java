package TicTacToeGame;

import org.junit.jupiter.api.Test;

import static TicTacToeGame.TicTacToe.board;
import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    @Test
    void isBoardFull() {
        for(int count = 0; count < 3; count++){
            for(int counter = 0; counter < 3; counter++){
                if(board[count][counter] == Cell.X);
                if(board[count][counter] == Cell.O);
                assertTrue(TicTacToe.isBoardFull());
            }
        }
    }
    @Test
    void isValidMove(){
        TicTacToe.initializeBoard();
        assertTrue(TicTacToe.isValidMove(1));
        assertTrue(TicTacToe.isValidMove(5));
        assertTrue(TicTacToe.isValidMove(9));
        assertFalse(TicTacToe.isValidMove(0));
        assertFalse(TicTacToe.isValidMove(10));
        TicTacToe.board[0][0] = Cell.X;
        assertFalse(TicTacToe.isValidMove(1));
    }
    @Test
    void checkWinner() {
        TicTacToe.initializeBoard();
        assertFalse(TicTacToe.checkWinner(Cell.X));
        assertFalse(TicTacToe.checkWinner(Cell.O));
        TicTacToe.board[0][0] = Cell.X;
        TicTacToe.board[0][1] = Cell.X;
        TicTacToe.board[0][2] = Cell.X;
        assertTrue(TicTacToe.checkWinner(Cell.X));
        assertFalse(TicTacToe.checkWinner(Cell.O));
    }
    @Test
    void checkWinner2() {
        TicTacToe.initializeBoard();
        TicTacToe.board[1][0] = Cell.O;
        TicTacToe.board[1][1] = Cell.O;
        TicTacToe.board[1][2] = Cell.O;
        assertTrue(TicTacToe.checkWinner(Cell.O));
        assertFalse(TicTacToe.checkWinner(Cell.X));
        }
    @Test
    void checkWinner3() {
        TicTacToe.initializeBoard();
        TicTacToe.board[0][0] = Cell.X;
        TicTacToe.board[1][1] = Cell.X;
        TicTacToe.board[2][2] = Cell.X;
        assertTrue(TicTacToe.checkWinner(Cell.X));
        assertFalse(TicTacToe.checkWinner(Cell.O));
    }
    @Test
    void checkWinner4(){
        TicTacToe.initializeBoard();
        TicTacToe.board[2][0] = Cell.O;
        TicTacToe.board[1][1] = Cell.O;
        TicTacToe.board[0][2] = Cell.O;
        assertFalse(TicTacToe.checkWinner(Cell.X));
        assertTrue(TicTacToe.checkWinner(Cell.O));
    }
    @Test
    void checkWinner5(){
        TicTacToe.initializeBoard();
        TicTacToe.board[0][2] = Cell.X;
        TicTacToe.board[1][2] = Cell.X;
        TicTacToe.board[2][2] = Cell.X;
        assertTrue(TicTacToe.checkWinner(Cell.X));
        assertFalse(TicTacToe.checkWinner(Cell.O));
    }
    @Test
    void checkWinner6(){
        TicTacToe.initializeBoard();
        TicTacToe.board[0][1] = Cell.O;
        TicTacToe.board[1][1] = Cell.O;
        TicTacToe.board[2][1] = Cell.O;
        assertFalse(TicTacToe.checkWinner(Cell.X));
        assertTrue(TicTacToe.checkWinner(Cell.O));
    }
    @Test
    void checkWinner7(){
        TicTacToe.initializeBoard();
        TicTacToe.board[2][0] = Cell.X;
        TicTacToe.board[2][1] = Cell.X;
        TicTacToe.board[2][2] = Cell.X;
        assertTrue(TicTacToe.checkWinner(Cell.X));
        assertFalse(TicTacToe.checkWinner(Cell.O));
    }
    @Test
    void checkWinner8(){
        TicTacToe.initializeBoard();
        TicTacToe.board[2][0] = Cell.O;
        TicTacToe.board[1][1] = Cell.O;
        TicTacToe.board[0][2] = Cell.O;
        assertTrue(TicTacToe.checkWinner(Cell.O));
        assertFalse(TicTacToe.checkWinner(Cell.X));
    }
    @Test
    void checkDraw(){
        TicTacToe.initializeBoard();
        TicTacToe.board[0][0] = Cell.X;
        TicTacToe.board[0][1] = Cell.O;
        TicTacToe.board[1][0] = Cell.X;
        TicTacToe.board[2][0] = Cell.O;
        TicTacToe.board[1][1] = Cell.X;
        TicTacToe.board[2][2] = Cell.O;
        TicTacToe.board[2][1] = Cell.X;
        TicTacToe.board[0][2] = Cell.O;
        TicTacToe.board[1][2] = Cell.X;
        assertFalse(TicTacToe.checkWinner(Cell.O));
    }

}