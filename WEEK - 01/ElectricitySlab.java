import java.util.Scanner;

public class ElectricitySlab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("UNITS CONUSMED :");
        int units = sc.nextInt();
        if (units < 0) {
            System.out.println("Invalid units");
        } else {
            double bill;
            if (units <= 100) {
                bill = units * 1.5;
            } else if (units <= 200) {
                bill = 150 + (units - 100) * 2.5;
            } else if (units <= 300) {
                bill = 400 + (units - 200) * 4.0;
            } else {
                bill = 800 + (units - 300) * 6.0;
            }
            bill = bill + 50;
            System.out.println("TOTAL PRICE : " + bill);
        }
        sc.close();
    }
}
