import java.util.*;
import java.io.*;

public class Main {

    static Optional<Integer> safeParse(String s) {
        try {
            int n = Integer.parseInt(s);
            return Optional.of(n);
        } catch (NumberFormatException e) {}
        return Optional.empty();
    }

    public static void main(String[] args) throws IOException {
        String line = new BufferedReader(new InputStreamReader(System.in)).readLine();
        System.out.println(safeParse(line).map(n -> n * 2).orElse(-1));
    }
}
