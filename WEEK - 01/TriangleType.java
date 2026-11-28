import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("FIRST NUMBER :");
        int a = sc.nextInt();
        System.out.print("SECOND NUMBER :");
        int b = sc.nextInt();
        System.out.print("THIRD NUMBER :");
        int c = sc.nextInt();
        String name;
        if (a < b + c && b < a + c && c < a + b) {
            if (a == b && b == c && c == a) {
                name = "EQUILATORL TRIANGLE";
            } else if (a == b || b == c || c == a) {
                name = "ISOSCLES TRIANGLE";
            } else {
                name = "SCALENE TRIANGLE";
            }
            System.out.println("TRIANGLE IS " + name);
        } else {
            System.out.println("NOT A TRIANGLE");
        }
        sc.close();
    }
}



