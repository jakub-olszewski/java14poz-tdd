package pl.sdacademy.java14poz.tdd;

/**
 * Calculator
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 19.01.2019 10:55
 **/
public interface Calculator {

    /**
     * Metoda wpisujaca znak na kalulatorze
     * @param number na kalkulatorze
     */
    public void pressNumber(Object number);

    /**
     * Wyświetl zawartość kalkulatora
     * @return zawartość wyswietlacza kalkulatora
     */
    public String display();

    /**
     * Metoda dodaje numberA do numberB
     * @param numberA pierwsza liczba
     * @param numberB druga liczba
     */
    public void add(int numberA, int numberB);

    /**
     * Metoda odejmuje numberA od numberB
     * @param numberA pierwsza liczba
     * @param numberB druga liczba
     */
    public void sub(int numberA, int numberB);

    /**
     * Metoda dzieli numberA przez numberB
     * @param numberA pierwsza liczba
     * @param numberB druga liczba
     * @throws IllegalArgumentException podczas dzielenia przez zero
     */
    public void div(int numberA, int numberB) throws IllegalArgumentException;


    /**
     * Zerowanie wyswietlacza
     */
    void clear();

    /**
     * Metoda mnoży numberA przez numberB
     * @param numberA pierwsza liczba
     * @param numberB druga liczba
     */
    void multi(int numberA, int numberB);


    /**
     * Dodawanie
     */
    //public void add();

    /**
     * Odejmowanie
     */
    //public void sub();

    /**
     * Dzielenie
     */
    //public void div();

    /**
     * Mnożenie
     */
    //public void multi();

}
