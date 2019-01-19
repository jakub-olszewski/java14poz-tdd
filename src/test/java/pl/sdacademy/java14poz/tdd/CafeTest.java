package pl.sdacademy.java14poz.tdd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test kawiarni podstawowy test z wykorzystaniem prostych asercji
 */
public class CafeTest {

    Cafe cafe;

    @Before
    public void before(){

    }

    @Test
    public void shouldServeCoffee() {

        // given
        cafe = new Cafe();

        // when
        cafe.serveCoffee();

        // then
        assertTrue(cafe.canServeCoffee());
    }

    @Test
    public void shouldNotServeCoffee() {

        // given
        cafe = new Cafe();

        // when
        //cafe.serveCoffee();

        // then
        assertFalse(cafe.canServeCoffee());
    }

}