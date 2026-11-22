
public class CastPractice {
    public static void main(String[] args) {
        int m1 = 17, m2 = 20, m3 = 24;
        int total = m1 + m2 + m3;
        char c = 'C';
        int code = 101;
        double avg = (double) total / 3;
        int whole = total / 3;
        System.out.println("AVERAGE :" + avg);
        System.out.println("WHOLE AVERAGE :" + whole);
        System.out.println("PREVIOUS GRADE :" + (char) (c - 1));
        System.out.println("letter :" + (char) (code));
    }
}