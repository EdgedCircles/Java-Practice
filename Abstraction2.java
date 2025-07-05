abstract class Dog {
    abstract void bark();
    public void walk() {
        System.out.println("Walking");
    }
}

class Puppy extends Dog{
    void bark() {
        System.out.println("small bark");
    }
}
public class Abstraction2 {
    public static void main(String[] args) {
    Dog max = new Puppy();
    max.bark();
    }
}
