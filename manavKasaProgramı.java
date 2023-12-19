import java.util.Scanner;

public class manavKasaProgramı {

    public static void main(String[] args) {

        int armutkg,  elmakg, domateskg,  muzkg, patlicankg;
        double armutfiyat, elmafiyat, domatesfiyat, patlicanfiyat, muzfiyat, toplam;

        Scanner input = new Scanner(System.in);

        System.out.print("lütfen kaç kilo armut almak istediğinizi yazınız : ");
        armutkg = input.nextInt();
        System.out.print("lütfen kaç kilo elma almak istediğinizi yazınız : ");
        elmakg = input.nextInt();
        System.out.print("lütfen kaç kilo domates almak istediğinizi yazınız : ");
        domateskg = input.nextInt();
        System.out.print("lütfen kaç kilo muz almak istediğinizi yazınız : ");
        muzkg = input.nextInt();
        System.out.print("lütfen kaç kilo patlican almak istediğinizi yazınız : ");
        patlicankg = input.nextInt();

        armutfiyat = armutkg * 2.14;
        elmafiyat = elmakg * 3.67;
        domatesfiyat = domateskg * 1.11;
        muzfiyat = muzkg * 0.95;
        patlicanfiyat = patlicankg * 5.0;

        toplam = armutfiyat + elmafiyat + domatesfiyat + muzfiyat + patlicanfiyat;

        System.out.println("Toplam Tutar : " + toplam);

    }
}
