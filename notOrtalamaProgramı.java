import java.util.Scanner;

public class notOrtalamaProgramı {
    public static void main(String[] args) {
        int mat, fizik, kimya, tarih, edebiyat;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz : ");
        mat = input.nextInt();
        System.out.print("Fizik notunuzu giriniz : ");
        fizik = input.nextInt();
        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();
        System.out.print("Tarih notunuzu giriniz : ");
        tarih = input.nextInt();
        System.out.print("Edebiyat notunuzu giriniz : ");
        edebiyat = input.nextInt();

        double ortalama = (mat + fizik + kimya + tarih + edebiyat) / 6.0;
        String sonuc = (ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sonuc);








    }
}
