import java.util.Scanner;

public class BankIntrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("BALANCE :");
        double balance = sc.nextDouble();
        System.out.print("AGE :");
        int age = sc.nextInt();
        int slab = 0;
        if (balance < 10000) {
            slab = 3;
        } else if (balance <= 50000) {
            slab = 5;
        } else {
            slab = 7;
        }
        if (age >= 60) {
            slab = slab + 1;
        }
        double intrest = balance * slab / 100;
        System.out.println("INTREST RATE :" + slab);
        System.out.println("INTREST AMOUNT: " + intrest);
        System.out.println("TOTAL AMOUNT : " + (balance + intrest));
        sc.close();
    }
}