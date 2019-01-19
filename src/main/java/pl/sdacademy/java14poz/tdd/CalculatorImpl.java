package pl.sdacademy.java14poz.tdd;

/**
 * CalculatorImpl
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 19.01.2019 11:32
 **/
public class CalculatorImpl implements Calculator {

    //stan wyświetlacza
    String display;

    @Override
    public void pressNumber(int number) {
        // dopisuje do stanu wyświetlacza
        StringBuilder builder = new StringBuilder();
        display = builder.append(display).append(number).toString();
    }

    //konstruktor inicjalizuje stan wyswietalacza - pusty
    public CalculatorImpl() {
        display = "";
    }

    @Override
    public String display() {
        // zwróć stan wyświetlacza
        return display;
    }

    @Override
    public void add(int numberA, int numberB) {
         int result = numberA+numberB;
         pressNumber(result);
    }

    @Override
    public void sub(int numberA, int numberB) {
        pressNumber(numberA-numberB);
    }
}
