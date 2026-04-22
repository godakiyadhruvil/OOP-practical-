import java.util.Scanner;

interface Order {
    void placeOrder(String item, int qty);
    void cancelOrder(int orderId);
    void generateBill();
}

abstract class PartialOrder implements Order {
    protected String item;
    protected int qty;
    protected int orderId;
    protected double pricePerUnit = 100.0;

    public void placeOrder(String item, int qty) {
        this.item = item;
        this.qty = qty;
        this.orderId = (int)(Math.random() * 1000);
        System.out.println("Order placed successfully. Order ID: " + orderId);
    }
}

class FinalOrder extends PartialOrder {

    @Override
    public void cancelOrder(int orderId) {
        if (this.orderId == orderId) {
            System.out.println("Order " + orderId + " has been cancelled.");
            this.qty = 0;
        } else {
            System.out.println("Invalid Order ID.");
        }
    }

    @Override
    public void generateBill() {
        if (qty > 0) {
            double total = qty * pricePerUnit;
            System.out.println("Item: " + item);
            System.out.println("Quantity: " + qty);
            System.out.println("Total Bill: Rs." + total);
        } else {
            System.out.println("No active order to generate bill.");
        }
    }
}

public class OrderDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FinalOrder order = new FinalOrder();

        System.out.print("Enter item name: ");
        String item = sc.nextLine();

        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        order.placeOrder(item, qty);

        System.out.println("1. Generate Bill");
        System.out.println("2. Cancel Order");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            order.generateBill();
        } else if (choice == 2) {
            System.out.print("Enter Order ID: ");
            int id = sc.nextInt();
            order.cancelOrder(id);
        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
