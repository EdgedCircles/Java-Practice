import java.util.*;
public class MinMax {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int min,max,number;
	    char continueInput;
	    System.out.println("Enter a number: ");
	    number=sc.nextInt();
	    min=max=number;
	    do{
	        System.out.println("Enter another number:");
	        number=sc.nextInt();
	        if(number<min)
	        {
	            min=number;
	        }
	        if(number>max){
	            max=number;
	        }
	        System.out.println("Do you want to keep going : (y/n): ");
	        continueInput=sc.next().charAt(0);
	    }while(continueInput=='y' || continueInput=='Y');
        sc.close();
	    System.out.println("Minimum number is "+min);
	    System.out.println("Maximum number is "+max);
	}
}

