import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().trim().split(" ");
        Map<String, Integer> map = new HashMap<>();
        for(String s : line){
            map.merge(s, 1, Integer::sum);
        }
        Map<String, Integer> map2 = new TreeMap<>(map);
        for(Map.Entry<String, Integer> entry : map2.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
