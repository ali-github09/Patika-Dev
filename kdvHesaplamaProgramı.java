import java.util.Scanner;

public class kdvHesaplamaProgramı {

    public static void main(String[] args) {
        double fiyat, kdvTutar, sonFiyat, kdvOran;

        System.out.print("Lütfen fiyat bilgisini giriniz : ");
        Scanner input = new Scanner(System.in);

        fiyat = input.nextDouble();
        kdvOran = (fiyat < 1000.00) ? 0.18 : 0.08;
        kdvTutar = fiyat * kdvOran;
        sonFiyat = fiyat + kdvTutar;

        System.out.println("KDV'siz Fiyat =" + fiyat);
        System.out.println("KDV'li  Fiyat =" + sonFiyat);
        System.out.println("KDV Oranı = " + kdvOran);

    }
}
