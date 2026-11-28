import java.util.Scanner;

public class LibraryFee1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("RETURN DAY :");
        int returndate = sc.nextInt();
        int latedays = returndate - 10;
        int latefee = 0;
        if (returndate <= 10) {
            latefee = 0;
        } else if (returndate <= 15) {
        latefee = latedays * 5;
    } else {
        latefee = (5 * 5) + (latedays - 5) * 10;
    }
        System.out.println("LATEE FEES:" + latefee);
        sc.close();
    }
}