package pl.sdacademy.java14poz.tdd.mockowanie;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

/**
 * ExampleWithoutMockito
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 20.01.2019 11:22
 **/
public class ExampleWithoutMockito {

    List<String> mockedList;

    @Before
    public void before(){
        mockedList = new ArrayList<>();
    }

    @Test
    public void whenUseMockAnnotationMockInject(){
        mockedList.add("one");
        assertEquals(1,mockedList.size());
    }
}
