package Date4;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        OffsetDateTime modifiedDateTime = dateTime.plusYears(1).minusMonths(1).plusDays(7);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALIAN);

        String formattedDate = modifiedDateTime.format(formatter);

        System.out.println(formattedDate);
    }
}