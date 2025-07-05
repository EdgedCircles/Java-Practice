import java.util.*;
public class Adding {
    public static void main(String [] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = sc.nextInt();
        sc.close();
        int sum = 0;
        for (int i=1; i<=n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
