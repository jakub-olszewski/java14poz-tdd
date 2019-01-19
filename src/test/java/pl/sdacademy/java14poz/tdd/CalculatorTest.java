package pl.sdacademy.java14poz.tdd;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * CalculatorTest
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 19.01.2019 11:01
 **/
public class CalculatorTest {

    Calculator calc ;

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

        System.out.println("resultDisplay: "+resultDisplay);
        assertTrue(expectedDisplay.equals(resultDisplay));
        assertEquals(resultDisplay,expectedDisplay);
    }

    @Test
    public void shouldDisplayNumber(){
        //when
        calc.pressNumber(0);

        //then
        String resultDisplay = calc.display();
        String expectedDisplay = "0";
        assertTrue(resultDisplay.equals(expectedDisplay));
    }

    @Test
    public void shouldNotDisplayNumber(){
        //when

        //then
        String resultDisplay = calc.display();
        assertTrue(resultDisplay.isEmpty());
    }

    @Test
    public void shouldDisplay7WhenAdd3And4(){

        //when
        calc.add(3,4);

        //then
        String resultDisplay = calc.display();
        assertEquals("7",resultDisplay);
    }

    @Test
    public void shouldDisplay2WhenSub6And4(){

        //when
        calc.sub(6,4);

        //then
        String resultDisplay = calc.display();
        assertEquals("2",resultDisplay);
    }
}
