package Date2;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Crea un oggetto OffsetDateTime dalla stringa
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        // Crea un formato per la data "01 marzo 2023"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALIAN);

        // Format della data
        String formattedDate = dateTime.format(formatter);

        // Stampa sulla console
        System.out.println(formattedDate);
    }
}