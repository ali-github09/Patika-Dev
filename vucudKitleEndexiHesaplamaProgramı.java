import java.util.Scanner;
public class vucudKitleEndexiHesaplamaProgramı {
    public static void main(String[] args) {

        double boy, kilo, vucudKitleEndexi;

        Scanner input = new Scanner(System.in);

        System.out.print("lütfen kilonuzu giriniz : ");
        kilo = input.nextDouble();

        System.out.print("lütfen boyunuzu giriniz : ");
        boy =input.nextDouble();

        vucudKitleEndexi = kilo / (boy*boy);
        System.out.println("Vücut Kitle Endeksiniz : " + vucudKitleEndexi);

    }
}
