import java.util.*;

public class DortVeBesInKuvetleri {
    public static void main(String[] args) {
        int sayı;

        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        sayı = inp.nextInt();

        for(int i = 1;i <= sayı; i*=4)
        {
            System.out.println("4 ün Katları : " + i);
        }
        for(int a = 1;a <= sayı; a*=5)
        {
            System.out.println("5 ün Katları : " + a);
        }
    }
}
