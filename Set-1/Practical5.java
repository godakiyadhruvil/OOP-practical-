import java.util.Scanner;

public class Practical05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the three sides of the triangle:");
        System.out.print("Side a: ");
        double a = scanner.nextDouble();
        System.out.print("Side b: ");
        double b = scanner.nextDouble();
        System.out.print("Side c: ");
        double c = scanner.nextDouble();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.printf("The area of the triangle is %.2f%n", area);
        } else {
            System.out.println("Invalid input: The given sides cannot form a triangle.");
        }

        scanner.close();
    }
}
