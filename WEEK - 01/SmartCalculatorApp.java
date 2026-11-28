import java.util.Scanner;

public class SmartCalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== SMART UTILITY APP =====");
        System.out.println("1. Calculator");
        System.out.println("2. Grade Checker");
        System.out.println("3. Leap Year Checker");
        System.out.println("4. Even or Odd");
        System.out.println("5. Triangle Type");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter first number: ");
                double a = sc.nextDouble();
                System.out.print("Enter second number: ");
                double b = sc.nextDouble();
                System.out.print("Enter operator (+ - * /): ");
                char op = sc.next().charAt(0);
                if (op == '+') {
                    System.out.println("RESULT:" + (a + b));
                } else if (op == '-') {
                    System.out.println("RESULT:" + (a - b));
                } else if (op == '*') {
                    System.out.println("RESULT:" + (a * b));
                } else if (op == '/') {
                    if (b == 0) {
                        System.out.println("CANNOT DIVIDE BY ZERO ");
                    } else {
                        System.out.println("RESULT:" + (a / b));
                    }
                } else {
                    System.out.println("INVALID OPERATOR");
                }
                break;
            case 2:
                System.out.print("MARKS SCORED : ");
                int marks = sc.nextInt();
                if (marks < 0 || marks > 100) {
                    System.out.println("INVALID MARKS ");
                } else if (marks >= 90) {
                    System.out.println("GRADE A ");
                } else if (marks >= 75) {
                    System.out.println("GRADE B");
                } else if (marks >= 50) {
                    System.out.println("GRADE C");
                } else {
                    System.out.println("GRADE F ");
                }
                break;
            case 3:
                System.out.print("ENTER YEAR : ");
                int year = sc.nextInt();
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println(" IT IS A LEAP YEAR ");
                } else {
                    System.out.println("NOT A LEAP YEAR");
                }
                break;
            case 4:
                System.out.print("ENTER NUMBER : ");
                int num = sc.nextInt();
                String result = (num % 2 == 0) ? "EVEN" : "ODD";
                System.out.println("NUMBER IS " + result);
                break;
            case 5:
                System.out.print("FIRST NUMBER :");
                int first = sc.nextInt();
                System.out.print("SECOND NUMBER :");
                int second = sc.nextInt();
                System.out.print("THIRD NUMBER :");
                int third = sc.nextInt();
                String name;
                if (first < second + third && second < first + third && third < first + second) {
                    if (first == second && second == third && third == first) {
                        name = "EQUILATERAL TRIANGLE";
                    } else if (first == second || second == third || third == first) {
                        name = "ISOSCELES TRIANGLE";
                    } else {
                        name = "SCALENE TRIANGLE";
                    }
                    System.out.println("TRIANGLE IS " + name);
                } else {
                    System.out.println("NOT A TRIANGLE");
                }
                break;
            default:
                System.out.println("INVALID CHOICE ");
        }
        sc.close();
    }
}