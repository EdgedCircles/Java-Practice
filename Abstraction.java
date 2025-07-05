abstract class fruit{
    abstract void setup();
    public void showup() {
        System.out.println("Hello i am from showup");
    }
}   

class apple extends fruit {
    void setup() {
        System.out.println("HELLO I AM FROM APPLE SETUP METHOD");
    }
}

class orange extends fruit {
    void setup() {
        System.out.println("HELLO I AM FROM ORANGE SETUP METHOD");
    }
}

public class Abstraction {
    public static void main(String [] args) {
        fruit a = new apple();
        a.setup();
        fruit b = new orange();
        b.setup();
    }
}
