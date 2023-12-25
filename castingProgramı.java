import java.util.Scanner;

public class castingProgramı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("bi tam sayı giriniz : ");
         int tamsayi = input.nextInt();

        System.out.print("bir ondalıklı sayı giriniz : ");
        double ondalıklısayı = input.nextDouble();

    double yenitamsayı = tamsayi;
    int yeniondalıklısayı = (int)ondalıklısayı;

        System.out.println(yenitamsayı);
        System.out.println(yeniondalıklısayı);



    }
}
