import java.util.*;
public class BasamakToplamı {
    public static void main(String[] args) {
        int num,sayı = 0,total = 0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        num = inp.nextInt();

        while (num != 0)
        {
            total += (num % 10);
            num /= 10;
            ++sayı;
        }
        System.out.print("Sonuç : " + total);
    }
}
