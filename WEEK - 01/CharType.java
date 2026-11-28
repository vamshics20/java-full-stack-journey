import java.util.Scanner;

public class CharType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("CHARACTER  : ");
        char info = sc.next().charAt(0);
        if (info >= 'A' && info <= 'Z') {
            System.out.println("CAPITAL LETTERS");
        } else if (info >= 'a' && info <= 'z') {
            System.out.println("SMALL LETTERS");
        } else if (info >= '0' && info <= '9') {
            System.out.println("NUMBERS");
        } else {
            System.out.println("SYMBOLS");
        }
        sc.close();
    }
}