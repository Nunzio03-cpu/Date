package Date5;

import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime dateTime1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime dateTime2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        boolean isBefore = dateTime1.isBefore(dateTime2);
        boolean isAfter = dateTime2.isAfter(dateTime1);
        boolean isEqual = dateTime1.isEqual(dateTime2);

        System.out.println("La prima data è precedente alla seconda: " + isBefore);
        System.out.println("La seconda data è successiva alla prima: " + isAfter);
        System.out.println("Le due date sono uguali: " + isEqual);
    }
}