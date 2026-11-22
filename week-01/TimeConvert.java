public class TimeConvert {
    public static void main(String[] args) {
        int totalSeconds = 7385;
        System.out.println("HOURS = " + totalSeconds / 3600);
        System.out.println(("MINUTES =" + (totalSeconds % 3600) / 60));
        System.out.println("SECONDS =" + (totalSeconds % 60));
    }
}

