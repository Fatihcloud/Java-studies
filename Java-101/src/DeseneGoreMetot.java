import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class DeseneGoreMetot {
    static int Metot(int sayi)
    {
        List<Integer> myList = new ArrayList<>();
        for(int i = sayi; i >- 5; i=i-5)
        {
            myList.add(i);
        }
        int uzunluk = myList.size() - 1-1;
        int soneleman = myList.get(uzunluk);
        for (int a = soneleman; a <+ sayi+5; a=a+5)
        {
            myList.add(a);
        }
        System.out.print("Çıktıs : "+ myList.toString()
                .replace("[", "")
                .replace(",", "")
                .replace("]", ""));
        return 0;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("N sayısı : ");
        int sayi = inp.nextInt();
        Metot(sayi);
    }
}
