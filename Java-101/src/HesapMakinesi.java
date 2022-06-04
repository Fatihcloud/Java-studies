import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1,n2,select;


        Scanner inp = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        n1 = inp.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        n2 =inp.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = inp.nextInt();

        switch (select){
            case 1:
                n1 += n2;
                System.out.print("Sonuç : "+ n1);
                break;
            case 2:
                n1 -= n2;
                System.out.print("Sonuç : "+ n1);
                break;
            case 3:
                n1 *= n2;
                System.out.print("Sonuç : "+ n1);
                break;
            case 4:
                n1 /= n2;
                System.out.print("Sonuç : "+ n1);
                break;
            default:
                System.out.print("Hatalı seçim Hata!");
        }
    }
}
