package pl.cyber.trainees.wyjaśnienia.zwierzeta;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class enum ZwierzeEnum {
    PIES, KOT
}

    List<Zwierze> zwierze = new ArrayList<>();
        zwierze.add(new Kot(20.0, true, "Luca",LocalDate.of(2012, 8, 15), 6.0, "Joanna"));
        zwierze.add(new Kot(30.0, false, "Luca1", LocalDate.of(2012, 8, 15), 6.0, "Joanna"));
        zwierze.add(new Pies(6.0, true, "Burek", LocalDate.of(2012, 8, 15),
}
