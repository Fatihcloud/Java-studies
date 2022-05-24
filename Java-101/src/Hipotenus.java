import java.lang.Math;
import java.util.Scanner;

public class Hipotenus {
    public static void main(String[] args) {
        double a, b, c;

        Scanner inp = new Scanner(System.in);

        System.out.print("1. Kenar Uzunluğu : ");
        a = inp.nextInt();

        System.out.print("2. Kenar Uzunluğu  : ");
        b = inp.nextInt();

        System.out.print("3. Kenar Uzunluğu  : ");
        c = inp.nextInt();

        double u = (a+b+c)/2.0;
        double alan = u*(u-a)*(u-b)*(u-c);
        System.out.println(Math.sqrt(alan));
    }
}
