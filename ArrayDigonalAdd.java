import java.util.*;
public class ArrayDigonalAdd {

    public static void main(String[] args) {
        //int x[][]={{1,2},{3,4}};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the reqired rows");
        int row=sc.nextInt();
        System.out.println("Enter the reqired col");
        int col=sc.nextInt();
        int x[][]=new int[row][col];
        System.out.println("Enter the elements of"+row+" and "+col+" matrix");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                x[i][j]=sc.nextInt();
            }
        }
        System.out.println("Old Matrix");
        for( int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(" "+x[i][j]);
            }
            System.out.println();
        }
        System.out.println("Addition of digonals is");
        int sum=0,n=0,m=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(i==j)
                {
                    sum=sum+x[i][j];
                }
                if(i<j)
                {
                    n=n+x[i][j];
                }
                if(j<i)
                {
                    m=m+x[i][j];
                }
            }
        }
        System.out.println("Sum of diagonals = "+sum);
        System.out.println("Sum of Upper diagonals = "+n);
        System.out.println("Sum of Lower diagonals = "+m);
    }   
}
