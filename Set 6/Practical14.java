public class AverageDemo {

    static double average(String[] values) throws NullPointerException, NumberFormatException {
        double sum = 0;

        for (String val : values) {
            if (val == null) {
                throw new NullPointerException("Null value found");
            }
            sum += Double.parseDouble(val);
        }

        return sum / values.length;
    }

    public static void main(String[] args) {

        
        String[] valid = {"10", "20", "30"};

        
        String[] invalidNumber = {"10", "abc", "30"};

        
        String[] invalidNull = {"10", null, "30"};

        try {
            System.out.println("Average (Valid): " + average(valid));
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Finished valid test\n");
        }

        try {
            System.out.println("Average (Invalid Number): " + average(invalidNumber));
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        } finally {
            System.out.println("Finished invalid number test\n");
        }

        try {
            System.out.println("Average (Null Value): " + average(invalidNull));
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        } finally {
            System.out.println("Finished null test");
        }
    }
}
