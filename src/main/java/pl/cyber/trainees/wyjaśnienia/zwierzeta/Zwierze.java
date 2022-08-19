package pl.cyber.trainees.wyjaśnienia.zwierzeta;

public class Zwierze {
    private final Double wzrost;
    private final boolean czyMaSiersc;

    public Zwierze(Double wzrost, boolean czyMaSiersc) {
        this.wzrost = wzrost;
        this.czyMaSiersc = czyMaSiersc;
    }

    public Double getWzrost() {
        return wzrost;
    }

    public boolean isCzyMaSiersc() {
        return czyMaSiersc;
    }
    public String dajGlos(){
        return "";
    }
    }


