package pl.sdacademy.java14poz.tdd;

import org.hamcrest.junit.ExpectedException;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.jupiter.api.Assertions.*;
import static pl.sdacademy.java14poz.tdd.CalculatorImpl.DIV_ERROR_MESSAGE;

/**
 * CalculatorTest
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 19.01.2019 11:01
 **/
public class CalculatorTest {

    Calculator calc;

    @Before
    public void before() {
        // given
        calc = new CalculatorImpl();
    }

    @Test
    public void pressNumber5Test() {

        //when
        calc.pressNumber(5);

        //then
        String resultDisplay = calc.display();
        String expectedDisplay = "5";
        assertTrue(resultDisplay.equals(expectedDisplay));
    }

    @Test
    public void pressNumber0Test() {

        //when
        calc.pressNumber(0);

        //then
        String resultDisplay = calc.display();
        String expectedDisplay = "0";

        System.out.println("resultDisplay: " + resultDisplay);
        assertTrue(expectedDisplay.equals(resultDisplay));
        assertEquals(resultDisplay, expectedDisplay);
    }

    @Test
    public void shouldDisplayNumber() {
        //when
        calc.pressNumber(0);

        //then
        String resultDisplay = calc.display();
        String expectedDisplay = "0";
        assertTrue(resultDisplay.equals(expectedDisplay));
    }

    @Test
    public void shouldNotDisplayNumber() {
        //when

        //then
        String resultDisplay = calc.display();
        assertTrue(resultDisplay.isEmpty());
    }

    @Test
    public void shouldDisplay7WhenAdd3And4() {

        //when
        calc.add(3, 4);

        //then
        String resultDisplay = calc.display();
        assertEquals("7", resultDisplay);
    }

    @Test
    public void shouldDisplay2WhenSub6And4() {

        //when
        calc.sub(6, 4);

        //then
        String resultDisplay = calc.display();
        assertEquals("2", resultDisplay);
    }

    @Test
    public void shouldDisplay2WhenSub8And4() {

        //when
        calc.sub(8, 4);

        //then
        String resultDisplay = calc.display();
        assertEquals("4", resultDisplay);
    }


    @Test
    public void shouldAddSuccessedExecute() {
        // 5 przykladow dodawania
        calc.add(8, 4);
        assertEquals("12", calc.display());
        calc.clear();

        calc.add(6, 1);
        assertEquals("7", calc.display());
        calc.clear();

        calc.add(2, 4);
        assertEquals("6", calc.display());
        calc.clear();

        calc.add(6, 4);
        assertEquals("10", calc.display());
        calc.clear();

        calc.add(8, 2);
        assertEquals("10", calc.display());

    }

    //test ogólny czy występuje wyjątek
    @Test(expected = IllegalArgumentException.class)
    public void shouldHaveExceptionWhenDevideByZero() {
        calc.div(100, 0);
    }

    @Test
    public void shouldHaveExceptionWhenDevideByZeroAssert() {

        try {
            calc.div(100, 0);
        } catch (Exception e) {
            assertTrue(e instanceof IllegalArgumentException);
            assertTrue(e.getMessage().equals(DIV_ERROR_MESSAGE));
        }

    }

    // testowanie wyjątku przez użycie reguły
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldHaveExceptionWhenDevideByZeroRule() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage(DIV_ERROR_MESSAGE);
        calc.div(100, 0);
    }

    @Test
    public void shouldHaveExceptionWhenPressNumberHaveNull(){
        calc.pressNumber(null);
    }
}