import java.util.Scanner;

public class Practical04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double pounds = scanner.nextDouble();

        System.out.print("Enter height in inches: ");
        double inches = scanner.nextDouble();

        double kgs = pounds * 0.45359237;
        double meters = inches * 0.0254;

        double bmi = kgs / (meters * meters);

        System.out.printf("Body Mass Index is %.4f%n", bmi);

        scanner.close();
    }
}
