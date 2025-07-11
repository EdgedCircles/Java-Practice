public class BubbleSort {
    static void sort(int[] a) {
        int n = a.length;
        for (int i=0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {1,5,3,7,2};
        BubbleSort.sort(a);
        int n = a.length;
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
