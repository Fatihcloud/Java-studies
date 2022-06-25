import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DizidekiElemanlarıSıralama {
    public static void main(String[] args) {
        int sayı,a=1;

        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutu n : ");
        sayı = input.nextInt();

        List<Integer> myList = new ArrayList<>();

        while(a <= sayı)
        {
            System.out.print(a + ". Elemanı :");
            myList.add(input.nextInt());
            a++;
        }
        Collections.sort(myList);
        System.out.println("Sıralama :" + myList);
    }
}
