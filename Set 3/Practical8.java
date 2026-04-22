class University {
    static int totalStudents;
    static String universityName;

    static {
        universityName = "ABC University";
        System.out.println("Static block executed");
    }

    {
        System.out.println("Instance block executed");
    }

    University() {
        totalStudents++;
        System.out.println("Constructor executed");
    }

    static int getTotalStudents() {
        return totalStudents;
    }
}

public class UniversityDemo {
    public static void main(String[] args) {
        University s1 = new University();
        University s2 = new University();

        System.out.println("University Name: " + University.universityName);
        System.out.println("Total Students: " + University.getTotalStudents());
    }
}
