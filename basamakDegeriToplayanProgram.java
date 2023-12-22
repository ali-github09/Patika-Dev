import java.util.Scanner;

public class basamakDegeriToplayanProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("bir sayı giriniz : ");
        int a = input.nextInt();
        int basDegeri= 0;
        int toplam = 0;

        while (a != 0) {
            basDegeri = a % 10;
            toplam = toplam + basDegeri;
            a /= 10;
        }
        System.out.println("giridğiniz sayının basamak değerleri toplamı : " + toplam);

    }
}
