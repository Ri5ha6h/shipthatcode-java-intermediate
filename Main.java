import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<String> words = new ArrayList<>();
        for (int i = 0; i < n; i++) words.add(br.readLine());
        // sort by length using a method reference
        // print each on its own line
        words.sort(Comparator.comparing(String::length));
        words.forEach(System.out::println);
    }
}
