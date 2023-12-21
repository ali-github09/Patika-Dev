import java.util.Scanner;

public class ortalamaBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayı, sayac =0;
        double ortalama =0,toplam = 0;

        System.out.print("bir sayı giriniz : ");
        sayı = input.nextInt();

        for (int i = 1; i <= sayı; i++) {

            if(i % 3 == 0 || i % 4 == 0) {
                toplam = toplam + i;
                sayac++;
            }
        }
            ortalama = toplam / sayac;
        System.out.println(ortalama);

    }
}
