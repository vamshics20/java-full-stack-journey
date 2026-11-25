import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("MONTH NUMBER :");
        int month = sc.nextInt();
        System.out.print("YEAR :");
        int year = sc.nextInt();
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("31 : DAYS");
                break;
            case 4, 6, 9, 11:
                System.out.println(" 30 : DAYS");
                break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.println("LEAPYEAR :29 DAYS ");
                } else {
                    System.out.println("DAY : 28");
                }
                break;
            default:
                System.out.println("INVALID MONTH");
        }
        sc.close();
    }
}
