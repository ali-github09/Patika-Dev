import java.util.Scanner;

public class hipotenusProgramı {

    public static void main(String[] args) {

        int a, b, c;
        double alan, u;

        System.out.print("lütfen 1. kenar uzunluğunu girin : ");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();

        System.out.print("lütfen 2. kenar uzunluğunu girin : ");
        b = input.nextInt();

        System.out.print("lütfen 3. kenar uzunluğunu girin : ");
        c = input.nextInt();

        u = (a+b+c) / 2;
        alan = Math.sqrt( u * (u-a) * (u-b) * (u-c) );

        System.out.println("üçgenin alanı : " + alan);


    }
}
