import java.util.*;

public class MinVeMax {
    public static void main(String[] args) {
        int sayı,a=1;

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz : ");
        sayı = input.nextInt();

        List<Integer> myList = new ArrayList<>();

        while(a <= sayı)
        {
            System.out.print(a + ". Sayıyı giriniz:");
            myList.add(input.nextInt());
            a++;
        }
        Collections.sort(myList);
        System.out.println(myList.get(0));
        System.out.println(myList.get(sayı-1));
    }
}
