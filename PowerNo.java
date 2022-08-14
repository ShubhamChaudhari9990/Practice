class PowerNo 
{
    public static void main(String[] args) 
    {
	// e means exponent and r means result.
        int base=3,e=4;
        long r=1;
        while(e!=0)
        {
            r=r*base;
            --e;
        }
        System.out.println(r);
    }
    

}
