import java.util.*;
public class CompoundIntrest {
    public static void main(String[] args) {
        double p,t,ci,n;
        float i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Principle number");
        p=sc.nextInt();
        System.out.println("Enter intrest rate");
        i=sc.nextFloat();
        System.out.println("Enter time year");
        t=sc.nextInt();
        n=12;
        ci =p*(Math.pow((1+i/n),n*t))-p;
        System.out.println(ci);
    }   
}
