import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Marks {
    public static void main(String[] args) {
        int suba = 78;
        int subb = 85;
        int subc = 69;
        int subd = 92;
        int sube = 74;
        int sum = (suba + subb + subc + subd + sube);
        double total = 500;
        boolean pass = true;
        System.out.println("TOTAL :" + sum);
        System.out.println("PERCENTAGE :" + sum / total * 100);
        System.out.println("passed :" + pass);
    }

}