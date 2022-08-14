import java.util.*;
public class Addition2Array {
    public static void main(String[] args) {
        //int x[][]={{1,2},{3,4}};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the reqired rows");
        int row=sc.nextInt();
        System.out.println("Enter the reqired col");
        int col=sc.nextInt();
        int x[][]=new int[row][col];
        int y[][]=new int[row][col];
        int z[][]=new int[row][col];
        System.out.println("Enter the elements of 1st Array"+row+" and "+col+" matrix");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                x[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of 2nd Array"+row+" and "+col+" matrix");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                y[i][j]=sc.nextInt();
            }
        }
        System.out.println("1st Matrix");
        for( int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(" "+x[i][j]);
            }
            System.out.println();
        }
        System.out.println("2st Matrix");
        for( int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(" "+y[i][j]);
            }
            System.out.println();
        }
        System.out.println("Addition of two matrix is");
        for( int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                z[i][j]=x[i][j]+y[i][j];
                System.out.print(" "+z[i][j]);
            }
            System.out.println();
        }
    }
}
