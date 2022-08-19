package pl.cyber.trainees.wyjaśnienia.bankomat;

public class Karta {
    private final Integer nrKarty;
    private final Integer pinKarty;
    private Integer saldo;

    public Karta(final Integer nrKarty, final Integer pinKarty, final Integer saldo) {
        this.nrKarty = nrKarty;
        this.pinKarty = pinKarty;
        this.saldo = saldo;
    }

    public Integer getGetNrKarty() {
        return nrKarty;
    }

    public void sprawdzNrPin(final Integer pinKarty) {
        if (!this.pinKarty.equals(pinKarty)) {
            throw new KartaException("Niepoprawny PIN dla karty");
        }
    }

    public Object getNrKarty() {
    }
}
