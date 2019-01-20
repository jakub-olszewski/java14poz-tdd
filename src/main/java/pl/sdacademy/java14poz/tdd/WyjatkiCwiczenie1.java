package pl.sdacademy.java14poz.tdd;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * WyjatkiCwiczenie1
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 19.01.2019 15:52
 **/
public class WyjatkiCwiczenie1 {

    public static void main(String[] args) {

        Date data = pobierzDate(1, 6, 2018);
        System.out.println("Data1: " + data);

        Date data2, data3 = null;
        try {
            data2 = pobierzDate(-100, 6, 2018);
            System.out.println("Data2: " + data2);

            data3 = pobierzDate(100, -1, 20180);
            System.out.println("Data3: " + data3);

            data3 = pobierzDate(0, 0, 0);
            System.out.println("Data3: " + data3);
        }
        catch (Exception e) {
            System.out.println("Wyjątek :( szczegoly: "+e.getMessage());
            System.out.println(e.getCause());
        }

        System.out.println("Nic sie nie stało wyjątek obsłużony :)");
    }

    public static Date pobierzDate(int dzien, int miesiac, int rok) {
        // sprawdzenie wartosci argumentow w przypadku nie poprawnego argumentu
        // zrzucany throw jest wyjatek
        if (dzien < 0) {
            throw new IllegalArgumentException("Dzien musi byc >= 0: " + dzien);
        }
        if (miesiac < 0) {
            throw new IllegalArgumentException("Miesiac musi byc >= 0: " + miesiac);
        }
        if (rok < 0) {
            throw new IllegalArgumentException("Rok musi byc >= 0: " + rok);
        }

        // przekształcenie napisu na date
        String napisData = dzien + "/" + miesiac + "/" + rok;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date dataPrzeksztalconaZNapisu = null;
        try {
            dataPrzeksztalconaZNapisu = dateFormat.parse(napisData);
        }
        catch (ParseException e) {
            System.err.println("Nie prawidłowy format daty!");
        }

        return dataPrzeksztalconaZNapisu;
    }
}