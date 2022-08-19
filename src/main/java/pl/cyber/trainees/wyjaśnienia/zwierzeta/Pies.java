package pl.cyber.trainees.wyjaśnienia.zwierzeta;

import pl.cyber.trainees.wyjaśnienia.DateConverter;

import java.text.ParseException;
import java.time.LocalDate;

    public class Pies extends Zwierze {

        private final String imie;
        private final LocalDate dataUrodzenia;
        private Double waga;
        private String imieOpiekuna;

        public Pies(final Double wzrost, final boolean czyMaSiersc, final String imie, final LocalDate dataUrodzenia, final Double waga, final String imieOpiekuna) {
            super(wzrost, czyMaSiersc);
            this.imie = imie;
            this.dataUrodzenia = dataUrodzenia;
            this.waga = waga;
            this.imieOpiekuna = imieOpiekuna;
        }
        public String przedstawSie () {
            return "Imię: " + this.imie
                    + " \nData urodzenia " + this.dataUrodzenia
                    + "\nWaga " + this.waga
                    + " \nImię opiekuna " + this.imieOpiekuna;
        }

        @Override
        public String dajGlos() {
            return "Hałłł";

        }
        public Pies convertFromFile(String rowInFile) {
            String [] tablicaPliku = rowInFile.split(",");
            DateConverter dateConverter = new DateConverter();
            LocalDate dataUrodzenia = null;
            try {
                dataUrodzenia = dateConverter.stringToDate(tablicaPliku[2]);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            return new Pies(Double.valueOf(tablicaPliku[5]), Boolean.parseBoolean(tablicaPliku[6]), tablicaPliku[1],
                    dataUrodzenia, Double.valueOf(tablicaPliku[3]), tablicaPliku[4]);

        }
        public Pies() {
            super(null, false);
            imie = "";
            dataUrodzenia = LocalDate.now();
        }
    }

