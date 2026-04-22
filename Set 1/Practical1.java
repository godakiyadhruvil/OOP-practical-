import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();

        int notes100, notes50, notes10, notes5, notes2, notes1;

        notes100 = amount / 100;
        amount = amount % 100;

        notes50 = amount / 50;
        amount = amount % 50;

        notes10 = amount / 10;
        amount = amount % 10;

        notes5 = amount / 5;
        amount = amount % 5;

        notes2 = amount / 2;
        amount = amount % 2;

        notes1 = amount;

        System.out.println("\nMinimum number of notes:");
        System.out.println("100 = " + notes100);
        System.out.println("50  = " + notes50);
        System.out.println("10  = " + notes10);
        System.out.println("5   = " + notes5);
        System.out.println("2   = " + notes2);
        System.out.println("1   = " + notes1);

        sc.close();
    }
}
