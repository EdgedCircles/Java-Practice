import java.util.Scanner;
public class SwitchCalc {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the desired operation.");
    String operator = sc.next();
    System.out.println("Enter your first number.");
    int num1 = sc.nextInt();
    System.out.println("Enter your second number.");
    int num2 = sc.nextInt();
    sc.close();
    System.out.println("Result:");
    switch(operator) {
        case "+":
            System.out.println(num1+num2);
            break;
        case "-":
            System.out.println(num1-num2);
            break;
        case "*":
            System.out.println(num1*num2);
            break;
        case "x":
            System.out.println(num1*num2);
            break;
        case "/":
            System.out.println(num1/num2);
            break;
        default:
            System.out.println("Invalid operator.");
        }
    }
}
