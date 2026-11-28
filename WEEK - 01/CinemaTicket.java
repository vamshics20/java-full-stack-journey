import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("AGE :");
        int age = sc.nextInt();
        int rate = 0;
        if (age < 5) {
            rate = 0;
            System.out.println("CHLD");
        } else if (age >= 60) {
            rate = 100;
            System.out.println("SENIOR");
        } else {
            rate = 150;
            System.out.println("ADULT");
        }
        System.out.println("TICKETE PRICE : ₹" + rate);
        sc.close();


    }
}