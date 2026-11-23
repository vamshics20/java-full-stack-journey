import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER : ");
        int number = sc.nextInt();

        if (number == 0) {
            System.out.println("ZERO");
        } else if (number > 0) {
            System.out.println("POSITIVE");
        } else {
            System.out.println("NEGATIVE");
        }

        if (number % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }
}

