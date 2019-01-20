package pl.sdacademy.java14poz.tdd.mockowanie;

import com.sun.xml.internal.ws.api.ha.StickyFeature;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * MockitoAnnotationInjectMocksTest
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 20.01.2019 12:49
 **/
public class MockitoAnnotationInjectMocksTest {


    @Before
    public void before(){
        // inicjalizacja atrap wykorzystanych w tej klasie (this)
        MockitoAnnotations.initMocks(this);
    }

    /**
     * Dane słownika zamokowane
     */
    @Mock
    Map<String,String> wordMap;

    /**
     * słownik który ma wstrzyknięte słowa z wordMap
     */
    @InjectMocks
    MyDictionary dic = new MyDictionary();
    
    @Test
    public void whenUseInjectMocksAnnotation(){
        // mokowanie słów do słownika
        Mockito.when(wordMap.get("Help")).thenReturn("Pomocy");
        Mockito.when(wordMap.get("Programmer")).thenReturn("Programista");

        assertEquals("Pomocy",dic.getTranslation("Help"));
        assertEquals("Programista",dic.getTranslation("Programmer"));
    }

    /**
     * Klasa używająca mapę słów jako tłumaczenia
     */
    public class MyDictionary {

        Map<String,String> wordMap;

        public MyDictionary(Map<String, String> wordMap) {
            this.wordMap = wordMap;
        }

        public MyDictionary() {
            wordMap = new HashMap<>();
        }

        /**
         * Pobieranie słowa z mapy słow
         * @param word slowo którego szukamy
         * @return tłuczenie z mapy słów
         */
        public String getTranslation(String word) {
            return wordMap.get(word);
        }
    }
}
