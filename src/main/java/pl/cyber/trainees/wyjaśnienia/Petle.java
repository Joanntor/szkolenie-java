package pl.cyber.trainees.wyjaśnienia;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Petle {
    /*
    Pętla for i foreach

    Budowa for
    int i = 0 - inicjalizacja parametru początkowego do "przechodzenia po pętli"
    i< 5 - warunek spełnienia kolejnego przejścia
    i++ - inkrementacja wartości początkowej o 1
    for (int i = 0; i <5; i++) {
    // kod wykonania
    // np. println, dodawania, dodawanie usuwanie do listy elementy
    }

    JAK NIE STOOWAĆ FORA:
    for (int = 0; i<5; i++); {
    println(i)
    <--tzw pętla nieskończona, będzie drukować wszystkie liczby mniejsze od 5 nawet minusowe, więc nigdy się nie
    skończy (błędny jest średnik po nawiasie okrągłym
    }

    BUDOWA FOREACH
    for(TypDanych elementListy : lista) {
    }

    UWAGA!!!
    USuWANIE ELEMENTÓW Z LISTY
    do rozwiązania usuwania elementów z listy stosuje się wyłącznie for
    for(int i = 0; i<5; i++) {
    lista.get(i)
    }

    List<>
    remove(); metoda do usuwania rekordów (jest do tego osobna metoda, więc powszechniejsze jest użycie tej metody


     */
    public void uruchom() {
        List<BigDecimal> lista = new ArrayList<>();
        lista.add(BigDecimal.valueOf(10.0));
        lista.add(BigDecimal.valueOf(2.0));
        lista.add(BigDecimal.valueOf(5.6));
        lista.add(BigDecimal.valueOf(21.8));
        lista.add(BigDecimal.valueOf(2.1));
        lista.add(BigDecimal.valueOf(41.0));
        lista.add(BigDecimal.valueOf(14.0));
        lista.add(BigDecimal.valueOf(1.0));
        lista.add(BigDecimal.valueOf(4.0));

        rozwiazanieZadania1(lista);
        choinkaProsta();
        choinkaRozbudowana(7);
        wyswietlanieLiczb();


    }
//  Zadanie nr 1
//  Wykonać metodę która przyjmie jako parametr List<BigDecimal>, następnie wykona następujące zagadnienia:
//  a) wyświetli każdy element listy jeden po drugim
//  b) każdy element listy doda do siebie.Petle.java

    private void rozwiazanieZadania1(List<BigDecimal> list) {
        BigDecimal sumaLiczb = BigDecimal.ZERO;

        for (BigDecimal liczba : list) {
            System.out.println(liczba);
            sumaLiczb = sumaLiczb.add(liczba);
        }
        System.out.println("Suma liczb: " + sumaLiczb);


    }

    // Zadanie choinka
    // klasyczne fory (a dokładnie 2 fory)
    // metoda będzie przyjmwać parametr jako wysokość

    private void choinkaProsta() {
        System.out.println("  *");
        System.out.println(" ***");
        System.out.println("*****");

    }

    private void choinkaRozbudowana(Integer wysokoscChoinki) {
        Integer iloscGwiazdekWPodstawie = wysokoscChoinki + 2;
        for (int wysokosc = 0; wysokosc < wysokoscChoinki; wysokosc++) {
            for (int szerokosc = 0; szerokosc < wysokoscChoinki * 2; szerokosc++) {
                if (szerokosc < (wysokoscChoinki - wysokosc) || szerokosc > (wysokoscChoinki + wysokosc)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    private void choinkaRozbudowana4(Integer wysokoscChoinki) {


        /*   int <-> Integer
                   double <-> Double   BigInteger, BigDecimal   long <-> Long    etc.    */
        for (int wysokosc = 0; wysokosc < wysokoscChoinki; wysokosc++) {
            for (int szerokosc = 0; szerokosc < wysokoscChoinki * 2; szerokosc++) {
                if (szerokosc < (wysokoscChoinki - wysokosc) || szerokosc > (wysokoscChoinki + wysokosc)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    private void choinkaRozbudowana2(Integer wysokoscChoinki) {
        Integer maksymalnaLiczbaGwiazdek = (wysokoscChoinki * 2) - 1;
        System.out.println("Liczba gwiazdek w podstawie: " + maksymalnaLiczbaGwiazdek);
        System.out.println();
        for (int x = 1; x <= maksymalnaLiczbaGwiazdek; x += 2) {  //x = x + 2 ///  x++
            Integer spacje = (maksymalnaLiczbaGwiazdek - x) / 2;
            for (int y = 0; y < spacje + x; y++) {
                if (y < spacje) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();

        }

    }

    //    Zadanie
//  Utworzyć metodę, która przejdzie (będzie iterować) po liczbach od 1 do 100
//  Natomiast wyświetli tylko te które są podzielne przez 5 i dodać je do siebie
    private void wyswietlanieLiczb() {
        Integer sumaLiczb = 0;

        for (int i = 0;
             i <= 100;
             i++) {
            if (i % 5 == 0) {
                sumaLiczb = sumaLiczb + i; // to samo co sumaLiczb+=i
                System.out.println("Liczby podzielne przez 5: " + i);
            }

        }

        System.out.println(sumaLiczb);
    }
}


