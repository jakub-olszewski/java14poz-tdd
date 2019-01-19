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
public class CalculatorParametersFieldsTest {

    @Parameterized.Parameter(value = 0)
    public int numberA;

    @Parameterized.Parameter(value = 1)
    public int numberB;

    @Parameterized.Parameter(value = 2)
    public String expectedResult;

    @Parameterized.Parameters(name = "Test [index]:  {0} + {1} = {2}")
    public static Collection<Object> data() {
        return Arrays.asList(new Object[][]{{1, 2, "3"}, {2, 3, "5"}, {7, 3, "10"}});
    }

    @Test
    public void shouldAddSuccessedExcecuteTest() {

        //given
        Calculator calc = new CalculatorImpl();

        //when
        calc.add(numberA, numberB);

        //then
        String resultDisplay = calc.display();
        assertEquals(expectedResult, resultDisplay);
    }
}
