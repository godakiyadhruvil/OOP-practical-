class NotSufficientFundException extends Exception {
    NotSufficientFundException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    BankAccount() {
        balance = 1000.00;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | Balance: " + balance);
    }

    void withdraw(double amount) throws NotSufficientFundException {
        if (amount > balance) {
            throw new NotSufficientFundException("Not Sufficient Fund");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount + " | Balance: " + balance);
    }
}

public class BankingApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(1000.00);

        try {
            account.withdraw(400.00);
            account.withdraw(300.00);
            account.withdraw(500.00);
        } catch (NotSufficientFundException e) {
            System.out.println(e.getMessage());
        }
    }
}
