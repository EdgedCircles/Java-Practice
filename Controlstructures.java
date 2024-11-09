public class Controlstructures {
    public static void main(String[]args) {
        int age = 15;
        boolean drivingTest = true;
        System.out.println("Welcome to the Driving Eligibility Center");
        if (age>16) {
            if (drivingTest) {
                System.out.println("ELigible!");
            }
            else {
                System.out.println("Not eligible.");
            }
        }
        else if (age<0) {
            System.out.println("Input error: no negative numbers");
        }
        else {
            System.out.println("Not eligible.");
        }

    }
}