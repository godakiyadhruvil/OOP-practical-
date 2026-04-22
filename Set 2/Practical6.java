import java.util.Scanner;

class BillGenerator {

    void generateBill(int itemTotal) {
        System.out.println("Final Bill Amount: " + itemTotal);
    }

    void generateBill(int itemTotal, int discount) {
        int finalAmount = itemTotal - discount;
        System.out.println("Final Bill Amount: " + finalAmount);
    }

    void generateBill(int itemTotal, double discountPercent) {
        double finalAmount = itemTotal - (itemTotal * discountPercent / 100);
        System.out.println("Final Bill Amount: " + finalAmount);
    }
}

public class BillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BillGenerator bill = new BillGenerator();

        System.out.print("Enter total amount: ");
        int total = sc.nextInt();

        System.out.println("Select Customer Type:");
        System.out.println("1. Regular");
        System.out.println("2. Privileged");
        System.out.println("3. Festive Offer");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                bill.generateBill(total);
                break;

            case 2:
                System.out.print("Enter discount (in rupees): ");
                int discount = sc.nextInt();
                bill.generateBill(total, discount);
                break;

            case 3:
                System.out.print("Enter discount percentage: ");
                double percent = sc.nextDouble();
                bill.generateBill(total, percent);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
