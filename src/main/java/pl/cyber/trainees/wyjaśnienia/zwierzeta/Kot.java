package pl.cyber.trainees.wyjaśnienia.zwierzeta;

import com.sun.source.util.TaskListener;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Kot extends Zwierze {


    private final String imie;
    private final LocalDate dataUrodzenia;

    private Double waga;

    private String imieOpiekuna;



    public Kot(String imie, LocalDate dataUrodzenia, Double waga, String imieOpiekuna) {
        super (0.0, true);
        this.imie = imie;
        this.dataUrodzenia = dataUrodzenia;
        this.waga = waga;
        this.imieOpiekuna = imieOpiekuna;
    }

    public Kot(Double wzrost, boolean czyMaSiersc, String imie, LocalDate dataUrodzenia, Double waga, String imieOpiekuna) {
        super(wzrost, czyMaSiersc);
        this.imie = imie;
        this.dataUrodzenia = dataUrodzenia;
        this.waga = waga;
        this.imieOpiekuna = imieOpiekuna;
    }

    public String getImie() {
        return imie;
    }

    public LocalDate getDataUrodzenia() {
        return dataUrodzenia;
    }

    public Double getWaga() {
        return waga;
    }

    public String getImieOpiekuna() {
        return imieOpiekuna;
    }

    public String przedstawSie (){
        return "Imię: " + this.imie
                + " \nData urodzenia " + this.dataUrodzenia
                + "\nWaga " + this.waga
                + " \nImię opiekuna " + this.imieOpiekuna;

    }

    @Override
    public String dajGlos() {
        return "Miauuuuu";
    }
}
