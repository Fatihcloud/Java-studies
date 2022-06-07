import java.util.*;
public class BurcHesaplama {
    public static void main(String[] args) {
        String ay;
        String burc = null;
        int gun;

        Scanner inp = new Scanner(System.in);

        System.out.print("Hangi Ay'da Doğdunuz 1-12 : ");
        ay = inp.nextLine();

        System.out.print("Hangi Gün'de Doğdunuz 1-30 : ");
        gun = inp.nextInt();

        if (ay.equals("1"))
        {
            if(gun<=21){burc="oğlak";}
            if(gun>=22){burc="kova";}
        }
        if (ay.equals("2"))
        {
            if(gun<=19){burc="kova";}
            if(gun>=20){burc="balık";}
        }
        if (ay.equals("3"))
        {
            if(gun<=20){burc="balık";}
            if(gun>=21){burc="koç";}
        }
        if (ay.equals("4"))
        {
            if(gun<=20){burc="koç";}
            if(gun>=21){burc="boğa";}
        }
        if (ay.equals("5"))
        {
            if(gun<=21){burc="boğa";}
            if(gun>=22){burc="ikizler";}
        }
        if (ay.equals("6"))
        {
            if(gun<=22){burc="ikizler";}
            if(gun>=23){burc="yengeç";}
        }
        if (ay.equals("7"))
        {
            if(gun<=22){burc="yengeç";}
            if(gun>=23){burc="aslan";}
        }
        if (ay.equals("8"))
        {
            if(gun<=22){burc="aslan";}
            if(gun>=23){burc="başak";}
        }
        if (ay.equals("9"))
        {
            if(gun<=22){burc="başak";}
            if(gun>=23){burc="terazi";}
        }
        if (ay.equals("10"))
        {
            if(gun<=21){burc="terazi";}
            if(gun>=22){burc="akrep";}
        }
        if (ay.equals("11"))
        {
            if(gun<=21){burc="akrep";}
            if(gun>=22){burc="yay";}
        }
        if (ay.equals("12"))
        {
            if(gun<=21){burc="yay";}
            if(gun>=22){burc="oğlak";}
        }
        System.out.println("Burcunuz : " + burc);
    }
}
