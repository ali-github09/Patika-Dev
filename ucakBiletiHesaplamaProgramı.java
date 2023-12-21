import java.util.Scanner;

public class ucakBiletiHesaplamaProgramı {
    public static void main(String[] args) {

        double birimFiyat = 0.10, toplamFiyat, sonFiyat, yasindirimOranı = 0, yasindirimliFiyat, yolculukindirimoranı = 0, indirimliFiyat, yasindirimMiktarı, yolculukindirimMiktarı;
        int age, km, travel;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen yaşınızı girin : ");
        age = input.nextInt();
        System.out.print("Lütfen gideceğinizi mesafeyi km cinsinden tam sayı oarak girin : ");
        km = input.nextInt();
        System.out.print("Lütfen yolculuk türünüzü 1 veya 2 olarak seçin. (1 = tek yön  2= gidiş-dönüş) : ");
        travel = input.nextInt();

        if (age < 0 || km < 0 ) {
            System.out.println("Lütfen geçerli bir yaş ve km  değeri girin. (pozitif ve tam sayı olarak)");
        } else if (travel != 1 && travel != 2) {
            System.out.println("Lütfen geçerli bir seyahat türü seçiniz");
        } else {

            if (travel == 1) {
                yolculukindirimoranı = 0;

                if (age < 12 ) {
                    yasindirimOranı = 0.5;
                } else if (age >=12 && age < 24) {
                    yasindirimOranı = 0.1;    
                } else if (age > 65 ) {
                    yasindirimOranı = 0.3;
                }
            } else {
                yolculukindirimoranı = 0.2;

                if (age < 12 ) {
                    yasindirimOranı = 0.5;
                } else if (age >=12 && age < 24) {
                    yasindirimOranı = 0.1;
                } else if (age > 65 ) {
                    yasindirimOranı = 0.3;
                }
            }
        }

        toplamFiyat = km * birimFiyat;
        yasindirimMiktarı = toplamFiyat * yasindirimOranı;
        yasindirimliFiyat = toplamFiyat - yasindirimMiktarı;
        yolculukindirimMiktarı = yasindirimliFiyat * yolculukindirimoranı;
        sonFiyat = travel * (yasindirimliFiyat - yolculukindirimMiktarı);

        System.out.println("Bilet fiyatınız : " + sonFiyat + " tl'dir. ");


    }
}
