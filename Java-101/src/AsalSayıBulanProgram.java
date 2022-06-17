import java.util.Scanner;

public class AsalSayıBulanProgram {
    static int Asal(int base){
        int kontrol = 0;
        for (int i = 2; i < base; i++)
        {
            if (base % i == 0)
            {
                kontrol = 1;
                System.out.print(base + " sayısı ASAL değildir !");
                break;
            }
        }

        if(kontrol==0)
        {
            System.out.print(base + " sayısı ASALDIR !");
            return 0;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz :");
        int base = scan.nextInt();
        Asal(base);
    }
}
