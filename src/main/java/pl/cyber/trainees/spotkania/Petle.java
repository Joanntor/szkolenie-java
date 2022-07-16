package pl.cyber.trainees.spotkania;

import pl.cyber.trainees.kalkulator.Dodawanie;

import java.util.List;

public class Petle {
    //Zadanie utworzyć metodę, która wyświetli liczby całkowite od 1 do 100 po przecinku
    // oraz prawidłowo użyć w SimpleApp.java

    public void wyswietlOd1Do100() {
        for (int i = 1; i <= 100; i++) {
            if (i < 100) {
                System.out.print(i + ", ");
            } else {
                System.out.println(i + ".");
            }
        }
    }

    // Utworzyć nową metodę w której przekażemy jako parametr Listę Double. W ramach pętli foreach wykonamy dodawanie wartości z listy
    // następnie proszę wyświetliś wynik dodawania w postaci: Wynik dodawania listy  XYZ

    public void dodawanieElementowListy(List <Double> lista) {

        Double result = 0.0;

        for (Double element: lista) {
            System.out.println("Teraz wykonuję operację: " + element + "+" + result);
            result = Dodawanie.add(result, element);
     //       result = result + element;

        }
            System.out.println("Wynik dodawania listy:  " + result);

    }
}
