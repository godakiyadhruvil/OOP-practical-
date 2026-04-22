import java.util.Scanner;

public class Practical02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coefficients a, b, c, d, e, f for the equations:");
        System.out.println("ax + by = e");
        System.out.println("cx + dy = f");

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();
        System.out.print("Enter d: ");
        double d = scanner.nextDouble();
        System.out.print("Enter e: ");
        double e = scanner.nextDouble();
        System.out.print("Enter f: ");
        double f = scanner.nextDouble();

        double determinant = (a * d) - (b * c);

        if (determinant == 0) {
            System.out.println("The equation has no unique solution.");
        } else {
            double x = ((e * d) - (b * f)) / determinant;
            double y = ((a * f) - (c * e)) / determinant;

            System.out.printf("x = %.2f%n", x);
            System.out.printf("y = %.2f%n", y);
        }

        scanner.close();
    }
}
