import java.util.Scanner;

public class EvenOdd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("GIVE A NUMBER : ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
        System.out.print("THAMK YOU USER ");
        sc.close();
    }
}