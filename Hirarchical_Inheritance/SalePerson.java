public class SalePerson extends WageEmployee 
{
    private double sales,commission;
    public SalePerson()
    {
        super();
        sales=200000;
        commission=10;
    }
    public SalePerson(int id,String name,Date dt,int hr,int rate,int sal,int comm)
    {
        super(id,name,dt,hr,rate);
        sales=sal;
        commission=comm;
    }
    public String toString()
    {
        return super.toString()+"\tSalary= "+(computeSalary()+(sales*(commission/100)))+"\tSales ="+sales+"\tCommission ="+commission;
    }
    public static void main(String[] args) 
    {
        SalePerson sp = new SalePerson();
        System.out.println(sp);
        //System.out.println(sp.computeSalary());

        SalePerson sp2 = new SalePerson(101,"amar",new Date(15, 8, 1999),100,200,100000,10);
        System.out.println(sp2);
        //System.out.println(sp2.computeSalary());
    }
}
