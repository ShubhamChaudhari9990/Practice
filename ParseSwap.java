class ParseSwap
{
	public static void main(String args[])
        {
                int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
                a=a+b;
                b=a-b;
                a=a-b;
                System.out.println("Swapped values are a="+a+"and b="+b);
        }
}

	
