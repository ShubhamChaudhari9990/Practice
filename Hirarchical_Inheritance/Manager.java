public class Manager extends Employee 
{
    private int salary;
    public Manager()
    {
        super();
        salary=100000;
    }
    public Manager(int id,String name,Date dt,int sal)
    {
        super(id,name,dt);
        salary=sal;
    }
    public String toString()
    {
        return super.toString()+"\tSalary ="+salary;
    }
    public static void main(String[] args) {
        Manager m = new Manager();
        System.out.println(m);

        Manager m2 = new Manager(104,"mohan",new Date(12,1,1995),75000);
        System.out.println(m2);
    }
}
