import java.util.Scanner;

 public class MiddleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("NUMBER 1 : ");
        int a = sc.nextInt();
        System.out.print("NUMBER 2 : ");
        int b = sc.nextInt();
        System.out.print("NUMBER 3 : ");
        int c = sc.nextInt();
        int middle;
        if ((a > b && c > a) || (a > c && b > a)) {
            middle = a;
        } else if ((b > a && c > b) || (b > c && a > b)) {
            middle = b;
        } else {
            middle = c;
        }
        System.out.println("MIDDLE NUMBER IS : " + middle);
        sc.close();
    }
}