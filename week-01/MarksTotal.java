public class MarksTotal {
    public static void main(String[] args) {
        int maths = 70;
        int science = 90;
        int python = 50;
        int english = 40;
        int physics = 70;
        double total = 500;
        System.out.println("TOTAL MARKS = " + (maths + science + python + english + physics));
        System.out.println("PERCENTAGE = " + (maths + science + python + english + physics % total));

    }
}
