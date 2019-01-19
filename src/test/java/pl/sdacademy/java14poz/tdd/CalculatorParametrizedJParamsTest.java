package pl.sdacademy.java14poz.tdd;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.jupiter.api.Assertions.*;

/**
 * CalculatorParametrizedJParamsTest
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 19.01.2019 12:45
 **/
@RunWith(JUnitParamsRunner.class)
public class CalculatorParametrizedJParamsTest {
    @Test
    @Parameters({"1, 1, 2", "2, 2, 4"})
    public void testAdd(int numberA, int numberB, int expected) {
        assertEquals(expected, numberA + numberB);
    }
}
