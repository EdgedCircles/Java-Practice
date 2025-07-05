public class Fibonacci {
    public static int fibo(int n) {
        System.out.println(n);
        if (n == 10) {
            return 10;
        } else {
            n++;
            return fibo(n);
        }
    }
    public static void main(String[] args) {
        fibo(0);
    }
}
