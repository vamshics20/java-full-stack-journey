import java.util.Scanner;

public class VoteCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("WHAT IS YOU AGE  : ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("YOU CAN VOTE");
        } else {
            System.out.println("YOU CANNOT VOTE ");
            System.out.println((18 - age) + " --YEARS LEFT");
        }

    }
}