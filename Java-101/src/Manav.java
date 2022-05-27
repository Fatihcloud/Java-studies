import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlıcan = 5.00;
        double f;
        int a,b,c,d,e;

        Scanner inp = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        a = inp.nextInt();
        System.out.print("Elma Kaç Kilo ? : ");
        b = inp.nextInt();
        System.out.print("Domates Kaç Kilo ? : ");
        c = inp.nextInt();
        System.out.print("Muz Kaç Kilo ? : ");
        d = inp.nextInt();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        e = inp.nextInt();

        f = (a*armut)+(b*elma)+(c*domates)+(d*muz)+(e*patlıcan);

        System.out.print("Toplam : " + f);
    }
}
