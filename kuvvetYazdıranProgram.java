import java.util.Scanner;

public class kuvvetYazdıranProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("lütfen sınır sayısını giriniz :");
        n = input.nextInt();

        System.out.println("4'ün kuvvetleri");
        for (int i = 4; i < n; i *=4 ) {
            System.out.print(i + " ,");
        }
        System.out.println(" ");

        System.out.println("5'in kuvvetleri");
        for (int y = 5; y < n; y *=5 ) {
            System.out.print(y + " ,");
        }
    }
}
