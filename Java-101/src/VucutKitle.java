import java.util.Scanner;

public class VucutKitle {
    public static void main(String[] args) {
        double a,b;
        double c;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        a = inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        b = inp.nextDouble();

        c = (b/(a*a));

        System.out.print(c);
    }
}
