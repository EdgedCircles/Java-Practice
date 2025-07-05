import java.util.*;
public class Arraylist2 {
    public static void main(String[] args) {
        ArrayList<Integer> ints= new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter values:");
        while(sc.nextLine() != "Stop") {
            ints.add(sc.nextInt());
        }
        System.out.println("Values entered: "+ints.get(4)+", "+ints.get(3)+", "+ints.get(2)+", "+ints.get(1)+", "+ints.get(0));
        sc.close();
    }
}