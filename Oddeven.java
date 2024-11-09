import java.util.*;
public class Oddeven {
    public static void main(String [] args) {
        Scanner sc=new Scanner(System.in);
        String userInput;
        System.out.print("Enter a number or type 'exit' to stop: ");
        while (true) {
        userInput = sc.nextLine();
        if(userInput.equalsIgnoreCase("exit")) {
            System.out.println("Exited.");
            break;
        } else {
            try {
                checkNumber(Integer.parseInt(userInput));
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
        }
        sc.close();
    }
    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("Your number is positive.");
            if ((number / 2)*2 == number) {
                System.out.println("Your number is even.");
            }
            else {
                System.out.println("Your number is odd.");
            }
        } else if (number==0) {
            System.out.println("Your number is 0 - it's neither odd nor even!");
            if ((number / 2)*2 == number) {
                System.out.println("Your number is even.");
            }
            else {
                System.out.println("Your number is odd.");
            }
        } else {
            System.out.println("Your number is negative.");
            if ((number / 2)*2 == number) {
                System.out.println("Your number is even.");
            }
            else {
                System.out.println("Your number is odd.");
            }
        }    
    }
}
