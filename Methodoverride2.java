class Dog {
    public void bark(){
        System.out.println("Bark Bark");
    }
}

class Puppy extends Dog{
    public void bark(){
        System.out.println("Small bark");
    }
}

public class Methodoverride2 {
    public static void main(String[] args) {
        Puppy pup = new Puppy();
        pup.bark();
    }
}
