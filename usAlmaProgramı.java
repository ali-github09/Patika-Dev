import java.util.Scanner;

public class usAlmaProgramı {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // x = taban
        // y = kuvvet
        int x= 1,y=1, sonuc =1;

        System.out.print("üssü alınacak sayıyı giriniz : ");
        x = input.nextInt();
        System.out.print("üssün kaç olacağını giriniz : ");
        y = input.nextInt();

        for (int i = 1; i <= y; i++) {
            sonuc = sonuc * x;
        }

        System.out.println("sonuc : " + sonuc);

    }
}
