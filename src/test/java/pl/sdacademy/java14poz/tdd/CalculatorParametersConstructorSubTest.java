package pl.sdacademy.java14poz.tdd;

import org.assertj.core.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * CalculatorParametersConstructorTest
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 19.01.2019 12:52
 **/
@RunWith(value = Parameterized.class)
public class CalculatorParametersConstructorSubTest {

    int numberA;
    int numberB;
    String expectedResult;

    public CalculatorParametersConstructorSubTest(int numberA, int numberB, String expectedResult) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.expectedResult = expectedResult;
    }

    //statyczna metoda z danymi do testów

    @Parameterized.Parameters(name = "Test [index]:  {0} - {1} = {2}")
    public static Collection<Object> data(){
        return Arrays.asList(new Object[][]{{1,2,"-1"},{2,3,"-1"},{7,3,"4"},{20,3,"17"},{10,3,"7"}});
    }

    @Test
    public void shouldAddSuccessedExcecuteTest(){

        //given
        Calculator calc = new CalculatorImpl();

        //when
        calc.sub(numberA,numberB);

        //then
        String resultDisplay = calc.display();
        assertEquals(expectedResult, resultDisplay);
    }
}
