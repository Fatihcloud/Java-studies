import java.util.Scanner;

public class TaksiMetre {
    public static void main(String[] args) {
        double a,c;
        int b = 10;

        Scanner inp = new Scanner(System.in);

        System.out.print("Gidilecek mesafeyi KM cinsinden giriniz : ");
        a = inp.nextInt();
        c = (a*2.20)+b;
        if(c<=20){
            System.out.print("Ücretiniz 20 TL'nin altındadır. İndi bindi ücreti 20 TL dir.");
        }
        else{
            System.out.print("Taksi ücretiniz : " + c);
        }

    }
}
