import java.util.*;
public class BiletHesaplama {
    public static void main(String[] args) {
        int km,yas,tip;
        double mesefe = 0.10;

        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        km = inp.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = inp.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        tip = inp.nextInt();

        switch (tip)
        {
            case 1:
                if(km <= 0 || yas <= 0)
                {
                    System.out.print("Hatalı Veri Girdiniz ! ");
                    break;
                }
                else
                {
                    if(yas >=1 && yas < 12)
                    {
                        double Normal = (km * mesefe)/2;
                        System.out.print("Toplam Tutar = " + Normal);
                        break;
                    }
                    if (yas >=12 && yas < 24)
                    {
                        double Normal = (km * mesefe);
                        double Indirim = Normal * 0.10;
                        double Net = Normal-Indirim;
                        System.out.print("Toplam Tutar = " + Net);
                        break;
                    }
                    if (yas >=24 && yas < 65)
                    {
                        double Normal = (km * mesefe);
                        System.out.print("Toplam Tutar = " + Normal);
                        break;
                    }
                    if (yas >=65)
                    {
                        double Normal = (km * mesefe);
                        double Indirim = (Normal * 30)/100;
                        double Net = Normal-Indirim;
                        System.out.print("Toplam Tutar = " + Net);
                        break;
                    }
                }
                break;
            case 2:
                if(km <= 0 || yas <= 0)
                {
                    System.out.print("Hatalı Veri Girdiniz ! ");
                    break;
                }
                else
                {
                    if(yas >=1 && yas < 12)
                    {
                        double Normal = (km * mesefe)/2;
                        double Indirim = (Normal * 0.20);
                        double Net = Normal-Indirim;
                        System.out.print("Toplam Tutar = " + Indirim*2);
                        break;
                    }
                    if (yas >=12 && yas < 24)
                    {
                        double Normal = (km * mesefe);
                        double Indirim = Normal * 0.10;
                        double indirimlifiyat  = Normal-Indirim;
                        double don = indirimlifiyat * 0.20;
                        double Net = indirimlifiyat-don;
                        System.out.print("Toplam Tutar = " + Net*2);
                        break;
                    }
                    if (yas >=24 && yas < 65)
                    {
                        double Normal = (km * mesefe);
                        double Indirim = (Normal * 0.20);
                        double Net = Normal-Indirim;
                        System.out.print("Toplam Tutar = " + Indirim*2);
                        break;
                    }
                    if (yas >=65)
                    {
                        double Normal = (km * mesefe);
                        double Indirim = Normal * 0.10;
                        double indirimlifiyat  = Normal-Indirim;
                        double don = indirimlifiyat * 0.20;
                        double Net = indirimlifiyat-don;
                        System.out.print("Toplam Tutar = " + Net*2);
                        break;
                    }
                }
                break;
            default:
                System.out.print("Hatalı Veri Girdiniz ! ");
        }
    }
}
