import java.util.*;
public class ArrayMarksAvg {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter 5 marks");
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        double avg=(double)sum/5;
        for(int i=0;i<a.length;i++)
        {
            System.out.println(""+a[i]);
        }
        System.out.println("Total marks ="+sum+" and avg ="+avg);
    }
    
}
