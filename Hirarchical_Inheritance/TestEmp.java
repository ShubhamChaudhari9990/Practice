public class TestEmp
{
    public static void main(String[] args) {
        Employee e[] = new Employee[3];
        //Employee ee = new Employee();
        //WageEmployee we = new WageEmployee();
        Employee we2 = new WageEmployee();
        e[0] = new WageEmployee();
        e[1] = new SalePerson();
        e[2] = new Manager();
        for(int i=0;i<e.length;i++)
        {
            System.out.println(e[i]);
            System.out.println(we2.computeSalary());
        }
    } 
}