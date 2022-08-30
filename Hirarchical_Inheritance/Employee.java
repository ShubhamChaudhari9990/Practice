public class Employee 
{
    private int id;
    private String name;
    private Date dob;
    public Employee()
    {
        id=100;
        name="sumit";
        dob=new Date(1,1,2012);
    }
    public Employee(int eid,String ename,Date dt)
    {
        id=eid;
        name=ename;
        dob=dt;
    }
    public String toString()
    {
        return "id ="+id+"\tname ="+name+"\tdate ="+dob.toString();
    }
    public double computeSalary()
    {
        return 0.0;
    }
    public static void main(String[] args) {
        Employee i = new Employee(); //Default Constuctor
        System.out.println(i);
        Employee i2 = new Employee(1015, "shubham",new Date(31,3,2000));//Parameterised constuctor.
        System.out.println(i2);
    }

}
