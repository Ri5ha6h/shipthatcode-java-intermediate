import java.util.*;
import java.io.*;

public class Main {

    static final class Person {
        private final String name;
        private final int age;
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String name() {
            return this.name;
        }
        public int age() {
            return this.age;
        }
        @Override
        public String toString() {
            return "Person[name=" + this.name + ", age=" + this.age + "]";
        }
    }

    public static void main(String[] args) throws Exception {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String name = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        // Build a Person and print it.
        Person person = new Person(name, age);
        System.out.println(person.toString());
        sc.close();
    }
}
