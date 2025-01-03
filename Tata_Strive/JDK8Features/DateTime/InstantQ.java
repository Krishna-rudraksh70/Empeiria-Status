package JDK8Features.DateTime;

import java.time.Instant;

public class InstantQ {
    public static void main(String[] args) {

        Instant instant = Instant.now();
        System.out.println("Current Instant: " + instant);

        Instant specificInstant = Instant.ofEpochSecond(1609459200); // Jan 1, 2021 00:00:00 UTC
        System.out.println("Specific Instant: " + specificInstant);
        System.out.println(Instant.MAX);
    }
}
