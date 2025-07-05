class Person { 
    private String name;
    private int age; 
    private String major;  
    public Person(String n, int a, String m) { 
        name = n; age = a; major = m; 
    } 
    public String getName() { 
        return name; 
    } 
    public int getAge() { 
        return age; 
    } 
    public String getMajor() { 
        return major; 
    } 
}

public class Constructors {
    public static void main(String[] args) {
        Person student = new Person("Bob",15,"biology");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Major: " + student.getMajor());
    }
}

