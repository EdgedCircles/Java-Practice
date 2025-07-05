public class Hanoi {
    public static void solveTowerOfHanoi(int n, char fromPeg, char toPeg, char auxPeg) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + fromPeg + " to " + toPeg);
            return;
        } else {
            solveTowerOfHanoi(n - 1, fromPeg, auxPeg, toPeg);
            System.out.println("Move disk " + n + " from " + fromPeg + " to " + toPeg);
            solveTowerOfHanoi(n - 1, auxPeg, toPeg, fromPeg);
        }
    }
    public static void main(String[] args) {
        int numDisks = 3;
        System.out.println("Steps to solve Tower of Hanoi for " + numDisks + " disks:");
        solveTowerOfHanoi(numDisks, 'A', 'C', 'B');
}
}


