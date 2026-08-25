import java.util.*;
import java.io.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] line = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = Arrays.stream(line).filter(n -> n % 2 == 0).map(n -> n * n).sum();
        System.out.println(sum);
    }
}
