package pl.sdacademy.java14poz.tdd.matchers;

import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.atIndex;
import static org.junit.jupiter.api.Assertions.*;

/**
 * PersonMatcherTest
 *
 * @author: Jakub Olszewski [http://github.com/jakub-olszewski]
 * @date: 19.01.2019 19:56
 **/
public class PersonMatcherTest {

    @Spy
    List<Person> personsList = new ArrayList<Person>();

    List<Person> harryFriends = new ArrayList<Person>();
    private Person harry;
    private Person hermiona;
    private Person ron;
    private Person zgredek;
    private Person lordVoldemort;
    private Person dumbledore;
    private List<Person> bestMagicians;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        harry = new Person("Harry Potter", 14);
        personsList.add(harry);
        hermiona = new Person("Hermiona", 14);
        personsList.add(hermiona);
        personsList.add(new Person("Severus", 34));
        personsList.add(new Person("Malfoy", 13));
        zgredek = new Person("Zgredek", 232);
        personsList.add(zgredek);
        ron = new Person("Ron", 15);
        lordVoldemort  =  new Person("Lord Voldemort",1000);
        dumbledore = new Person("Albus Dumbledore", 9000);
        personsList.add(ron);

        harryFriends.add(hermiona);
        harryFriends.add(ron);

        bestMagicians = new ArrayList<>();
        bestMagicians.add(lordVoldemort);
        bestMagicians.add(dumbledore);
        bestMagicians.add(harry);

    }

    //sprawdz czy lista osob i przyjaciol nie jest pusta ( uzyj : isNotNull isEmpty)
    @Test
    public void listNotEmptyTest() {

        // JUnit style

        // AssertJ
        //assertThat(...)...
        zaimplementuj();
    }

    //sprawdz czy przyjaciele harrego maja mniej niz 16 lat ( uzyj : isLessThan )
    @Test
    public void harryFriendsLess16yearsOldTest(){
        zaimplementuj();
    }

    //sprawdz czy zgredek ma wiecej niz 100 lat ( uzyj : isGreaterThan )
    @Test
    public void zgredekHaveMoreThan100yearsTest(){
        zaimplementuj();
    }

    //sprawdz czy zgredek istnieje tylko raz na liscie ( uzyj : containsOnlyOnce )
    @Test
    public void zgredekExistOnlyOnceTest(){
        zaimplementuj();
    }

    //sprawdz czy harry jest pierwszy na liscie ( uzyj : atIndex )
    @Test
    public void harryIsFirstOnList(){
        zaimplementuj();
    }

    //sprawdz czy ron jest ostatni na liscie ( uzyj : atIndex )
    @Test
    public void ronIsLastPersonOnListTest(){
        zaimplementuj();
    }

    //sprawdz czy ron jest harryego przyjacielem ( uzyj : contains isIn )
    @Test
    public void ronIsHarryFriendAndPersonList(){
        zaimplementuj();
    }

    //sprawdz czy ron i hermiona wystepuja tylko raz na liscie przyjaciol harrego ( uzyj : containsOnlyOnce )
    @Test
    public void ronAndHermoinaAreHarryFriendsOnlyOnceTest(){
        zaimplementuj();
    }

    // dodatkowe
    // sprawdz czy osoby z personsList są posortowane po wieku użyj - isSortedAccordingTo() oraz AgeComparator
    @Test
    public void listIsSortedByAge(){
        zaimplementuj();
    }

    public class AgeComparator implements Comparator<Person> {
        @Override
        public int compare(Person person1, Person person2) {
            // int vs Integer
            Integer age1 = person1.getAge();
            return age1.compareTo(person2.getAge());
        }
    }

    // dodatkowe
    // sprawdz kiedy Harry ma urodziny
    // ( uzyj : SimpleDateFormat parse isBeforeYear isAfterYear isBetween )
    @Test
    public void checkHarryBirthDayTest() throws ParseException {
        zaimplementuj();
    }

    //sprawdz czy harry ma faktycznie na imie harry (uzyj isEqual, starts, ends)
    @Test
    public void harryNameTest(){
        zaimplementuj();
    }

    //sprawdz czy lista przyjaciol harrego faktycznie zawiera jego przyjaciol i ile ich faktycznie
    // jest (uzyj hasSize, contains, doesNotContain)
    @Test
    public void harryFriendsTest(){
        zaimplementuj();
    }

    //dodatkowo
    // wlasny PersonAssert
    @Test
    public void hermionaNoBirthdayTest() throws ParseException {
        zaimplementuj();
    }

    //dodatkowo
    // uzyj SimpleDateFormat PersonAssert hasNoBirthDay
    @Test
    public void harryNoBirthdayTest() throws ParseException {
        zaimplementuj();
    }


    //sprawdz czy Lord Voltemort jest najlepszym czarodziejem - bestMagicians

    //sprawdz czy Harry jest najmlodszym najlepszym czarodziejem - bestMagicians

    //sprawdz czy najlepszy czarodziej jest tylko jeden

    //sprawdz czy lista najlepszych czarodzieji

    private void zaimplementuj(){
        fail("Zadanie do wykonania (po wykonaniu usuń tą linię )");
    }
}

