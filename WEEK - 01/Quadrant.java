import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("VALUE OF X :");
        int x = sc.nextInt();
        System.out.print("VALUE OF Y :");
        int y = sc.nextInt();
        String result = "";
        if (x == 0 && y == 0) {
            result = "ORIGIN";
        } else if (x == 0) {
            result = "ON Y - AXIS";
        } else if (y == 0) {
            result = "ON X - AXIS";
        } else if (x > 0 && y > 0) {
            result = "TOP RIGHT";
        } else if (x < 0 && y > 0) {
            result = "TOP LEFT";
        } else if (x > 0 && y < 0) {
            result = "BOTTOM RIGTH";
        } else {
            result = "BOTTOM LEFT";
        }
        System.out.println("POINT IS ON  " + result);
        sc.close();
    }
}