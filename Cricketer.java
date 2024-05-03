import java.util.Scanner;

public class Cricketer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("ENTER JERSEY NO: ");
        int jn = scan.nextInt();

        System.out.print("ENTER AGE: ");
        int age = scan.nextInt();

        System.out.print("ENTER RUN: ");
        int run = scan.nextInt();

        System.out.print("ENTER PINCODE: ");
        int pincode = scan.nextInt();

        if (jn >= 1 && jn <= 99) {
            if (age >= 18 && age <= 40 && age != 28) {
                if (run >= 1000 && run <= 9000) {
                    if (pincode == 411015) {
                        System.out.println("YOU ARE ELIGIBLE");
                    } else {
                        System.out.println("ENTER YOUR REFERENCE (y/n)");
                        char ref = scan.next().charAt(0);

                        if (ref == 'y' || ref == 'Y') {
                            System.out.println("ELIGIBLE");
                        } else {
                            System.out.println("YOU ARE NOT ELIGIBLE : PINCODE");
                        }
                    }

                } else {
                    System.out.println("YOU ARE NOT ELIGIBLE : RUN");
                }

            } else {
                System.out.println("YOU ARE NOT ELIGIBLE : AGE");
            }

        } else {
            System.out.println("YOU ARE NOT ELIGIBLE : JERSEY NO");
        }
        scan.close();
    }

}
