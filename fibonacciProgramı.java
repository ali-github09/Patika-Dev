import java.util.Scanner;

public class fibonacciProgramı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisi için kaç eleman istiyorsunuz? ");
        int elemanSayisi = input.nextInt();

        System.out.println("Fibonacci serisi:");

        int fib1 = 0, fib2 = 1;

        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(fib1 + " ");
            int toplam = fib1 + fib2;
            fib1 = fib2;
            fib2 = toplam;
        }



    }
}
