import java.util.Scanner;

public class ShopBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER BILL AMOUNT : ");
        double amount = sc.nextDouble();
        double discount = 0;
        double finalprice = 0;

        if (amount >= 1000) {
            discount = amount * 10 / 100;
            finalprice = amount - discount;
            System.out.println("GIVE A 10% DISCOUNT");
        } else {
            System.out.println("THERE IS NO DISCOUNT");
            finalprice = amount - discount;
        }
        System.out.println("AMOUNT :" + amount);
        System.out.println("DiSCOUNT : " + discount);
        System.out.println("FINAL AMOUNT :" + finalprice);
        System.out.println("*****THANK FOR PURCHASE VISIT AGAIN ******");
        sc.close();
    }
}
