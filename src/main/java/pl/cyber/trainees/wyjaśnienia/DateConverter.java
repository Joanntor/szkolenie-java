package pl.cyber.trainees.wyjaśnienia;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;

public class DateConverter {

    public LocalDate stringToDate(String date) throws ParseException {
        var dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        return LocalDate.ofInstant(dateFormat.parse(date).toInstant(), ZoneId.of("Europe/Warsaw"));
    }
}
