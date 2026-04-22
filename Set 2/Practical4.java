class Time {
    int hours;
    int minutes;

    void setTime(int h, int m) {
        hours = h;
        minutes = m;
    }

    void displayTime() {
        System.out.println(hours + " hours " + minutes + " minutes");
    }

    void addTime(Time t1, Time t2) {
        minutes = t1.minutes + t2.minutes;
        hours = t1.hours + t2.hours + (minutes / 60);
        minutes = minutes % 60;
    }
}

public class TimeDemo {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time();
        Time result = new Time();

        t1.setTime(2, 45);
        t2.setTime(3, 30);

        result.addTime(t1, t2);

        System.out.print("Time 1: ");
        t1.displayTime();

        System.out.print("Time 2: ");
        t2.displayTime();

        System.out.print("Sum: ");
        result.displayTime();
    }
}
