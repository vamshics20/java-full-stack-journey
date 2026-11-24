import java.util.Scanner;

public class LeapYearBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("YEAR PLEASE : ");
        int years = sc.nextInt();
        String year = (years % 4 == 0 && years % 100 != 0) || (years % 400 == 0) ? "LEAP YEAR" : "NOT A LEAP YEAR";
        System.out.println(year);
        sc.close();
    }
}
