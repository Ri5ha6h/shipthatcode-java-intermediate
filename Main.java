import java.util.*;
import java.io.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try(Stream<String> lines = br.lines()) {
            long txtCount = lines.filter(line -> !line.trim().isEmpty()).count();
            System.out.println(txtCount);
        }
    }
}
