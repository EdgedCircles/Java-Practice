public class Kadane {
    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;

        current_sum = Math.max(-2, 0 + (-2)); 
        max_sum = Math.max(Integer.MIN_VALUE, -2); 

        current_sum = Math.max(1, -2 + 1); 
        max_sum = Math.max(-2, 1); 

        current_sum = Math.max(-3, 1 + (-3)); 
        max_sum = Math.max(1, -2); 

        current_sum = Math.max(4, -2 + 4); 
        max_sum = Math.max(1, 4); 

        current_sum = Math.max(-1, 4 + (-1)); 
        max_sum = Math.max(4, 3); 

        current_sum = Math.max(2, 3 + 2); 
        max_sum = Math.max(4, 5); 

        current_sum = Math.max(1, 5 + 1); 
        max_sum = Math.max(5, 6); 

        current_sum = Math.max(-5, 6 + (-5)); 
        max_sum = Math.max(6, 1); 

        current_sum = Math.max(4, 1 + 4); 
        max_sum = Math.max(6, 5);

        System.out.println("Maximum Sum: " + max_sum); 
    }
}
