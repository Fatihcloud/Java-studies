import java.util.Scanner;

public class DaireDilimiAlan {
    public static void main(String[] args) {
        double a,b,c;
        double pi = 3.14;

        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin Yarıçapı : ");
        a = inp.nextInt();

        System.out.print("Merkez açısının ölçüsü : ");
        b = inp.nextInt();

        c = (pi*(a*a)*b)/360;

        System.out.print(c);
    }
}
