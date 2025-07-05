import java.util.Scanner;
public class Primerange {
    public static void main (String [] args) {
        System.out.println("Enter a range to begin:");
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        sc.close();
        System.out.println("-----------------------");
        int count = 0;
        int n = 1;
        int i = 1;
        if (range == 1) {
            System.out.println("Not a valid range! Must be 2 or above");
        } else {
            for (n=2; n<=range; n++) {
                   for (i=1; i<=n; i++) {
                       if (n % i == 0) {
                           count++;
                       }
                   }
                   if (count == 2) {
                       System.out.println(n);
                   }
                   count=0;
               }
            }
        }
    }
