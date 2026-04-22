class LoanCalculator {

    void calculateEMI(int principal, int time, float rate) {
        float r = rate / (12 * 100);
        int n = time * 12;
        double emi = (principal * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
        System.out.println("Home Loan EMI: " + emi);
    }

    void calculateEMI(double principal, int time, double rate) {
        double r = rate / (12 * 100);
        int n = time * 12;
        double emi = (principal * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
        System.out.println("Vehicle Loan EMI: " + emi);
    }

    void calculateEMI(int principal, int time) {
        float rate = 10.0f;
        float r = rate / (12 * 100);
        int n = time * 12;
        double emi = (principal * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
        System.out.println("Personal Loan EMI: " + emi);
    }
}

public class LoanDemo {
    public static void main(String[] args) {
        LoanCalculator loan = new LoanCalculator();

        loan.calculateEMI(500000, 20, 7.5f);
        loan.calculateEMI(300000.0, 5, 9.0);
        loan.calculateEMI(100000, 2);
    }
}
