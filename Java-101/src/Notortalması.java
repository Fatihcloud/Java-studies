import java.util.Scanner;
public class Notortalması {
    public static void main(String[] args) {
        // Değişkenleri olurtur
        int mat,fiz,kim,turk,tarih,muzik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fiz = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kim = inp.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turk = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.print("Muzik Notunuz : ");
        muzik = inp.nextInt();

        int toplam = (mat + fiz + kim + turk + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız = " + sonuc);

        String yep = (sonuc > 60) ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız!";
        System.out.println(yep);

    }
}
