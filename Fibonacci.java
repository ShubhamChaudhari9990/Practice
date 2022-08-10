/*
		 a= 0
		 b= 1	
Fibonacci logic 0+1=1	a+b=c
		1+1=2	
		2+3=5
*/
class Fibonacci
{
    public static void main(String args[])
    {
        int f1=0,f2=1,f3,n=1;
        System.out.println(f1);
        System.out.println(f2);
        while(n<=7)
        {

            f3=f1+f2;
            System.out.println(f3);
            n++;
	    f1=f2;
            f2=f3;

        }
    }
}
