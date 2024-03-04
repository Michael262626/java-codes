package TicTacToeGame;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    static Cell[][] board = new Cell[3][3];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeBoard();
        printBoard();
        playGame();
    }

    private static void initializeBoard() {
        for (int count = 0; count < 3; count++) {
            for (int counter = 0; counter < 3; counter++) {
                board[count][counter] = Cell.EMPTY;
            }
        }
    }

    private static void printBoard() {
        System.out.println("-------------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------------");
        }
    }

    private static void playGame() {
        boolean gameOver = false;
        Cell firstPlayer = Cell.X;
        while (!gameOver) {
                System.out.println("Player " + firstPlayer + "'s turn.");
                System.out.print("Enter a position (1-9): ");
                int position = scanner.nextInt();
                if (isValidMove(position)) {
                    int row = (position - 1) / 3;
                    int col = (position - 1) % 3;
                    board[row][col] = firstPlayer;
                    printBoard();
                    if (checkWinner(firstPlayer)) {
                        System.out.println("Player " + firstPlayer + " wins!");
                        gameOver = true;
                    } else if (isBoardFull()) {
                        System.out.println("It's a draw!");
                        gameOver = true;
                    } else {
                        firstPlayer = (firstPlayer == Cell.X) ? Cell.O : Cell.X;
                    }
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            }


    }

    private static boolean isValidMove(int position) {
        int row = (position - 1) / 3;
        int col = (position - 1) % 3;
        return position >= 1 && position <= 9 && board[row][col] == Cell.EMPTY;
    }

    private static boolean checkWinner(Cell player) {
        for (int count = 0; count < 3; count++) {
            if (board[count][0] == player && board[count][1] == player && board[count][2] == player) return true;
            if (board[0][count] == player && board[1][count] == player && board[2][count] == player) return true;
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) return true;
        return board[0][2] == player && board[1][1] == player && board[2][0] == player;
    }

    static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == Cell.EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}





