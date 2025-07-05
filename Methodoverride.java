class Father {
    public void displayInfo() {
        System.out.println("123");
    }
    }
    
    class Son extends Father {
    //Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("ABC");
    }
    }

public class Methodoverride {
    public static void main(String[] args) {
        //upcasting
        Father bob = new Son();
        bob.displayInfo(); 
        }
}
