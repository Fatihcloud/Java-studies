import java.util.Scanner;

public class KullanıcıGirisi {
    public static void main(String[] args) {
        String name,pass,b,a;

        Scanner imp = new Scanner(System.in);

        System.out.println("kullanıcı adı : ");
        name = imp.nextLine();
        if (name.equals("patika")){
            System.out.println("Kullanıcı Adı Doğru ");

            System.out.println("Şifreniz : ");
            pass = imp.nextLine();
            if(pass.equals("java123")){
                System.out.println("Giriş Başarılı ");
            }
            else{
                System.out.println("Şifre Yanlış Değiştirmek İster Misin ? Evet-1 / Hayır-2 ");
                a = imp.nextLine();
                if(a.equals("1")){
                    System.out.println("Yeni Şifreniz : ");
                    b = imp.nextLine();
                    if(b.equals("java123")){
                        System.out.println("Yeni Şifre Eskisi ile aynı olamaz ");
                    }
                    else{
                        System.out.println("Şifre Değiştirildi ");
                    }
                }
                else{
                    System.out.println("Giriş yapılamadı ");
                }
            }
        }
        else{
            System.out.println("Kulanıcı ismi yanlış ");
        }
    }
}
