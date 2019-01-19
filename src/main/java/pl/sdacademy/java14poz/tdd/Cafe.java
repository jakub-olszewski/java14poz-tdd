package pl.sdacademy.java14poz.tdd;
/**
 * Cafe
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 18.01.2019 19:49
 **/
public class Cafe {

    boolean isServe;
    int cena;

    public Cafe() {
        this.isServe = false;
        this.cena = 5;
    }

    public void serveCoffee() {
        isServe = true;
    }

    public boolean canServeCoffee() {
        return isServe;
    }
}
