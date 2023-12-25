import java.util.Scanner;

public class mukemmelSayıProgramı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayı;
        int toplam = 0;

        System.out.print("lütfen bir sayı giriniz : ");
        sayı = input.nextInt();

        for (int i =1; i < sayı; i++) {
            if (sayı%i == 0) {
                toplam += i;
            }
        }

        if (toplam == sayı) {
            System.out.println(sayı + " mükemmel bir sayıdır.");
        } else {
            System.out.println(sayı + " mükemmel bir sayı değildir.");
        }
    }
}
