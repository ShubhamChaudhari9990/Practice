import java.util.*;
public class MathOperation {
    public static void main(String[] args) {
        int choice;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Math opertaion");
        System.out.println("Enter 1 for addition\nEnter 2 for subtraction\nEnter 3 for multiplication\nEnter 4 for division");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1 : int c=a+b;
                     System.out.println("addition of "+a+" and "+b+" = "+c);
                     break;
            case 2 : int s=a-b;
                     System.out.println("addition of "+a+" and "+b+" = "+s);
                     break;
            case 3 : int m=a*b;
                     System.out.println("addition of "+a+" and "+b+" = "+m);
                     break;
            case 4 : int d=a/b;
                     System.out.println("addition of "+a+" and "+b+" = "+d);
                     break;
            default: System.out.println("You enterd wrong choice");
        }
    }
}
