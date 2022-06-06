import java.util.Scanner;
public class Etkinlik {
    public static void main(String[] args) {
        int sıcaklık;

        Scanner inp = new Scanner(System.in);

        System.out.println("Sıcaklık Giriniz : ");
        sıcaklık = inp.nextInt();

        if (sıcaklık < 5)
        {
            System.out.println("Kayak Yapabilirsin ");
        }
        else if (sıcaklık >= 5 && sıcaklık <= 15)
        {
            System.out.println("Sinema Yapabilirsin ");
        }
        else if (sıcaklık > 15 && sıcaklık <= 25)
        {
            System.out.println("Piknik Yapabilirsin ");
        }
        else
        {
            System.out.println("Yüzme Yapabilirsin ");
        }
    }
}
