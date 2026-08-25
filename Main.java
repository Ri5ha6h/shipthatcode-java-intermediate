import java.util.*;
import java.io.*;

public class Main {

    static int divide(int a, int b) {
        if(b == 0) throw new ArithmeticException("divide by zero");
        return a / b;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            System.out.println("result: " + divide(a, b));
        } catch (ArithmeticException e) {
            System.out.println("error: " + e.getMessage());
        }
    }
}
