import java.util.Scanner;
public class Primefactorize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Prime factors: ");
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.println(i + "");
                n /= i;
            }
        }
        System.out.println("");
    }
}
