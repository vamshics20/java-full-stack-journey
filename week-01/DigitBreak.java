public class DigitBreak {
    public static void main(String[] args) {
        int n = 9351;
        int d1 = (n % 10);
        n = n / 10;
        System.out.println(d1);
        int d2 = (n % 10);
        n = n / 10;
        System.out.println(d2);
        int d3 = (n % 10);
        n = n / 10;
        System.out.println(d3);
        int d4 = (n % 10);
        System.out.println(d4);
        System.out.println("SUM :" + (d1 + d2 + d3 + d4));
    }
}
