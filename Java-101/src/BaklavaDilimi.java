import java.util.*;
public class BaklavaDilimi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i,k,n,j,l,m;
        System.out.print("Sayi giriniz : ");
        n=scanner.nextInt();
        for (i=1;i<=n;i++)//Bu döngümüzde baklava dilimimizin üst kısmını yapıyoruz.
        {
            for (k=n;k>i;k--)//bu for döngümüz ekran çıktısının sol tarafındaki boşlukları ayarlıyor.
            {
                System.out.print(" ");
            }
            for (j = 1; j <=i ; j++)//bu for döngümüzde ise yıldız şeklimizi çıkartıyor ve yıldızların arasındaki boşluğu ayarlıyor
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
//bu döngümüz ile baklava diliminin alt kkısımını yapıyoruz
        for (k=1;k<=n;k++)
        {
            for (l =1 ; l <=k; l++)//döngümüz ile baklava diliminin alt kısımının sol tarafındaki boşlukları belirtiyoruz.
            {
                System.out.print(" ");
            }
            for (m = n; m >k ; m--)//bu döngümüz ile baklava diliminin alt kısımındaki yıldızları ve arasındaki boşlukları belirtiyoruz.
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
