package pl.cyber.trainees;


import pl.cyber.trainees.dziedziczenie.Kolor;
import pl.cyber.trainees.dziedziczenie.Model;
import pl.cyber.trainees.serwis.OdczytDanych;
import pl.cyber.trainees.spotkania.Petle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleApp {

    public static void main(String[] args) throws FileNotFoundException {
        OdczytDanych odczytDanych = new OdczytDanych();
        // odczytujemy dane z klawiatury
        System.out.println("Jak masz na imię");
        String firstName = odczytDanych.wprowadzonaWartoscZKlawiatury();
        System.out.println("Witaj " + firstName);

        String firstNameFromFile = odczytDanych.daneZPliku(new File("src/main/resources/dane-zew.txt"));
        Model modelPojazduZPliku = odczytDanych.daneOModeluPojazdu(new File("src/main/resources/modelPojazdu.txt"));

        /*
        Alternatywa w postaci kodu na forach internetowych
        Scanner scan = new Scanner(System.in);

         */


 //       ctr + p - podpowiadanie w użyciu metod/ deklaracji obiektów dostępnych parametrów

        Model modelPojazdu1 = new Model();
        var modelPojazdu2 = new Model("VW", "2020", "przód", "Passay", 10000, 2.0, Kolor.ZIELONY);
        var modelPojazdu3 = new Model("VW", "2000", "przód", "passat", 30000, 2.0,Kolor.NIEBIESKI);

  //    List<Double> listaDouble = new ArrayList<>(Arrays.asList(
   //             1.0,
  //              2.0,
   //             5.0,
  //              10.0,
  //              20.0

  //      ));

  //      listaDouble.add(30.0);

 //       Petle petle = new Petle ();
  //      petle.wyswietlOd1Do100();
  //      petle.dodawanieElementowListy(listaDouble);
  //      petle.wyswietlSet();


        modelPojazdu1.setKolor(Kolor.CZERWONY);
        modelPojazdu1.setPojemnoscSilnika(1.4);
        modelPojazdu1.setMarka("Passat");
        modelPojazdu1.setPrzebieg(10000);
        modelPojazdu1.setNaped("przód");
        modelPojazdu1.setRocznik("2000");
        modelPojazdu1.setNazwa("VW");

        List<String> strings = new ArrayList<String>();
        strings.add("pierwszy");
        strings.add("drugi");
        strings.add("trzeci");
        strings.add("czwarty");

  //      System.out.println(strings);

  //     for (int i = 0; i <strings.size(); i++) {
        System.out.println();
        for(int i = 0; i<=3; i++) {
            var tmp = strings.get(i);
            System.out.println(tmp);
        }

        /*
        Instrukcje warunkowe:
        if - wybór na podstawie warunku typu boolean

        if (condition) {
        // kod
        }

       if (condition) {
       //kod
       } else {
       // inny kod

       }

       // nie preferowane
       if (condition) {
       //kod
       } else if (condition 2) {
       // inny kod
       } else {
       // inny kod 2
       }


        Pętle:
        for / forech

        for(int - = 0; i < 10; i++) {
        // int i = 0 - wartość startowa pętli
        // i < 10 - warunek do kiedy będzie wykonywany
        // i ++ - w jaki sposób będzie zmieniona wartość i.
        // wyjątek
        // i ++ - inkrementacja inaczej zapis i = i + 1
        // i -- -dekrementacja inaczej i = i - 1

        // ++i = ?
        // --i = ?

        //kod do wykoanania
        }

        foreach(String element : strings) { <- zastosowanie do np. List
        // String element - pojedynczy element z strings
        // : oddzielenie elementów od Obiektu Listy
        // strings }
*/
        System.out.println(modelPojazdu1.toString());
        System.out.println(modelPojazdu1);
        System.out.println(modelPojazdu2);

        System.out.println("marka pojazdu: " + modelPojazdu2.getMarka());
        System.out.println(modelPojazdu2.getNaped());
        System.out.println(modelPojazdu2.getNazwa());
        System.out.println(modelPojazdu2.getNazwa());

    }

    // Kolekcje w Java to zbiory danych.
    // 4 rodzaje kolekcj: List - lista, Set - zbiór, Map - mapa, Queue - kolejka;
    /*

    jeden, dwa, trzy, cztery

    List -> jeden, dwa, czy, cztery (co pierwsze wpadnie to na tej pozycji jest, gwarantuje nam kolejność zbioru danych)
    Set -> nie gwarantuje kolejności zbioru (za każdym razem może być inna kolejność)
    np.:
    a) jeden, dwa, czy, cztery
    b) trzy, cztery, dwa, jeden
    Map -> przechowuje wartości jako klucz-wartość
    np.
    jeden <-> 1
    dwa <-> 2
    trzy <-> 3
    cztery <-> 4

    Queue -> jeden, dwa, trzy, cztery,
    - podobne zachowanie do Listy, natomiest możemy zastosować algorymy
    LIFO (Last In First Out) - 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 [nowy rekord] -
    <<<<<- kierunek odczytu danych
    i
    FIFO (First In First Out) - jak kolejka w sklepie przy kasie 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    [nowy zawsze ląduje na koniec]

    Najczęściej stosuje się trzy pierwsze.

    Najpopularniejsze implementcje:
    List:
            ArrayList() - tablica listy, która nie przechowuje informacji o poprzednim i następnym rekordzie.
            LinkedList() - przechowuje info o poprzednim i następnym rekordzie

            String nowyString = "";
            List<Model> [nazwa zmiennej] = new ArrayList<>();  w <> przechowujemy konkretny typ danych
            modele.add(modelPojazdu1);

            List<String> lista = new ArrayList<String>();
            lista.add("pierwszy");    <----- add() to metoda dodająca wartości do listy. Jej parametrem jest obiekt wskazany w <>
            lista.add("drugi");
            System.out.println(lista.get(1));  //wypisze "drugi"

       Set:
            HashSet() - nie gwarantuje kolejnosci
            TreeSet() - gwarantuje

            Set<String> nazwaSet = new HashSet<>();


     */
}





