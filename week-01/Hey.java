import java.util.Scanner;

public class Hey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("WHAT IS YOUR NAME  :");
        String name = sc.nextLine();
        System.out.print("WHAT IS YOUR AGE :");
        int age = sc.nextInt();
        System.out.print("SEX :");
        String sex = sc.next();
        System.out.println("NEXT 1 YEARS U WIL BE :" + (age + 1));
        System.out.println("HELLO: " + name + " " + " SEX IS  : " + sex);
        sc.close();

    }
}