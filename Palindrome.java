import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        sc.close();
        String reverseStr = "";
        for (int i=len-1; i>=0; i--) {
            reverseStr += str.charAt(i);
        }
        if (str.equals(reverseStr) == true) {
            System.out.println("It's a palindrome!");
        } else {
            System.out.println("It's not a palindrome.");
        }
    }
}
