import java.util.*;
public class Array2d {
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
        for( int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(" "+x[i][j]);
            }
            System.out.println();
        }

    }
    
}
