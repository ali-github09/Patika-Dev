import java.util.Scanner;

public class yıldızProgramı {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int n = klavye.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        for (int m = 0; m <= (n-1); m++) {

            for (int y =1; y <= (m+1); y++) {
                System.out.print(" ");
            }
            for (int z = (2 *n -(2 *m +1)); z >=1; z--) {
                System.out.print("*");

            }
            System.out.println(" ");
            }


        }
    }

