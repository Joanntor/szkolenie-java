package pl.cyber.trainees.wyjaśnienia.bankomat;

public class Karta {    // aby przetestować - option enter -> create test
    //definicje pola klasy
    private final Integer nrKarty;
    private final Integer pinKarty;

    private Integer saldo;

// wszystkie niezbędne dla nas konstruktory
    public Karta(final Integer nrKarty, final Integer pinKarty, final Integer saldo) {
        this.nrKarty = nrKarty;
        this.pinKarty = pinKarty;
        this.saldo = saldo;
    }
// metody getter
    public Integer getGetNrKarty() {
        return nrKarty;
    }

    public Integer getPinKarty() {
        return pinKarty;
    }

    public Integer getSaldo() {
        return saldo;
    }

    // metody setter
    // pozostałe przydatne nam metody

    public void sprawdzNrPin(final Integer pinKarty) {
        if (!this.pinKarty.equals(pinKarty)) {
            throw new KartaException("Niepoprawny PIN dla karty");
        }
    }

    public Object getNrKarty() {
        return nrKarty;
    }

    public void wplacGotowke(final Integer kwota) {
        this.saldo +=kwota;
    }

    public void sprawdzWyplate(final Integer kwota) {
        if (this.saldo - kwota <0) {
            throw new KartaException("Niewystarczająca ilość środków na karcie");
        }
    }

    public void wyplacGotowke(final Integer kwota) {
        this.saldo -= kwota;
    }

    public Integer stanKonta() {
        return this.saldo;

    }
}
