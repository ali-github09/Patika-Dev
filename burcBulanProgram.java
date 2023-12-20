import java.util.Scanner;

public class burcBulanProgram {
    public static void main(String[] args) {

        int day, month;
        String burc = null;
        boolean isError = true;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaçıncı ayda doğduğunuzu giriniz : ");
        month = input.nextInt();
        System.out.print("Ayın kaçında doğduğunuzu giriniz : ");
        day = input.nextInt();

        if (month == 1) {
            if (day < 1 || day > 31) {
                isError = false;
            } else if (day <= 21) {
                burc = "oğlak";
            } else {
                burc = "kova";
            }
        } else if (month == 2) {
            if (day < 1 || day > 31) {
                isError = false;
            } else if (day <= 19) {
                burc = "kova";
            } else {
                burc = "balık";
            }
        } else if (month == 3) {
            if (day < 1 || day > 31) {
                isError = false;
            } else if (day <= 20) {
                burc = "balık";
            } else {
                burc = "koç";
            }
        } else if (month == 4) {
            if (day < 1 || day > 31) {
                isError = false;
            } else if (day <= 20) {
                burc = "koç";
            } else {
                burc = "boğa";
            }
        } else if (month == 5) {
            if (day < 1 || day > 31) {
                isError = false;
            } else if (day <= 21) {
                burc = "boğa";
            } else {
                burc = "ikizler";
            }
        } else if (month == 6) {
            if (day < 1 || day > 31) {
                isError = false;
            } else if (day <= 22) {
                burc = "ikizler";
            } else {
                burc = "yengeç";
            }
        } else if (month == 7) {
            if (day < 1 || day > 31) {
                isError = false;
            } else if (day <= 22) {
                burc = "yengeç";
            } else {
                burc = "aslan";
            }
        } else if (month == 8) {
            if (day < 1 || day > 31) {
                isError = false;
            } else if (day <= 22) {
                burc = "aslan";
            } else {
                burc = "başak";
            }
        } else if (month == 9) {
            if (day < 1 || day > 31) {
                isError = false;
            } else if (day <= 22) {
                burc = "başak";
            } else {
                burc = "terazi";
            }
        } else if (month == 10) {
            if (day < 1 || day > 31) {
                isError = false;
            } else if (day <= 22) {
                burc = "terazi";
            } else {
                burc = "akrep";
            }
        } else if (month == 11) {
            if (day < 1 || day > 31) {
                isError = false;
            } else if (day <= 21) {
                burc = "akrep";
            } else {
                burc = "yay";
            }
        } else if (month == 12) {
            if (day < 1 || day > 31) {
                isError = false;
            } else if (day <= 21) {
                burc = "yay";
            } else {
                burc = "oğlak";
            }
        } else {
            System.out.println("geçersiz bir sayı girdiniz");
        }

        if (isError) {
            System.out.println("burcunuz : " + burc);
        } else {
            System.out.println("Geçersiz gün girdiniz.");
        }
    }
}
