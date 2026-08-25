import java.util.*;
import java.io.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(br.readLine().trim());
        Function<Integer, Integer> f = x -> (x * x) + 1;
        System.out.println(f.apply(line));
    }
}
