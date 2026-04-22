import java.util.Scanner;

class BankAccount {
    String accountId;
    String accountHolderName;
    double balance;

    void assignValues(String id, String name, double bal) {
        accountId = id;
        accountHolderName = name;
        balance = bal;
    }

    void displayValues() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("---------------------------");
    }

    static void searchAccount(BankAccount[] accounts, String searchId) {
        boolean found = false;

        for (BankAccount acc : accounts) {
            if (acc.accountId.equals(searchId)) {
                System.out.println("Account Found:");
                acc.displayValues();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Account not found.");
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount[] accounts = new BankAccount[5];

        accounts[0] = new BankAccount();
        accounts[0].assignValues("A101", "Rahul", 5000);

        accounts[1] = new BankAccount();
        accounts[1].assignValues("A102", "Priya", 7500);

        accounts[2] = new BankAccount();
        accounts[2].assignValues("A103", "Amit", 6200);

        accounts[3] = new BankAccount();
        accounts[3].assignValues("A104", "Sneha", 8800);

        accounts[4] = new BankAccount();
        accounts[4].assignValues("A105", "Karan", 4300);

        System.out.println("All Accounts:");
        for (BankAccount acc : accounts) {
            acc.displayValues();
        }

        System.out.print("Enter Account ID to search: ");
        String searchId = sc.nextLine();

        BankAccount.searchAccount(accounts, searchId);

        sc.close();
    }
}
