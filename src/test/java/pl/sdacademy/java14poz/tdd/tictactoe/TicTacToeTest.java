package pl.sdacademy.java14poz.tdd.tictactoe;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * TicTacToeTest
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 20.01.2019 09:15
 **/
public class TicTacToeTest {

    TicTacToe game;


    @Before
    public void before(){
        // inicjalizacja atrap wykorzystanych w tej klasie (this)
        // MockitoAnnotations.initMocks(this);

        game = new TicTacToeImpl();
        //given
        //game = mock(TicTacToe.class);

    }

    /**
     * Test sprawdzający, czy da się utworzyć nową plansze
     */
    @Test
    public void canCreateNewBoard(){
        //given
        assertThat(game.hasBoard()).isEqualTo(false).describedAs("Game must have no board in game");

        //when
        game.createNewBoard();

        //then
        assertThat(game.hasBoard()).isEqualTo(true).describedAs("Game must have board in game after create new board");

    }

    /**
     * Test sprawdzający, czy nowa plansza zawiera puste wartości
     */
    @Test
    public void haveEmptyValuesInNewBoard(){

        for(int i = 0 ; i < 10; i++){
            boolean isLegalMoveResult = game.isLegalMove(i);
            assertTrue(isLegalMoveResult, "In field "+i+" move is not legal !");
        }
    }


}