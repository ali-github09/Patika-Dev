import java.util.Scanner;

public class hesapMakinesiProgramı {

    public static void main(String[] args) {

        int a, b, islem, sonuc;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        a = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        b = input.nextInt();
        System.out.print("1 = toplama\n2 = çıkarma\n3 = çarpma\n4 = bölme\n" +
                "lütfen yapmak istediğiniz işlemi seçiniz : ");
        islem = input.nextInt();

        switch (islem) {

            case 1:
                sonuc = a+b;
                System.out.println("sonuç = " + sonuc);
                break;

            case 2:

                sonuc = a-b;
                System.out.println("sonuc = " + sonuc);
                break;

            case 3:
                sonuc = a*b;
                System.out.println("sonuç = " + sonuc);
                break;

            case 4:
                switch (b) {
                    case 0:
                        System.out.println("Geçersiz sayı girdiniz. (Payda 0 olamaz ) Lütfen tekrar deneyiniz");
                        break;
                    default:
                        sonuc = a/b;
                        System.out.println("sonuç = " + sonuc);
                }
                break;

                default:
                System.out.println("lütfen 1,2,3,4 sayılarından birini seçiniz");
        }

    }
}
