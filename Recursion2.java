public class Recursion2 {
    public static int nums(int n) {
        System.out.println(n);
        if (n == 1) {
            return 1;
        } else {
            n --;
            return nums(n);
        }
    }
    public static void main(String[] args) {
        int value = 5;
        nums(value);
    }
}
