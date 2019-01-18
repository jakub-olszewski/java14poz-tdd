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
        // given
        cafe = new Cafe();
    }

    @Test
    public void shouldServeCoffee() {

        // when
        cafe.serveCoffee();

        // then
        assertTrue(cafe.canServeCoffee());
    }

    @Test
    public void shouldNotServeCoffee() {

        // when
        //cafe.serveCoffee();

        // then
        assertFalse(cafe.canServeCoffee());
    }

}