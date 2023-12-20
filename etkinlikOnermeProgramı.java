import java.util.Scanner;

public class etkinlikOnermeProgramı {
    public static void main(String[] args) {

        int temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen hava sıcaklığını giriniz: ");
        temp = input.nextInt();

        if (temp < 5) {
            System.out.println("kayak yapabilirsiniz");
        } else if (temp >= 5 && temp < 15) {

            if (temp >= 5 && temp < 10) {
                System.out.println("sinamaya gidebilirsiniz");
            } else {
                System.out.println("sinemaya gidebilir ve piknik yapabilirsiniz");
            }

        } else if (temp >= 15 && temp < 25) {
            System.out.println("piknik yapabilirsiniz");
        } else {
            System.out.println("yüzmeye gidebilirsiniz");
        }

    }
}
