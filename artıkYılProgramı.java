import java.util.Scanner;

public class artıkYılProgramı {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int  yıl;

        System.out.print("lütfen bir yıl giriniz : ");
        yıl = input.nextInt();

        if ((yıl % 4) == 0 ) {

            if ((yıl % 100) == 0) {

                if (yıl % 400 == 0) {
                    System.out.println(yıl + " artık yıldır");
                } else {
                    System.out.println(yıl + " artık yıl değildir");
                }


            } else {
                System.out.println( yıl + " artık yıldır.");
            }

        } else {
            System.out.println( yıl + " artık yıl değildir.");
        }
    }
}
