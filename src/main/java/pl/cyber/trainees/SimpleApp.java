// 1. konstrukcja klas i metod
package pl.cyber.trainees; //okreslenie pakietu w ramach r]projektu, gdzie znajjduje się nasza klasa

//pole package ustawia się automatycznie jeśli nasz plik zawiera się w odpwiedniej strukturze katalogów
// tj. src/main/java.......
//w naszym przykładzie src/main/java/pl.cyber.trainees

//tu jest miejsce na importy
// import java.io.File; //region miejsce na importy import java.io.File;  //importy zazwyczaj dodają się same ewemtualnie można je dodać poprzez Ctrl + Enter 
// poprzez importy powinniśmy rozumieć użycie dodatkowych bibliotek w naszej klasie/
import pl.cyber.trainees.wyjaśnienia.Basics;

import java.math.*;
import java.sql.SQLOutput;
// z * mówimy że chcemy zaimportować wszystkie biblioteki wramach pakietu (package) w tym przypadku java.math
// /endregion

//SimpleApp - nazwa klasy tutaj nazwa może być dowolna, aby była zgodna z dwoma warunkami:
// 1) Nazwa pliku i nazwa klasy musi się równać
// 2) Nazwy klas zawsze piszemy CamelCase'm z zastrzeżeniem że pierwsza litera i każda kolejna nowego wyrazu jest pisana
// z wielkiej litery
//Cały kod w klasie powinien być zapisany w jej ramach które określone są poprzez nawiasy {} poza klasą
// nie może być żadnego kodu, natomiast przed klasą możemy jedynie pisać import'y oraz package.

public class SimpleApp {

// tu musi być cały kod i wszystkie metody. Trzeba pamiętać, żeby zgadzała się liczba nawiasów
    // często trzeba stosować czyszczenie kodu reformat code (chyba comand l? <-- sprawdzić
// w ramach klasy deklarujemy zmienne globalne oraz metody
    public static String SEPARATOR_SPACJA = ""; // zmienna globalna dostępna w całej klasie.
    // konstrukcja zmiennych globalnych
    // modyfikator dostępu
    //słowo kluczowe static - określa, że nasza zmienna jest statyczna
    // TypDanych
    //nazwa zmiennej. Dobrą praktyką jest aby nazwa zmiennej globalnej była pisana wyłącznie z wielkich liter a kolejne słowa
    // oddzielone zostały znakiem '_'
    // następnie przypisanie wartości

    //Deklaracja metod
    // W przypadku metody uruchomieniowej powinna ona występować tylko raz w całym projekcie
    // Konstrukcja metory uruchomieniowej:
    // modyfikator dostępu zawsze jako public
    // słowo kluczowe static
    // typ  metody zawsze void
    // nazwa metody zawsze main
    //parametry wejściowe metody, może ich nie być
    // ale z reguły powinna być to tablica args (tj. String[] args)

    public static void main(String[] args) {
        // UWAGA należy pilnować {} metody, aby aby nie pisać tzw. metody w metodzie
        // w ramach metody uruchomieniowej możemy deklarować zmienne oraz pisać kod,
        // natomiast dobrą praktyką jest, aby

        Basics basics = new Basics();
        basics.wyswietlTekst("Jakiś teks do wyświetlenia");


    }
    // Należy pamiętać, że metody funkcjonalne deklarujemy w taki sposób:
    //nie mają słówka static
    // modyfikator dostępu może być public / private / protected / default
    // typ zwracających informacji, aczkolwiek może metoda nic nie zwracać
    //   //void - jeśli metoda nic nie zwraca   //String/Integer/BigDecimal/Model/........ jeśli chcemy aby nasza metoda zwracała
    // konkretny typ danych i była możliwa bo użycia w innym miejscu np. klasy lub projektu
    // należy pamiętać, aby nazwy metod były pisane camelCasem z zastrzeżenem, że pierwsza litera jest mała

    public String nazwaMetody () {
        return ""; // return zawsze musi się pojawić, jeśli nasza metoda jest inna niż void
    }

    public void wyświetlTekst (String tekst) {
        System.out.println(tekst);
    }

    private Integer kolejnaMetoda () {

        // w tym miejscu możliwe jest deklarowanie zmiennych
        //używanie instrukcji warunkowych
        // używanie pętli
        // używanie innych metod lub odwołanie do metod innych klas poprzez wcześniejszą deklarację
         return 0;

    }
    // w tym miejscu możemy deklarować kolejne metody, ich ilość jest dowolna
    // zalecana wielkość klasy nie powinna przekroczyć 200 linii pliku
}





