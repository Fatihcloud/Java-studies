import java.util.*;

public class MukemmelSayı {
    public static void main(String[] args) {
        int i = 1,a = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("n1 Sayısını Giriniz : ");
        int n1 = input.nextInt();

        while (i <= n1)
        {
            if (n1 % i == 0)
            {
                a += i;
            }
            i++;
        }
        if((n1 * 2) == a)
        {
            System.out.print(n1+" Mükemmel Sayıdır");
        }
        else
        {
            System.out.print(n1+" Mükemmel Sayı Değildir");
        }
    }
}
