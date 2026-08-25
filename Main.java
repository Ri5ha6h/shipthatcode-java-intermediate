public class Main {
     static class Pair<A, B> {
         private A first;
         private B second;

         Pair(A first, B second) {
             this.first = first;
             this.second = second;
         }

         public String toString() {
             return "(" + first + ", " + second + ")";
         }
     }

    public static void main(String[] args) {
        Pair<String, Integer> p = new Pair<>("Ada", 36);
        System.out.println(p.toString());
    }
}
