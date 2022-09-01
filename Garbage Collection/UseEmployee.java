/* Count the numbers of employee */

class Employee 
{
    private int id;
    private String name;
    private int age;
    private static int nextId=1;
    public Employee(String name,int age)
    {
        this.name=name;
        this.age=age;
        this.id=nextId++;
    }
    public void show()
    {
        System.out.println("ID ="+id+"\nname ="+name+"\nAge ="+age);
    }
    public void showNextId()
    {
        System.out.println("Next emp id will be"+nextId);
    }
    protected void finalize()
    {
        --nextId;
    }
}
public class UseEmployee
{
    public static void main(String[] args) {
        Employee e = new Employee("shubham", 20);
        Employee e2 = new Employee("nikhil", 21);
        Employee e3 = new Employee("Shreyash", 22);
        e.show();
        e2.show();
        e3.show();
        e.showNextId();
        e2.showNextId();
        e3.showNextId();
        {
            Employee x = new Employee("Patil", 23);
            Employee y = new Employee("Tejas", 24);
            x.show();
            y.show();
            x.showNextId();
            y.showNextId();
            x=y=null;
            System.gc();
            System.runFinalization();
        }
        e.showNextId();
    }
}
