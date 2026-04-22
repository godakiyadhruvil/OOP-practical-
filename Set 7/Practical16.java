class SumThread extends Thread {
    private int start, end;
    private long sum = 0;

    public SumThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            sum += i;
        }
    }

    public long getSum() {
        return sum;
    }
}

public class MultiThreadSum {
    public static void main(String[] args) {
        SumThread t1 = new SumThread(1, 1000);
        SumThread t2 = new SumThread(1001, 2000);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        long finalSum = t1.getSum() + t2.getSum();

        System.out.println("Final Sum: " + finalSum);
    }
}
