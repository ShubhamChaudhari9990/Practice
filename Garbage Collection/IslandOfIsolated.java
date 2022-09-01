/* To illustrate island of isolation */

public class IslandOfIsolated 
{
    IslandOfIsolated i;
    public static void main(String[] args) {
        IslandOfIsolated t1 = new IslandOfIsolated();
        IslandOfIsolated t2 = new IslandOfIsolated();
        t1.i=t2;
        t2.i=t1;
        t1=null;
        t2=null;
        System.gc();
        System.runFinalization();
    }  
    protected void finalize() throws Throwable
    {
        System.out.println("Finalize method called");
    } 
}
