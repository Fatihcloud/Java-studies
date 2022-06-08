import java.util.*;

public class ArtıkYıl {
    public static void main(String[] args) {
        int yil;
        boolean artik = false;

        Scanner inp = new Scanner(System.in);

        System.out.print("Hesaplanacak Yıl : ");
        yil = inp.nextInt();

        if(yil % 4 == 0)
        {
            if( yil % 100 == 0)
            {
                if ( yil % 400 == 0)
                    artik = true;
                else
                    artik = false;
            }
            else
                artik = true;
        }
        else
            artik = false;

        if(artik)
            System.out.println(yil + " artık yıldır.");
        else
            System.out.println(yil + " artık yıl değildir.");
    }
}