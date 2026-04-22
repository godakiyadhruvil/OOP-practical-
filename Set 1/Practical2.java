import java.util.Scanner;

public class DigitIncrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int num = sc.nextInt();

        int result = 0, place = 1, carry = 0;

        while (num > 0) {
            int digit = num % 10;
            int sum = digit + 1 + carry;

            carry = sum / 10;
            int newDigit = sum % 10;

            result = result + (newDigit * place);

            place = place * 10;
            num = num / 10;
        }

        if (carry > 0) {
            result = result + (carry * place);
        }

        System.out.println("Result: " + result);

        sc.close();
    }
}
