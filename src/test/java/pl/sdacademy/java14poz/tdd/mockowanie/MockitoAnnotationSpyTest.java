package pl.sdacademy.java14poz.tdd.mockowanie;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * MockitoAnnotationSpyTest
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 20.01.2019 12:03
 **/
public class MockitoAnnotationSpyTest {

    @Spy
    public List<String> spyList = new ArrayList<String>();

    @Before
    public void before(){
        // inicjalizacja atrap wykorzystanych w tej klasie (this)
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void whenUseSpyAnnotationInjected(){
        spyList.add("one");
        spyList.add("two");

        Assertions.assertEquals(2, spyList.size());

        Mockito.when(spyList.size()).thenReturn(2018);
        //Mockito.doReturn(2018).when(spyList).size();
        assertEquals(2018,spyList.size());

    }

    @Test
    public void whenUseSpyAnnotation(){
        List<String> spyListOnlyHere = Mockito.spy(new ArrayList<String>());
        spyListOnlyHere.add("one");
        spyListOnlyHere.add("two");

        Assertions.assertEquals(2, spyListOnlyHere.size());

    }


}
