package JDK8Features.DateTime;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterQ {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss Z");
        String formattedDate = zonedDateTime.format(formatter);
        System.out.println("Formatted ZonedDateTime: " + formattedDate);

        String dateTimeString = "2025-01-01 15:30:00 +0100";
        ZonedDateTime parsedDate = ZonedDateTime.parse(dateTimeString, formatter);
        System.out.println("Parsed ZonedDateTime: " + parsedDate);
    }
}
