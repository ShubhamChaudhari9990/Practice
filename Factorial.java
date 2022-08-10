import java.util.*;
class Factorial
{
	public static void main(String args[])
	{
		int n,fact=1;
		//Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		//n=sc.nextInt();
		n=Integer.parseInt(args[0]);//Use command line argument
		//whenever run program then pass the value.
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factoial of "+n+"!= "+fact);
	}
}
		
