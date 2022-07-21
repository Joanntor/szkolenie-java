package pl.cyber.trainees.spotkania;

import pl.cyber.trainees.kalkulator.Dodawanie;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    public void dodawanieElementowListy(List<Double> lista) {

        Double result = 0.0;

        for (Double element : lista) {
            System.out.println("Teraz wykonuję operację: " + element + "+" + result);
            result = Dodawanie.add(result, element);
            //       result = result + element;

        }
        System.out.println("Wynik dodawania listy:  " + result);

    }

    public void wyswietlSet() {
        Set<Integer> intSet = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6, 7, 8, 10, 11));
        for (Integer element :
                intSet){
            System.out.println("To jest element seta: " + element);
        }

    }

    //Set.of() można ustawiać kolekcję Set, należy pamiętać, że maksymalnie przyjmuje 10 elementów
    // użycie Set.of() stosowane jest dla kolekcji o małej liczbie elementów, głównie w ramach testów jesdnostkowych.

    // Utworzenie metody, która wyświetli zadany set
    // Set<Integer> intSet = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11));
    // następnie przez pętlę foreach wyświetlić elementy.
    // Wyświetlanie w następujący sposób: To jest element seta:


}
