import java.util.Scanner;
public class daireAlaniHesaplamaProgramı {
    public static void main(String[] args) {
        int r, a;
        double alan, pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("lütfen dairenin yarıçapını tam sayı olarak girin : ");
        r = input.nextInt();
        System.out.print("lütfen merkez ölçünüsü tam sayı olarak girin : ");
        a = input.nextInt();
        alan = (pi*r*r*a)/360;
        System.out.println("Yarıçapı = " + r + " Merkez Ölçüsü = " + a +
                " olan daire diliminin alanı = " + alan);
    }
}
