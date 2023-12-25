import java.util.Scanner;

public class tersYıldızProgramı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("lütfen basamak sayısını giriniz : ");
        int n = input.nextInt();

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
