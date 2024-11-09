public class Loops {
    public static void main(String [] args) {
        int test = 20;
        while(test >= 0) {
        System.out.println(test);
        test--;
        }

        for (int i=100; i>=0; i--) {
            System.out.println(i);
            }
        
        int cool = 0;
        do {
            cool++;
            System.out.println(cool);
        } while(cool == 2);
    }
}
