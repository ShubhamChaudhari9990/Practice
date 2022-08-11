class Prime
{
	public static void main(String args[])
	{
		int n=10;
		int i=2;
		while(i<n)
		{
			if(n%i==0)
			{
				break;
			}
			i++;
		}
		if(i==n)
		{
			System.out.println(n+" is prime number");
		}
		else
		{
			System.out.println(n+" is not prime number");
		}
	}
}
