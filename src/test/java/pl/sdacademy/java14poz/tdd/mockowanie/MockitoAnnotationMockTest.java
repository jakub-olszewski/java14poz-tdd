package pl.sdacademy.java14poz.tdd.mockowanie;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * MockitoAnnotationMockTest
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 20.01.2019 11:17
 **/
public class MockitoAnnotationMockTest {

    /**
     * Atrapa pola listy
     */
    @Mock
    List<String> mockedList;

    @Before
    public void before(){
        // inicjalizacja atrap wykorzystanych w tej klasie (this)
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void whenUseMockAnnotationMockInject(){
        mockedList.add("one");
        verify(mockedList).add("one");
        assertEquals(0,mockedList.size());

        // atrapa zachowania na metode size()
        // zamokowanie metody size()
        Mockito.when(mockedList.size()).thenReturn(2018);
        assertEquals(2018,mockedList.size());
    }

    @Test
    public void whenUseMockAnnotationOnlyInTest(){
        //stworzyc atrape widoczna tylko w tym tescie
        // zdefiniowanie atrapy ArrayList
        List onlyHereMockList = Mockito.mock(ArrayList.class);

        onlyHereMockList.add("one");
        verify(onlyHereMockList).add("one");
        assertEquals(0,onlyHereMockList.size());
    }

    @Test
    public void addThreeTimesElementToList(){
        mockedList.add("one");
        mockedList.add("two");
        mockedList.add("three");

        //weryfikacja czy dodaliśmy 3 napisy
        verify(mockedList, times(3)).add(anyString());
        //weryfikacja czy "one" zostało dodane tylko raz
        verify(mockedList, times(1)).add("one");
    }

    /**
     * Zadanie: Utworz test wykorzystujac atrape calculatora
     */
    @Test
    public void calculatorMockitoTest(){
        // zdefiniowanie atrapy Calculator

        // atrapa calculatora wyswietala 2019
        // zamokowanie metody display()

        // wywolujemy i wyswietlamy sout display

        // weryfikacja czy metoda display()
        // wykonana została tylko raz - użycie times(int number)

        // weryfikacja czy metoda pressNumber(null)
        // nigdy nie została wykonana - użycie never()
    }

}
