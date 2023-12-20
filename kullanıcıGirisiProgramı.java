import java.util.Scanner;

public class kullanıcıGirisiProgramı {

    public static void main(String[] args) {

        String password;

        Scanner input = new Scanner(System.in);
        
        System.out.print("Şifresiniz giriniz : ");
        password = input.nextLine();

        if(password.equals("java1234")) {
            System.out.println("Başarıyla  giriş yapıldı");
        } else {
            System.out.println("Girdiğiniz şifre hatalı !");
            System.out.println("Şifrenizi sıfırlamak istiyor musunuz ? evet / hayır ");
            String cevap = input.nextLine();

                if (cevap.equals("evet")) {
                System.out.println("Lütfen şifrenizin eski şifre ile aynı olmamasına dikkat edin !");
                System.out.print("Yeni şifre : ");
                String newPassword = input.nextLine();

                    if (newPassword.equals("java1234")) {
                        System.out.println("Şifre oluşturulamadı. Lütfen başka şifre giriniz");
                    } else {
                        System.out.println("Şifre oluşturuldu");
                    }
                } else {
                    System.out.println("İyi günler dileriz");
                }
        }
    }
}
