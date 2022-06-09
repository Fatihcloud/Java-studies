import java.util.*;

public class UcVeDortTam {
    public static void main(String[] args) {
        int sayı,ort = 0;
        double toplam = 0,net = 0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Hesaplanacak Yıl : ");
        sayı = inp.nextInt();

        for(int i = 1; i<=sayı; i++){
            if((i%3)==0 && (i%4)==0)
            {
                toplam += i;
                ort++;
            }
        }
        net = toplam / ort;
        System.out.print("3 ve 4'e tam bölünen sayıların ortalaması : " + net);
    }
}
