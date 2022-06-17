import java.util.*;

public class PalindromSayı {
    static boolean Palindrom(int number)
    {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0)
        {
         lastNumber = temp % 10;
         reverseNumber = (reverseNumber * 10) + lastNumber;
         temp /= 10;
        }
        if (number == reverseNumber)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int a = input.nextInt();
        System.out.println(Palindrom(a));
    }
}
