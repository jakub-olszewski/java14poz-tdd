package pl.sdacademy.java14poz.tdd.mockowanie;

import org.junit.Before;
import org.junit.Test;
import org.mockito.*;
import pl.sdacademy.java14poz.tdd.Calculator;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * MockitoAnnotationCaptorTest
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 20.01.2019 12:19
 **/
public class MockitoAnnotationCaptorTest {

    @Before
    public void before(){
        // inicjalizacja atrap wykorzystanych w tej klasie (this)
        MockitoAnnotations.initMocks(this);
    }

    @Mock
    List mockedListObject;

    @Captor
    ArgumentCaptor argumentCaptor;

    @Test
    public void whenUseCaptorAnnotationInject(){
        mockedListObject.add("one");

        // konfiguracja przechwytywacza
        Mockito.verify(mockedListObject).add(argumentCaptor.capture());

        assertEquals("one",argumentCaptor.getValue());
    }

    @Test
    public void whenUseCaptorAnnotation(){
        // inicjalizacja mock List
        List mockList = mock(List.class);

        // powołanie przechwytywacza
        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);

        mockList.add("two");

        //przechwycić
        verify(mockList).add(argumentCaptor.capture());

        //pobrać i sprawdzic wartosc
        assertEquals("two",argumentCaptor.getValue());

    }

    /**
     * Zadanie: Mockito Captor Calculator test
     */
    @Test
    public void calculatorPressNumberCaptorTest(){
        // inicjalizacja mock calculator
        Calculator calc = mock(Calculator.class);

        // powołanie przechwytywacza
        ArgumentCaptor<Integer> argumentCaptor = ArgumentCaptor.forClass(Integer.class);

        // wykonanie metody pressNumber(2)
        calc.pressNumber(2);

        // przechwycenie powyższego argumentu
        verify(calc).pressNumber(argumentCaptor.capture());

        // asercja czy pobrany argument jest równy 2
        assertEquals(2,argumentCaptor.getValue());

    }

}


