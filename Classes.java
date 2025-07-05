class Animal {
    public void sound() {
        System.out.println("Hola I am an animal");
    }
}
class Cow extends Animal{
    public void moo() {
        System.out.println("I am a cow. MOO");
    }
}
class Cat extends Animal{
    public void meow() {
        System.out.println("I am a cat. Meow");
    }
}
class Dog extends Animal{
    public void barks() {
        System.out.println("I am a dog I bark");
    }
}
class Puppy extends Dog{
    public void small_bark() {
        System.out.println("I am a puppy. I bark less.");
    }
}

public class Classes {
    public static void main(String args[]) {
        Dog dog = new Dog();
        dog.barks();
        dog.sound();
        Puppy puppy = new Puppy();
        puppy.small_bark();
        puppy.sound();
        Cow cow = new Cow();
        cow.moo();
        cow.sound();
        Cat cat = new Cat();
        cat.meow();
    }
}
