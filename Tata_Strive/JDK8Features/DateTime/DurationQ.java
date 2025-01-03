package JDK8Features.DateTime;

import java.time.Duration;
import java.time.Instant;

public class DurationQ {
    public static void main(String[] args) {
        Instant start = Instant.now();
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Instant end = Instant.now();

        Duration duration = Duration.between(start, end);
        System.out.println("Duration: " + duration.toMillis() + " milliseconds");
        System.out.println(Duration.ofSeconds(30548));
    }
}
