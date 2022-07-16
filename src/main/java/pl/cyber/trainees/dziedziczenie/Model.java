package pl.cyber.trainees.dziedziczenie;

// extends - słowo kluczowe stosowane przy dziedziczeniu klas
// super - słowo kluczowe stosowane przy dziedziczeniu odnosi się do konstruktora klasy nadrzędnej
public class Model extends Pojazd {
    private String nazwa;
    private Integer przebieg;
    private Double pojemnoscSilnika;
    private Kolor kolor;

    public Model() {
        super();
        this.nazwa = "";
        this.przebieg = 0;
        this.pojemnoscSilnika = 0.0;
        this.kolor = null;
    }

    public Model(
            String marka, String rocznik, String naped, String nazwa,
            Integer przebieg, Double pojemnoscSilnika, Kolor kolor) {

        super(marka, rocznik, naped);
        this.nazwa = nazwa;
        this.przebieg = przebieg;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.kolor = kolor;
    }

    @Override //adnotacja wykorzystywana do przysłanianai metod
    public String toString() {
        return "Marka: " + getMarka()
                + " rocznik: " + getRocznik()
                + " naped " + getNaped()
                + " nazwa modelu " + this.nazwa
                + " przebieg " + this.przebieg
                + " pojemnoscSilnika " + this.pojemnoscSilnika
                + " kolor " + this.kolor;

    }
    // przesłanianie metod - nadanie nowej funkcjonalności metodzie

    public String getNazwa() {
        return nazwa;
    }

    public Integer getPrzebieg() {
        return przebieg;
    }

    public Double getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }

    public Kolor getKolor() {
        return kolor;
    }


    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;

    }
    public void setPrzebieg(Integer przebieg) {
        this.przebieg = przebieg;
    }
    public void setPojemnoscSilnika(Double pojemnoscSilnika) {
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    public void setKolor(Kolor kolor) {
        this.kolor = kolor;

    }

}
// reneme
