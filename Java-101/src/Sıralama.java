import java.util.*;
public class Sıralama {
    public static void main(String[] args) {
        int sayı1,sayı2,sayı3;

        Scanner inp = new Scanner(System.in);

        System.out.print("1.Sayı : ");
        sayı1 = inp.nextInt();

        System.out.print("2.Sayı : ");
        sayı2 = inp.nextInt();

        System.out.print("3.Sayı : ");
        sayı3 = inp.nextInt();

        ArrayList<Integer> sayilar = new ArrayList<Integer>();
        sayilar.add(sayı1);
        sayilar.add(sayı2);
        sayilar.add(sayı3);

        Collections.sort(sayilar);

        for(Integer a:sayilar){
            System.out.println(a);
        }
    }
}
