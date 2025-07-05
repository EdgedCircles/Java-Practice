import java.util.Scanner;
public class Primefind {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int count = 0;
        if (n == 1) {
            System.out.println("Your number is neither composite nor prime.");
        } else {
            for (int i=1; i<=n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            System.out.println(count);
            if (count == 2) {
                System.out.println("Your number is prime.");
            } else {
                System.out.println("Your number isn't prime.");
            }
        }
    }
}
