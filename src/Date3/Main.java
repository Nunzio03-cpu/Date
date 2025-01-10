package Date3;

import java.time.OffsetDateTime;
import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        int anno = dateTime.getYear();

        int mese = dateTime.getMonthValue();

        int giorno = dateTime.getDayOfMonth();

        DayOfWeek giornoSettimana = dateTime.getDayOfWeek();

        System.out.println("Anno: " + anno);
        System.out.println("Mese: " + mese);
        System.out.println("Giorno: " + giorno);
        System.out.println("Giorno della settimana: " + giornoSettimana);
    }
}