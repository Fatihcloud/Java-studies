import java.util.*;

public class Kombinasyon {
    public static void main(String[] args) {
        int n,r,a = 1,b = 1,c = 1,x;
        int total;

        Scanner inp = new Scanner(System.in);

        System.out.print("1. Sayıyı Giriniz : ");
        n = inp.nextInt();

        System.out.print("2. Sayıyı Giriniz : ");
        r = inp.nextInt();

        for (int i = 1; i <= n; i++)
        {
            a *= i;
        }
        for (int i = 1; i <= r; i++)
        {
            b *= i;
        }
        x = n-r;
        for (int i = 1; i <= x; i++)
        {
            c *= i;
        }

        total = a / (b*c);

        System.out.print("n’in r’li kombinasyonu : " + total);
    }
}
