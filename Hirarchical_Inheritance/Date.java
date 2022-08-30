class Date
{
    private int dd,mm,yy;//Data Abstraction.
    // public DatePrint()
    // {
    //     dd=2;
    //     mm=2;
    //     yy=2012;
    // }
    public Date(int d,int m,int y)
    {
        dd=d;
        mm=m;
        yy=y;
    }
    public String toString()
    {
        return dd+"/"+mm+"/"+yy;
    }
    public static void main(String[] args) {
        Date dt = new Date(31,3,2000);
        System.out.println(dt);
        Date dt2 = new Date(2,8,2019);
        System.out.println(dt2);
    }
}