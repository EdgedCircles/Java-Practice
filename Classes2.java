class Animal { 
    private String name; 
    private int age; 
    public Animal(String name, int age) { 
        this.name = name; this.age = age; 
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
        super(name, age); this.isIndoor = isIndoor; 
    } 
    public boolean getIsIndoor() {
        return isIndoor; 
    } 
    public void makeSound() { 
        System.out.println("The cat meows"); 
    } 
}

public class Classes2 {
    public static void main(String[] args) {
        Animal a = new Animal("Giraffe",7);
        Cat c = new Cat("Meow",7,true);
        Dog d = new Dog("Woof",7,"Dalmation");
        a.makeSound();
        c.makeSound();
        d.makeSound();
        c.getIsIndoor();
        d.getBreed();
    }
}