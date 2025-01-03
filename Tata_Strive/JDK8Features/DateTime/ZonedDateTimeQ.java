package JDK8Features.DateTime;

import java.time.ZonedDateTime;
import java.time.ZoneId;

public class ZonedDateTimeQ {
    public static void main(String[] args) {

        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("Current DateTime: " + now);

        ZonedDateTime newYorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("New York Time: " + newYorkTime);
    }
}
