import java.util.Scanner;


public class AtmProgramı {
    public static void main(String[] args) {

        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select, price;
        int i = 1;

      while (right > 0) {
          System.out.print("kullanıcı adı giriniz : ");
          userName = input.nextLine();
          System.out.print("şifre giriniz : ");
          password = input.nextLine();

          if ( userName.equals("patika") && password.equals("dev123")) {
              System.out.println("bankamıza hoşgeldiniz.");
              do {


                  System.out.println("lütfen yapmak istediğiniz işlemi giriniz : ");
                  System.out.println("1 - para yatırma\n2 - para çekme\n3 - bakiye sorgulama\n4 - çıkış");
                  select = input.nextInt();

                  switch (select) {
                      case 1:
                          System.out.println("yatırmak istediğiniz para miktarını giriniz : ");
                          price = input.nextInt();
                          balance += price;
                          break;
                      case 2:
                          System.out.println("çekmek istediğiniz para miktarını giriniz : ");
                            price = input.nextInt();
                            if ( price > balance) {
                                System.out.println("yeterli bakiye bulunmamaktadır");
                            } else {
                                balance -= price;
                            }
                            break;
                      case 3:
                          System.out.println("bakiyeniz : " + balance);
                          break;
                  }

              } while (select != 4);
              System.out.println("tekrar görüşmek üzere hoşcakalın.");
            break;

          } else {
              right--;
              if ( right == 0) {
                  System.out.println("kartınız bloke olmuştur.");
              } else {
                  System.out.println("yanlış giriş yaptınızi lütfen tekrar deneyin");
                  System.out.println("kalan hakkınız : " + right);
              }

          }
      }

    }
}