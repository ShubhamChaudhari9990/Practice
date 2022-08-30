public class WageEmployee extends Employee
{
    private int hr,rate;
    public WageEmployee()
    {
        super();
        hr=100;
        rate=200;
    }
    public WageEmployee(int id,String name,Date dt,int hr,int rate)
    {
        super(id,name,dt);
        this.hr=hr;
        this.rate=rate;
    }
    public String toString()
    {
        return super.toString()+"\thr = "+hr+"\trate = "+rate;
    }
    public double computeSalary()
    {
        return hr*rate;
    }
    public static void main(String[] args) {
        WageEmployee we = new WageEmployee();
        System.out.println(we.computeSalary());
        System.out.println(we);

        WageEmployee we2 = new WageEmployee(1100,"amit",new Date(21,3,2000),120,250);
        System.out.println(we2.computeSalary());
        System.out.println(we2);
    }
}
