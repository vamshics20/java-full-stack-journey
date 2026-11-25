import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("NUMBER 1  : ");
        double a = sc.nextDouble();
        System.out.print("NUMBER 2  : ");
        double b = sc.nextDouble();
        System.out.print("OPERATION : ");
        char oper = sc.next().charAt(0);
        switch (oper) {
            case '+':
                System.out.println("OUTPUT :" + (a + b));
                break;
            case '-':
                System.out.println("OUTPUT :" + (a - b));
                break;
            case '*':
                System.out.println("OUTPUT :" + (a * b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("NOT DIVISIBLE ");
                } else {
                    System.out.println("OUTPUT :" + (a / b));
                }
                break;
            default:
                System.out.println("INVALID OPERATOR");
        }

        sc.close();
    }
}
