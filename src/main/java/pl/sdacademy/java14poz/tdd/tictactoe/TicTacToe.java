package pl.sdacademy.java14poz.tdd.tictactoe;

/**
 * TicTacToe
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 20.01.2019 09:18
 **/
public interface TicTacToe {
    boolean isWin(char o);

    void playMove(int move) throws Exception;

    void createNewBoard();

    boolean hasBoard();

    boolean isLegalMove(int fieldNumber);
}