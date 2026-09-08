import java.time.temporal.ChronoUnit;
import java.util.*;
import java.io.*;
import java.time.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LocalDate a = LocalDate.parse(br.readLine());
        LocalDate b = LocalDate.parse(br.readLine());

        // ChronoUnit.DAYS.between(...) gives a SIGNED count of days.
        // Nothing promises which date comes first, so print the magnitude.
        long gap = Math.abs(ChronoUnit.DAYS.between(a,b));
        System.out.println(gap);
    }
}
