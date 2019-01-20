package pl.sdacademy.java14poz.tdd;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * CalculatorParametrizedJParamsTest
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 19.01.2019 12:45
 **/
@RunWith(JUnitParamsRunner.class)
public class CalculatorParametrizedJUnitParamsCSVTest {

    @Test
    @FileParameters("src/test/resources/CalculatorParameterCSVFileAddTest.csv")
    public void testAdd(int numberA, int numberB, String expected) {

        //given
        Calculator calc = new CalculatorImpl();

        //when
        calc.add(numberA,numberB);

        //then
        String message = String.format("Error %d + %d != %s becouse is equal %d",
                numberA,numberB,calc.display(),numberA+numberB);
        assertEquals(expected, calc.display(),message);
    }

    @Test
    @FileParameters("src/test/resources/CalculatorParameterCSVFileMultiTest.csv")
    public void testMulti(int numberA, int numberB, String expected) {

        //given
        Calculator calc = new CalculatorImpl();

        //when
        calc.multi(numberA,numberB);

        //then
        String message = String.format("Error %d * %d != %s becouse is equal %d",
                numberA,numberB,calc.display(),numberA*numberB);
        assertEquals(expected, calc.display(),message);
    }

    @Test
    @FileParameters("src/test/resources/CalculatorParameterCSVFileDivTest.csv")
    public void testDiv(int numberA, int numberB, String expected) {

        //given
        Calculator calc = new CalculatorImpl();

        //when
        calc.div(numberA,numberB);

        //then
        String message = String.format("Error %d / %d != %s becouse is equal %d",
                numberA,numberB,calc.display(),numberA/numberB);
        assertEquals(expected, calc.display(),message);
    }
}
