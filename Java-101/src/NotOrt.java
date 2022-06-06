import java.util.Scanner;
import java.util.*;
public class NotOrt {
    public static void main(String[] args) {
        // Değişkenleri olurtur
        int mat, fiz, kim, turk, tarih, muzik, toplam= 0, a = 0;

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

        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(mat);
        l1.add(fiz);
        l1.add(kim);
        l1.add(turk);
        l1.add(tarih);
        l1.add(muzik);
        for(int not:l1){
            if(not >= 0 && not <= 100){
                toplam += not;
                a++;
            }else{
                continue;
            }
        }
        double sonuc = toplam / a;
        System.out.println("Ortalamanız = " + sonuc);
        String yep = (sonuc >= 55) ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız!";
        System.out.println(yep);

    }
}