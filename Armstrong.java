import java.util.*;
class Armstrong
{
	public static void main(String[] args)
	{
		int d;
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();*/
		for(int i=1;i<=1000000;i++)
		{
			//int m=n;
			int j=i;
			int sum=0;
			while(j>0)
			{
				d=j%10;
				//n=j/10;
				sum=sum+d*d*d;
				j=j/10;
			}
			if(i==sum)
			{
				System.out.println(i+" is Armstrong number");
			}
			/*else
			{
				System.out.println(j+" is not Armstrong number");
			}*/
		}
	}
}
			
