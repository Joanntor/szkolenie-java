package pl.cyber.trainees.serwis;

import pl.cyber.trainees.dziedziczenie.Kolor;
import pl.cyber.trainees.dziedziczenie.Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OdczytDanych {

    public String wprowadzonaWartoscZKlawiatury() {
        // Scanner -- obiekt pozwalający na odczyt danych z klawiatury
        // System.in - obiekt reprezentujący InputStream, odpowiada za przetwarzanie danych

        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
 //    public String daneZPliku(File plikZew) throws FileNotFoundException
    // throws mówi aplikacji (ewentualnie ) pojawiający się błąd
    // przenieść do miejsca wykonania metody

    // druga opcja to obsłużenie wyjątków


    public String daneZPliku(File plikZew) throws FileNotFoundException {
        Scanner scan = new Scanner(plikZew);
        return scan.nextLine();

    }

    public Model daneOModeluPojazdu(File plikZew) throws FileNotFoundException {

        // string[]
        //String[]

        //róznice między tablicą a Listą

        Model modelPojazdu = new Model();
        Scanner scan = new Scanner(plikZew);
        String liniaWPliku = scan.nextLine();
        String[] tablicaPliku = liniaWPliku.split(", ");

        modelPojazdu.setMarka(tablicaPliku[0]);
        modelPojazdu.setRocznik(tablicaPliku[1]);
        modelPojazdu.setNaped(tablicaPliku[2]);
        modelPojazdu.setNazwa(tablicaPliku[3]);
        modelPojazdu.setPrzebieg(Integer.valueOf(tablicaPliku[4]));
        modelPojazdu.setPojemnoscSilnika(Double.valueOf(tablicaPliku[5]));
        modelPojazdu.setKolor(Kolor.valueOf(tablicaPliku[6]));

        return modelPojazdu;

    }
}
