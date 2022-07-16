package pl.cyber.trainees.dziedziczenie;

// nowa klasa określająca markę pojazdu
public class Pojazd {

    private String marka;
    private String rocznik;
    private String naped;

    public Pojazd() {
        marka = "";
        rocznik = "";
        naped = "";
    }

    //Cmd + n - menu kontekstowe do generowania kodu, wybieramy opcję Constructor
    public Pojazd(final String marka, final String rocznik, final String naped) {
        this.marka = marka;
        this.rocznik = rocznik;
        this.naped = naped;
    }

    public String toString() {
        return "Marka: " + this.marka
                + " rocznik: " + this.rocznik
                + " naped: " + this.naped;
    }

    // gettery - metody, których zadaniem jest pobieranie informacji z pól klasy
    // do dalszego przetwarzania

    public String getMarka() {
        return marka;

    }

    public String getRocznik() {
        return rocznik;
    }
    public String getNaped(){
        return naped;
    }

    public void setMarka(String marka) {
        this.marka = marka;

    }
    public void setRocznik(String rocznik){
        this.rocznik = rocznik;
    }

    public void setNaped(String naped) {
        this.naped = naped;
    }

}
//rename




