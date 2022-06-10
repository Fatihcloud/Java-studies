import java.util.*;

public class HarmonikHesaplama {
    public static void main(String[] args) {
        int num;
        double result = 0.0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        num = inp.nextInt();

        for (double a = 1; a <= num; a++)
        {
            result += (1/a);
        }
        System.out.println(result);
    }
}
