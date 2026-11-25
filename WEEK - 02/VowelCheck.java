import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("LETTER PLEASE :");
        char letter = sc.next().charAt(0);
        switch (letter) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U':
                System.out.println("VOWEL");
                break;
            default:
                System.out.println(("CONSTANT"));
        }
    }
}

