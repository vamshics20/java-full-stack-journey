import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YOUR MARKS :");
        int marks = sc.nextInt();
        if (marks < 0 || marks > 100) {
            System.out.println("INVALID MARKS");
        } else if (marks >= 90) {
            System.out.println("GRADE A BRILLIANT ");
        } else if (marks >= 75) {
            System.out.println("GRADE B");
        } else if (marks >= 50) {
            System.out.println("GRADE C");
        } else {
            System.out.println("GRADE F");
        }
        System.out.println("***ALL THE BEST DO WELL***");
        sc.close();

    }
}