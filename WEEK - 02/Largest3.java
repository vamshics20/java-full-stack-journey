import java.util.Scanner;

public class Largest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("FIRST NUMBER : ");
        int a1 = sc.nextInt();
        System.out.print("SECOND NUMBER : ");
        int a2 = sc.nextInt();
        System.out.print("THIRD NUMBER : ");
        int a3 = sc.nextInt();
        if (a1 >= a2 && a1 >= a3) {
            System.out.println(a1 + " IS LARGEST");
        } else if (a2 >= a1 && a2 >= a3) {
            System.out.println(a2 + " IS LARGEST");
        } else {
            System.out.println(a3 + " IS LARGEST");   // only one left, so it must be a3
        }
        sc.close();
    }
}
