package pl.cyber.trainees.wyjaśnienia;
// Rodzaje objektów w java:
//DTO -> Data Transfer Object  - jest wysyłany do innych aplikacji, np do weba, przesylaja informacje
//POJO - plain old java object - reprezentuje obiekty bez adnotacji, np @Getter
// Encja - obiejt DTO, który mam za zadanie reprezentować strukturę tabeli bazy danych @Coluumn
// ValueObject - obiekt z jednym parametrem oraz (posiadają tylko metodę getter bez metody setter), który waliduje poprawną strukturę, tzn. czy parametr nie jest NULL
// i czy posiada wartość.

// /*Inaczej mówiąc objekt Javowy, którego zadaniem jest przenoszenie specyficznych danych.
// Najczęstsze wykorzystanie:
// 1) komunikacja klient - server. Innymi słowy Frontend(WEB) - Backend, Aplikacja Moblie - Backend.
// 2) komunikacja baza danych - Backend */
/*
Cechy szczególne obiektów:
1) pola (parametry) opisujące konkretny objekt, np. Samochód, pola samochodu np. marka, kolor, przebieg etc.
2) posiadają konstruktor do prawidłowego utworzenia obiektu danej klasy
3) posiada konkretne metody odwołujące się do utworzonego objektu (metody typu Getter, Setter, toString etc.)
4) może posiadać wewnętrznie swój konwerter (opcjonalnie), np. do konwersji obiektu DTO bazy danych (Encji) na objekt do reprezentacji
    dla aplikacji Frontendowej
 */

import pl.cyber.trainees.wyjaśnienia.Wyjatki.UncheckedException;

import java.util.ArrayList;
import java.util.List;

public class TalkDTO {   // obiekt

    private final String tematRozmowy;
    public String opis;  // bez modyfikatora private i ustawienia zmiennej jako final możemy dopuścić sytuację,
                          //  w której nieświadomie damy możliwość wartości parametru klasy
    private List<String> przyklady;   // parametry

    public String getTematRozmowy() {
        return tematRozmowy;


    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public List<String> getPrzyklady() {
        return przyklady;
    }

    public void setPrzyklady(List<String> przyklady) {
        this.przyklady = przyklady;
    }

    public TalkDTO(String tematRozmowy, String opis, List<String> przyklady) {
        this.tematRozmowy = tematRozmowy;
        this.opis = opis;
        this.przyklady = przyklady;
    }
    public void modifyList(List<String > wiecejPrzykladow) {
        this.przyklady.addAll(wiecejPrzykladow);
    }
}


/*

    public TalkDTO(                        // konstruktor
            final String tematRozmowy,
            final List<String> przyklady) {
        if (przyklady == null || przyklady.isEmpty()) {
            throw new UncheckedException("parametr przyklady jest pusty");
        }
        this.tematRozmowy = tematRozmowy;
//    this.przyklady = przyklady.isEmpty() ? new ArrayList<>() : przyklady;
// postać równoważna do: this.przyklady = przyklady.isEmpty() ? new ArrayList<>() : przyklady;
    /*
           IV konstrukcja warunkowa if
                  przyklady.isEmpty() ? new ArrayList<>() : przyklady
                  wszystko przed znakiem ? to jest warunek sprawdzający czyli if(przyklady.isEmpty())
                         między znakiem ? a znakiem : znajduje się instrukcja, jeżeli true inaczej mówiąc zawartość pierwszego bloku w instrukcji if
                                wszystko po znaku : znajduje się instrukcja, jeżeli false, inaczej mówiąc zawartość bloku w instrukcji else
                                     */
    /*
        if (przyklady.isEmpty()) {
            this.przyklady = new ArrayList<>();
        } else {
            this.przyklady = przyklady;
        }
    }
    public String getTematRozmowy() {
        return tematRozmowy;
    }

    public List<String> getPrzyklady() {
        return przyklady;
    }
    public String toString() {
        return "Informacja o klasie TalkDTO: { tematRozmowy: " + this.tematRozmowy
                + "\nPierwszy przykład: " + this.przyklady.get(0) + "}";
    }

}*/
