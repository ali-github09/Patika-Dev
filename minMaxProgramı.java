import java.util.Scanner;

public class minMaxProgramı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen 4 adet tamsayı girin:");

        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();
        int sayi3 = input.nextInt();
        int sayi4 = input.nextInt();

        int enBuyuk = sayi1;
        int enKucuk = sayi1;


        if (sayi2 > enBuyuk) {
            enBuyuk = sayi2;
        } else if (sayi2 < enKucuk) {
            enKucuk = sayi2;
        }

        if (sayi3 > enBuyuk) {
            enBuyuk = sayi3;
        } else if (sayi3 < enKucuk) {
            enKucuk = sayi3;
        }

        if (sayi4 > enBuyuk) {
            enBuyuk = sayi4;
        } else if (sayi4 < enKucuk) {
            enKucuk = sayi4;
        }

        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);


    }
}
