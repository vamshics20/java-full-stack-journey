import java.util.Scanner;

public class BioData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----BIO DATA -----");
        System.out.print("NAME :");
        String name = sc.nextLine();
        System.out.print("AGE :");
        int age = sc.nextInt();
        System.out.print("CGPA :");
        double cgpa = sc.nextDouble();
        System.out.print("SECTION :");
        char section = sc.next().charAt(0);
        System.out.print("Do you stay in hostel (true/false): ");
        boolean inHostel = sc.nextBoolean();
        System.out.println("ELIGIBLE FOR PLACEMENTS :" + (cgpa >= 7.0 && age <= 25));
        System.out.println("NAME :" + name + " " + "SECTION :" + section + " " + "IN HOSTEL" + inHostel);
        sc.close();
    }
}
