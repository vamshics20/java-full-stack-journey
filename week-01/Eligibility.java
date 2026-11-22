public class Eligibility {
    public static void main(String[] args) {
        int age = 22;
        double cgpa = 6.5;
        boolean hasBacklogs = false;
        boolean eligible = ((age >= 21 && age <= 28) && (cgpa >= 6.5) && !(hasBacklogs));
        System.out.println("ELIGIBLE = " + eligible);
    }
}