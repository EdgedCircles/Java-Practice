// Remove Duplicates from Array (Keep First Occurrence)

import java.util.*;
public class Duplicate {
    public static void removeDuplicates(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (isDuplicate == false) {
                System.out.println(nums[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how long you want your array to be:");
        int[] a = new int[sc.nextInt()];
        if (a.length == 1) {
            System.out.println("Array is too short. Please enter more than 1 value.");
        } else {
            System.out.println("");
            System.out.println("Enter the elements of your array:");
            for(int i=0; i<a.length; i++) {
                a[i]=sc.nextInt();
            }
            sc.close();
            System.out.println("");
            System.out.println("Duplicates removed.");
            removeDuplicates(a);
        }
    }
}
