import java.util.Scanner;

public class Practical03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single letter: ");
        String input = scanner.next();

        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            System.out.println("Invalid input.");
        } else {
            char ch = Character.toLowerCase(input.charAt(0));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(input.charAt(0) + " is a vowel.");
            } else {
                System.out.println(input.charAt(0) + " is a consonant.");
            }
        }

        scanner.close();
    }
}
