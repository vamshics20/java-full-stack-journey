public class LogicalOperators {
    public static void main(String[] args) {
        int age = 24;
        double cgpa = 7.2;
        System.out.println(age >= 21 && cgpa >= 6.0);
        System.out.println(age < 18 || cgpa >= 7.0);
        System.out.println(!(age >= 21));
        System.out.println(age == 24 && cgpa == 7.2);
        System.out.println(age >= 25 || cgpa != 7.5);
        System.out.println(age >= 27 && !(age == 25));
    }
}
