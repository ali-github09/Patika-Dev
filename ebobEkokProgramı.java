import java.util.Scanner;

public class ebobEkokProgramı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ilk değeri giriniz: ");
        int n1 = input.nextInt();
        System.out.print("ikinici değeri giriniz: ");
        int n2 = input.nextInt();
        int i = 1;
        int ebob = 1;
        int k =1;
        int ekok = 1;

        if ( n1 < n2) {
            while ( i < n1) {
                if ( n1%i == 0 && n2%i == 0)  {
                    ebob = i;
                }
                i++;
            }
            System.out.println("ebob : " + ebob);

            while (k < n1*n2) {
                if ( k%n1 == 0 && k%n2 == 0) {
                    ekok = k;
                }
                k++;
            }
            System.out.println("ekok : " + ekok);
        } else {
            while ( i < n2) {
                if ( n1%i == 0 && n2%i == 0)  {
                    ebob = i;
                }
                i++;
            }
            System.out.println("ebob : " + ebob);

            while (k < n1*n2) {
                if ( k%n1 == 0 && k%n2 == 0) {
                    ekok = k;
                }
                k++;
            }
            System.out.println("ekok : " + ekok);
        }
    }
}
