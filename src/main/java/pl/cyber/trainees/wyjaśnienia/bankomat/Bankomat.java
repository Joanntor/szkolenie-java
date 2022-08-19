package pl.cyber.trainees.wyjaśnienia.bankomat;

public class Bankomat {
    private Integer saldo;
    public Bankomat() {
        this.saldo = 0;
    }

    public Integer stanKonta() {
        return this.saldo;

    }

    public void wplacGotowke(final Integer kwota) {
        this.saldo += kwota;
    }
    public void sprawdzWyplate(final Integer kwota) {
        if(this.saldo - kwota < 0) {
            throw new StankKontaBankomatuException("Niewystarczająca iklość środków w bankomacie");

        }

    }

    public void wyplacGotowke(final Integer kwota) {
        this.saldo -= kwota;

    }
}
