public class Methodoverload {
    public int add(int a, int b) {
        return(a+b);
    }
    public int add(int a, int b, int c) {
        return(a+b+c);
    }
    public static void main(String[] args){
        Methodoverload a = new Methodoverload();
        System.out.println(a.add(10,32));
        System.out.println(a.add(17,9,10));
    }
}
