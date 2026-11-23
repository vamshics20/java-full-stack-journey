import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ARE YOU MARRIED : ");
        String name = sc.next();
        sc.close();
        String relation = "wife";
        if (relation.equals("wife")) {
            System.out.println("BABY");
        } else
            System.out.println("hello baby");
        System.out.println("MARRIED : " + relation);
    }
}