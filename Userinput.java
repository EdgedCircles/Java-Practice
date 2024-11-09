import java.util.*;
public class Userinput {
    public static void main(String [] args) {
        int a;
        String b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        a=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a name: ");
        b=sc.nextLine();
        sc.close();
        System.out.println("My name is "+" "+b);
        System.out.println("My age is "+" "+a);
    }
}
