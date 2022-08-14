import java.util.*;;
class ArraySum {
    public static void main(String[] args) {
        int a[]=new int[5],b[]=new int [5],c[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 elements of array a");
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter 5 elements of array b");
        for(int i=0;i<5;i++)
        {
            b[i]=sc.nextInt();
        }
        System.out.println("Enter 5 elements of array c");
        for(int i=0;i<5;i++)
        {
            c[i]=a[i]+b[i];
        }
        System.out.println("Array C");
        for(int i=0;i<5;i++)
        {
            System.out.println(" "+c[i]);
        }
    } 
}
