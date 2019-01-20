package pl.sdacademy.java14poz.tdd.tictactoe;

import java.util.Scanner;

/**
 * TicTacToeRun
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 20.01.2019 14:19
 **/
public class TicTacToeRun {

    //psvm
    public static void main(String[] args) throws Exception {
        TicTacToe game = new TicTacToeImpl();
        game.createNewBoard();
        Scanner scanner = new Scanner(System.in);
        while(!(game.isWin('o')||game.isWin('x'))) {
            System.out.println("\nWprowadź numer pola: \n");
            String fieldNumber = scanner.nextLine();
            if (fieldNumber.isEmpty()) {
                System.out.println("Proszę wprowadź numer pola");
            }
            game.playMove(Integer.valueOf(fieldNumber));
        }
    }
}
