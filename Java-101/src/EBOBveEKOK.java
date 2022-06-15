import java.util.*;

public class EBOBveEKOK {
    public static void main(String[] args) {
        int i = 1;
        int ebob = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("n1 Sayısını Giriniz : ");
        int n1 = input.nextInt();

        System.out.print("n2 Sayısını Giriniz : ");
        int n2 = input.nextInt();

        while (i <= n1)
        {
            if (n1 % i == 0 && n2 % i == 0)
            {
                ebob = i;
            }
            i++;
        }
        int a = 0;
        int b = 1;
        while (b <= (n1 * n2))
        {
            if (b % n1 == 0 && b % n2 == 0)
            {
                a = b;
                break;
            }
            b++;
        }
        System.out.println("Sayının EKOK Değeri : " + a);
        System.out.println(("Sayının EBOB Değeri : " + ebob));
    }
}
