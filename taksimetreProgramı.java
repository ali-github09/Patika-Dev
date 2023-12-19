import java.util.Scanner;

public class taksimetreProgramı {
    public static void main(String[] args) {

        double km, toplamTutar, sonUcret;
        int acilisUcreti = 10;

        Scanner input = new Scanner(System.in);

        System.out.print("lütfen gitmek istediğiniz km değerini giriniz : ");
        km = input.nextInt();
        toplamTutar = acilisUcreti + (km * 2.20);

        sonUcret = toplamTutar < 20 ? 20 : toplamTutar;

        System.out.println("toplam borcunuz : " + sonUcret);
    }
}
