//Write a program to find the second largest element in the array.
import java.util.*;
public class SecondLargest {
    public static void findSecondLargest(int[] a) {
        int largest = a[0];
        boolean foundLargest = true;
        for (int i=0; i<a.length; i++) {
            for (int j=0; j<i; j++) {
                if (a[i]>a[j]) {
                    foundLargest = true;
                } else {
                    foundLargest = false;
                }
            }
            if (foundLargest = true) {
                largest = a[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of your array:");
        int[] a = new int[sc.nextInt()];
        System.out.println("Enter the elements of your array:");
        for (int i=0; i<a.length; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("");
        System.out.println("Largest number:");
        findSecondLargest(a);
    }
}