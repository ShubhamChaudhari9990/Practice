/* Demonstrate the object created inside the methods will becomes
 * eligible forgc after method execution terminates.
 */

public class GCDemo1 {
    String obj;
    public GCDemo1(String obj)
    {
        this.obj=obj;
    }
    static void show()
    {
        GCDemo1 g1 = new GCDemo1("g1");
        display();
    }
    static void display()
    {
        GCDemo1 g2 = new GCDemo1("g2");
    }
    public static void main(String[] args) 
    {
        show();
        System.gc();
        System.runFinalization();
    }
    protected void finalize() throws Throwable
    {
        System.out.println(this.obj+" sucessfully");    
    }
}
