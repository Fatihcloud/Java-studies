import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        int a, b = 1, sonuc = 0;
        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            a = b;
            b = sonuc;
            sonuc = a + b;
            myList.add(sonuc);
        }
    }
}
