class Dog {
    String name;
    Dog(String name) {
        this.name = name;
    }
    void bark() {
        System.out.println(name + " says woof!");
    }
    static void printDogCareTips() {
        System.out.println("Dog care tip: Feed your dog twice a day and give it plenty of exercise!");
    }
}

public class StaticTest {
    public static void main(String[] args) {
        Dog.printDogCareTips();
        Dog d1 = new Dog("Buddy");
        Dog d2 = new Dog("Max");
        d1.bark();  
        d2.bark();  
    }
}

