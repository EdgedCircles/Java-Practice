class Animal {
    private String name;
    private int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    private String breed;
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    private boolean isIndoor;
    public Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }
    public boolean getIsIndoor() {
        return isIndoor;
    }
    public void makeSound() {
        System.out.println("The cat meows");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", 5);
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");    
        Cat cat = new Cat("Whiskers", 2, true);  
        animal.makeSound(); 
        dog.makeSound();
        cat.makeSound();
        System.out.println("Animal: " + animal.getName() + ", Age: " + animal.getAge());
        System.out.println("Dog: " + dog.getName() + ", Age: " + dog.getAge() + ", Breed: " + dog.getBreed());
        System.out.println("Cat: " + cat.getName() + ", Age: " + cat.getAge() + ", Is Indoor: " + cat.getIsIndoor());
    }
}
