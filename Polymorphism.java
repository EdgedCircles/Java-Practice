import java.util.Scanner;
class car {
    public void speed(){
        System.out.println("100 mph");
    }
    public int size(){
        return 1; 
    }
}

class racecar extends car {
    public void speed(){
        System.out.println("200 mph");
    }
    public int size(int a){
        return a;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your preferred speed:");
    int a = sc.nextInt();
    racecar.speed(int a);
    sc.close();
    }
}
