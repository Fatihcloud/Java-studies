import java.util.*;

public class UstAlma {
    public static void main(String[] args) {
        int taban,tavan,total = 1;

        Scanner inp = new Scanner(System.in);

        System.out.print("Taban Sayı Giriniz : ");
        taban = inp.nextInt();

        System.out.print("Tavan Sayı Giriniz : ");
        tavan = inp.nextInt();

        for(int i = 1; i <= tavan; i++)
        {
            total *= taban;
        }

        System.out.print("Sonuç : " + total);
    }
}
