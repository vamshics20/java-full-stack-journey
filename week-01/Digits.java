public class Digits {
    public static void main(String[] args) {
        int n = 5832;
        int d1 = n % 10;
        n = n / 10;
        int d2 = n % 10;
        n = n / 10;
        int d3 = n % 10;
        n = n / 10;
        int d4 = n % 10;
        System.out.println("DIGITS =" + d4 + " " + d3 + " " + d2 + " " + d1);
        System.out.println(" SUM OF DIGITS =" + (d1 + d2 + d3 + d4));
    }
}