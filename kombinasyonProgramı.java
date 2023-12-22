import java.util.Scanner;

public class kombinasyonProgramı {
    public static void main(String[] args) {

        // x = kümenin eleman sayısı
        // y = kaçlı kombinasyon istediğimizi belirten sayı
        // z = kombinasyon sayısı

        int x,y,xfakt =  1,yfakt = 1,xyfakt = 1;
        double z;

        Scanner input = new Scanner(System.in);
        System.out.print("kümenin eleman sayısını giriniz : ");
        x = input.nextInt();
        System.out.print("kaçlı kombinasyon istediğinizi giriniz : ");
        y = input.nextInt();

        for(int i = 1; i <= x; i++) {
            xfakt = xfakt * i;
        }

         for(int m = 1; m <= y; m++) {
            yfakt = yfakt * m;
        }

        for(int n = 1; n <= (x-y); n++) {
            xyfakt = xyfakt * n;
        }

        z = xfakt / (yfakt * (xyfakt));

        System.out.println("kombinasyon sayısı : " + z);


    }
}
