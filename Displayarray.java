import java.util.Scanner;
public class Displayarray {
    public static void ArrayMaker(int aSize, int [] a) {
        Scanner sc = new Scanner(System.in);
        if (aSize == 0) {
            System.out.println("You entered:");
            for(int i=0; i<a.length; i++) {
                System.out.println(a[i]);
            }
            sc.close();
        } else {
            a[aSize-1] = sc.nextInt();
            ArrayMaker(aSize-1, a);
        }
    }
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of your array:");
        int aSize = sc.nextInt();
        int[] a = new int[aSize];
        System.out.println("Please enter the values of your array.");
        sc.close();
        ArrayMaker(aSize, a);
    }
}
