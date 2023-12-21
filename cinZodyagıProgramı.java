import java.util.Scanner;

public class cinZodyagıProgramı {
    public static void main(String[] args) {

        int yıl = 0, kalan;
        String burc = "";

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen doğum yılınızı giriniz : ");
        yıl = input.nextInt();
        kalan = yıl % 12;

        if (kalan == 0) {
            burc = "maymun";
        } else if (kalan == 1) {
            burc = "horoz";
        } else if (kalan == 2) {
            burc = "köpek";
        } else if (kalan == 3) {
            burc = "domuz";
        } else if (kalan == 4) {
            burc = "fare";
        } else if (kalan == 5) {
            burc = "öküz";
        } else if (kalan == 6) {
            burc = "kaplan";
        } else if (kalan == 7) {
            burc = "tavşan";
        } else if (kalan == 8) {
            burc = "ejderha";
        } else if (kalan == 9) {
            burc = "yılan";
        } else if (kalan == 10) {
            burc = "at";
        } else if (kalan == 11) {
            burc = "koyun";
        } else {
            System.out.println("geçersiz bir yıl girdiniz.");
        }

        System.out.println("burcunuz : " + burc);

    }
}
