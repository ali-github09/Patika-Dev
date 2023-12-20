import java.util.Scanner;
public class aritmetikIslemlerProgrmı {
    public static void main(String[] args) {

        int a,b,c;

        System.out.print("lütfen 1. sayıyı giriniz : ");
        Scanner input = new Scanner(System.in);

        a = input.nextInt();
        System.out.print("lütfen 2. sayıyı giriniz : ");
        b = input.nextInt();
        System.out.print("lütfen 3. sayıyı giriniz : ");
        c = input.nextInt();

        int sonuc = a + b * c - b;
        System.out.println("sonuç = " + sonuc);
    }
}
