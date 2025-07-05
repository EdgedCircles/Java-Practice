public class Getset {
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age) {
        this.age=age;
    }
public static void main(String args[]) {
    Getset a = new Getset();
    a.setName("Hasan");
    a.setAge(15);
    System.out.println("My name is "+a.getName());
    System.out.println("My name is "+a.getAge());
}
}