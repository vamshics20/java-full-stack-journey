import java.util.Scanner;

public class BusTicket1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("DISTANCE : ");
        int distance = sc.nextInt();
        System.out.print("STUDENT Y/N : ");
        char student = sc.next().charAt(0);
        double fare = distance * 2;
        if (student == 'Y' || student == 'y') {
            fare = fare / 2;
        }
        if (fare < 10) {
            fare = 10;
        }
        System.out.println("TOTAL FARE :" + fare);
        sc.close();
    }
}