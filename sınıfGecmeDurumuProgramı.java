import java.util.Scanner;

public class sınıfGecmeDurumuProgramı {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan 5 adet not girişi alınacak
        int toplamNot = 0;
        int gecerliNotSayisi = 0;
        int not;

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + ". notu girin: ");
            not = input.nextInt();

            // Girilen not 0 ile 100 arasında ise hesaplamaya dahil edilecek
            if (not >= 0 && not <= 100) {
                toplamNot += not;
                gecerliNotSayisi++;
            } else {
                System.out.println("Geçersiz not. 0 ile 100 arasında olmalıdır. Tekrar girin.");
                i--; // Geçersiz not durumunda döngüyü bir geri al
            }
        }

        // Not ortalamasını hesapla ve ekrana yazdır
        if (gecerliNotSayisi > 0) {
            double ortalama = (double) toplamNot / gecerliNotSayisi;
                if (ortalama > 55) {
                    System.out.println("Not Ortalaması: " + ortalama);
                    System.out.println("Tebrikler başarılı oldnuz");
                } else {
                    System.out.println("Not Ortalaması: " + ortalama);
                    System.out.println("Üzgünüz başarısız oldunuz");
                }

        } else {
            System.out.println("Geçerli not bulunamadı.");
        }


    }
}
