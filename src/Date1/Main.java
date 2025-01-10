package Date1;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String dateTimeString = "2003-06-12T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateTimeString);

        DateTimeFormatter fullFormatter = DateTimeFormatter.ofLocalizedDateTime(java.time.format.FormatStyle.FULL).localizedBy(Locale.getDefault());
        System.out.println("FULL: " + offsetDateTime.format(fullFormatter));

        DateTimeFormatter mediumFormatter = DateTimeFormatter.ofLocalizedDateTime(java.time.format.FormatStyle.MEDIUM).localizedBy(Locale.getDefault());
        System.out.println("MEDIUM: " + offsetDateTime.format(mediumFormatter));

        DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDateTime(java.time.format.FormatStyle.SHORT).localizedBy(Locale.getDefault());
        System.out.println("SHORT: " + offsetDateTime.format(shortFormatter));
    }
}