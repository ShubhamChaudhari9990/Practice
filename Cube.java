class Cube
{
	public static void main(String args[])
	{
		int ans,n=1000;
		System.out.println("Cube is="+n);
		for(int i=1;i<=20;i++)
		{
			ans=i*i*i;
			if(ans==n)
			{
				System.out.println("Cuberoot of "+n+" = "+i);
			}
		}
	}
}	
