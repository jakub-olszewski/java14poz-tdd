package pl.sdacademy.java14poz.tdd.tictactoe;

import java.util.Random;
import java.util.Scanner;

/**
 * TicTacToe
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 19.01.2019 14:54
 **/
public class TicTacToeImpl implements TicTacToe {

    final static char HUMAN = 'x';
    final static char COMPUTER = 'o';
    private char[][] board = new char[3][3];
    private boolean isBoard;

    public TicTacToeImpl() {
        isBoard = false;
        //drawBoard();
    }

    private void playMove(int fieldNumber, char playerChar) throws Exception {
        int currentFieldNumber = 1;

        mainLoop:
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                if (currentFieldNumber == fieldNumber) {
                    if (Character.isLetter(board[x][y])) {
                        throw new Exception("Nieprawidłowy ruch");
                    }
                    board[x][y] = playerChar;
                    if (isWin(HUMAN) || isWin(COMPUTER)) {
                        System.out.println("wygrałeś");
                    }
                    break mainLoop;
                }
                currentFieldNumber++;
            }
        }
    }
    @Override
    public void playMove(int fieldNumber) throws Exception {
        playMove(fieldNumber, HUMAN);
        playComputer();
    }

    @Override
    public void createNewBoard() {
        drawBoard();
        isBoard = true;
    }

    @Override
    public boolean hasBoard() {
        return isBoard;
    }

    private void playComputer() throws Exception {
        Random random = new Random();
        int move = random.nextInt(9)+1;

        while (!isLegalMove(move)) {
            move = random.nextInt(9)+1;
        }

        playMove(move, COMPUTER);
        drawBoard();
    }

    public boolean isLegalMove(int fieldNumber) {
        int currentFieldNumber = 1;

        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                if (currentFieldNumber == fieldNumber) {
                    if (Character.isLetter(board[x][y])) {
                        return false;
                    }

                    return true;
                }
                currentFieldNumber++;
            }
        }

        return true;
    }

    public boolean isWin(char play) {

        for (int x = 0; x < board.length; x++) {
            int winCounterHorizontal = 0;
            int winCounterVertical = 0;
            for (int y = 0; y < board[x].length; y++) {
                if (board[x][y] == play) {
                    winCounterHorizontal++;
                }
                if (board[y][x] == play) {
                    winCounterVertical++;
                }
            }

            if (winCounterHorizontal == 3 || winCounterVertical == 3) {
                return true;
            }
        }

        return false;
    }



    private void drawBoard()
    {
        int fieldNumber = 1;
        for (int x = 0; x < board.length; x++) {
            for (int y = 0; y < board[x].length; y++) {
                if (Character.isLetter(board[x][y])) {
                    System.out.print(board[x][y]);
                } else {
                    System.out.print(fieldNumber);
                }
                fieldNumber++;
            }
            System.out.println();
        }
    }
}