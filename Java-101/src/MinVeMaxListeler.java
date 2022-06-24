import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinVeMaxListeler {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        int[] list = {15,12,788,1,-1,-778,2,0};

        for(int i = 0; i<list.length;i++)
        {
            myList.add(list[i]);
        }
        Scanner inp = new Scanner(System.in);
        System.out.print("Girilen Sayı : ");
        int n = inp.nextInt();
        System.out.println("Dizi : " + myList);
        System.out.println("Girilen Sayı : " + n);
        myList.add(n);
        Collections.sort(myList);

        int a = myList.indexOf(n);
        System.out.println("Girilen Sayıdan küçük en yakın sayı : "+myList.get(a-1));
        System.out.println("Girilen Sayıdan büyük en yakın sayı : "+myList.get(a+1));
    }
}
