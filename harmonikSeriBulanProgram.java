import java.util.Scanner;

public class harmonikSeriBulanProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("bir sayı giriniz : ");
        int x = input.nextInt();
        double result = 0;

        for (int i = 1; i <=x; i++) {
            result += (1.0/i);
        }

        System.out.print("girdiğiniz sayının hrmonik değeri : " + result);
    }
}
