import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        // Kulanıcan değerin atanacağı değer.
        int deger, hesap, sonuc;

        Scanner inp = new Scanner(System.in);

        System.out.print("KDV Hesabı Yapılacak Rakam : ");
        deger = inp.nextInt();

        if (deger <= 1000){
            hesap = (deger * 18)/100;
            sonuc = deger + hesap;
            System.out.print(sonuc);
        }
        else{
            hesap = (deger * 8)/100;
            sonuc = deger + hesap;
            System.out.print(sonuc);
        }
    }
}
