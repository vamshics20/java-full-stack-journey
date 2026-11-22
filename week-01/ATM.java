public class ATM {
    public static void main(String[] args) {
        int balance = 10000;
        int transaction = 0;
        balance -= 2500;
        transaction++;
        balance += 1200;
        transaction++;
        balance -= 700;
        transaction++;
        System.out.println("BALANCE : " + balance);
        System.out.println("TRANSACTIONS :" + transaction);
    }
}