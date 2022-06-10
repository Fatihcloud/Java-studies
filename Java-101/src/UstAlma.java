import java.util.*;

public class UstAlma {
    public static void main(String[] args) {
        int taban,tavan,total = 1;
        int i = 1;

        Scanner inp = new Scanner(System.in);

        System.out.print("Taban Sayı Giriniz : ");
        taban = inp.nextInt();

        System.out.print("Tavan Sayı Giriniz : ");
        tavan = inp.nextInt();

        while (i  <= tavan)
        {
            total *= taban;
            i++;
        }

        System.out.print("Sonuç : " + total);
    }
}
